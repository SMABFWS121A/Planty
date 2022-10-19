#include <WiFi.h>
#include <HTTPClient.h>

const char* ssid = "REPLACE_WITH_YOUR_SSID";
const char* password = "REPLACE_WITH_YOUR_PASSWORD";

//Domain name with URL path or IP address with path
const char* serverName = "http://127.0.0.1:1880/update-sensor";

unsigned long lastTime = 0;
unsigned long timerDelay = 50000;
const char* sensorGPIO = "A0";


void setup() {
  Serial.begin(9600);
  WiFi.begin(ssid, password);
  Serial.println("Connecting");
  while(WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  Serial.print("Connected to WiFi network with IP Address: ");
  Serial.println(WiFi.localIP());
  Serial.println("Timer set to 5 seconds (timerDelay variable), it will take 5 seconds before publishing the first reading.");
}

void loop() {

  Serial.println(analogRead(sensorGPIO));
  delay(100);

  if ((millis() - lastTime) > timerDelay) {
      if(WiFi.status()== WL_CONNECTED){
        WiFiClient client;
        HTTPClient http;

        http.begin(client, serverName);
        http.addHeader("Content-Type", "application/x-www-form-urlencoded");
        http.addHeader("Content-Type", "application/json");
        http.addHeader("API-Key", "tPmAT5Ab3j7F9");
        int httpResponseCode = http.POST("{\"sensor\":\"BME280\",\"humidity\":" + humidity + "\\"}");
      
        Serial.print("HTTP Response code: ");
        Serial.println(httpResponseCode);
        http.end();
      } else {
        Serial.println("WiFi Disconnected");
      }
      lastTime = millis();
  }
}
