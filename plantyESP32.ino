#include <WiFi.h>
#include <HTTPClient.h>

const char* ssid = "Wifi_SSID";
const char* password = "Wifi_password";
const char* serverUrl = "http://localhost:30566/post";
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
}

void loop() {
  int value = analogRead(pin);
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