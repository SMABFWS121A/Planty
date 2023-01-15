#include <WiFi.h>
#include <ESPAsyncWebServer.h>

const char* ssid = "Wifi_SSID";
const char* password = "Wifi_password";
const char* serverUrl = "http://localhost:30566/post";

int offset = 0;
int pin = 32;
int id = 123;

void setup() {
  Serial.begin(115200);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Connecting to WiFi...");
  }
  Serial.println("Connected to WiFi");

  AsyncWebServer server(80);
  server.on("/offset", HTTP_GET, [](AsyncWebServerRequest *request){
    String offsetString = request->getParam("offset")->value();
    if (offsetString.toInt()) {
      offset = offsetString.toInt();
      request->send(200, "text/plain", "Offset saved successfully");
    } else {
      request->send(400, "text/plain", "Invalid offset value, must be an integer");
    }
  });
  server.begin();
  Serial.println("Server started");
}

void loop() {
  int value = analogRead(pin) + offset;
  String body = "value=" + String(value) + "&id=" + String(id);

  HTTPClient http;
  http.begin(serverUrl);
  http.addHeader("Content-Type", "application/x-www-form-urlencoded");
  int httpCode = http.POST(body);

  if (httpCode == 200) {
    Serial.println("Value sent successfully, entering deep sleep for 4 hours...");
    ESP.deepSleep(4*60*60*1000000); // 4 hours in microseconds
  } else {
    Serial.println("Error sending value, HTTP code: " + String(httpCode));
    delay(300000); // retry after 5 minutes
  }
  http.end();
}