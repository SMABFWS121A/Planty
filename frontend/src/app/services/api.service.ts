import { Injectable } from '@angular/core';

import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';

@Injectable()
export class GitHubService {

  baseURL: string = "https://api.github.com/";

  constructor(private http: HttpClient) {
  }

  getRepos(endPoint: string | undefined): Observable<any> {
    return this.http.get(this.baseURL + endPoint)
  }

}






