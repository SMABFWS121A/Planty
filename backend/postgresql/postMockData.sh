#!/bin/bash

# Rooms
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Living Room", "description": "The best room."}' http://localhost:8080/room
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Bedroom", "description": "The sleepy room."}' http://localhost:8080/room

# Plant Types
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Sunflower", "description": "Draws energy during the day, but loses energy at night. +5 Energy/minute at day, -3.25 Energy/minute at night."}' http://localhost:8080/room
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Tulip", "description": "A family of flowers that originated from Turkey."}' http://localhost:8080/plantType

# Sensor
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Epic Sensor", "description": "The most accurate of them all. This is the main character."}' http://localhost:8080/sensor
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Crippled Sensor", "description": "This one has cheap parts built into it."}' http://localhost:8080/sensor

curl -v -X POST -H "Content-Type: application/json" -d '{"humidityScalingFrom": 0, "humidityScalingTo": 100, "sleepTimeout": 60}' http://localhost:8080/sensor/1
curl -v -X POST -H "Content-Type: application/json" -d '{"humidityScalingFrom": 32, "humidityScalingTo": 65, "sleepTimeout": 60}' http://localhost:8080/sensor/2

# Plant
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Betty", "description": "Betty was your first sunflower. By the help of Planty, you managed to keep her alive ever since.", "plantTypeId": 1, "sensorId": 1, "roomId": 1}' http://localhost:8080/plant
curl -v -X POST -H "Content-Type: application/json" -d '{"name": "Cassandra", "description": "Cassandra is a proud tulip.", "plantTypeId": 2, "sensorId": 2, "roomId": 2}' http://localhost:8080/plant

# Moisture Records
curl -v -X POST -H "Content-Type: application/json" -d '{"humidityLevel": 50, "plantId": 1}' http://localhost:8080/moistureRecord
curl -v -X POST -H "Content-Type: application/json" -d '{"humidityLevel": 42, "plantId": 2}' http://localhost:8080/moistureRecord

echo "Posted 2 rooms, plant types, sensors, plants and moisture records to localhost:8080."