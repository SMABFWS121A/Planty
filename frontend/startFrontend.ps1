# Make sure user is in frontend directory
$WD = Get-Location;
$WD = Convert-Path $WD;

# If $WD ends with "frontend"
if(-not $WD.EndsWith("\frontend")) {
    Write-Host "Please make sure you are in the frontend directory" -ForegroundColor Red;
    exit;
}

# Build docker image
docker build -t planty-frontend .

# Run yarn install inside container
docker run -it --rm --name planty-frontend -v ${WD}:/app planty-frontend yarn install

# Run frontend inside container
docker run -itd --rm --name planty-frontend -v ${WD}:/app -p 4200:4200 planty-frontend ng serve --poll 2000 --disable-host-check --host 0.0.0.0
docker logs -f planty-frontend