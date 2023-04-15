import { Component, OnInit } from '@angular/core';
// import { ApiService } from 'src/app/services/api.service';
import { DefaultService, SensorPayload } from 'src/assets/ts-api-client';

@Component({
  selector: 'app-sensor-management',
  templateUrl: './sensor-management.component.html',
  styleUrls: ['./sensor-management.component.css'],
})
export class SensorManagementComponent implements OnInit {
  displayedColumns: string[] = [
    'id',
    'name',
    'description',
    'humidityScalingFrom',
    'humidityScalingTo',
    'lastCalibration',
    'sleepTimeout',
    'delete',
  ];
  data: any;

  sensor: SensorPayload = {};

  constructor(
    private defaultService: DefaultService // private apiService: ApiService
  ) {}

  ngOnInit(): void {
    this.defaultService.sensorGet().subscribe((result) => {
      this.data = result;
    });
    // this.apiService.sensorGet().subscribe((result) => {
    //   this.data = result;
    // });
  }

  async saveSensor(
    name: string,
    description: string
    // humidityScalingFrom: string,
    // humidityScalingTo: string,
    // lastCalibration: string,
    // sleepTimeout: string
  ) {
    this.sensor.name = name;
    this.sensor.description = description;

    await this.defaultService.sensorPost(this.sensor).subscribe();
    await new Promise((resolve) => setTimeout(resolve, 300));
    location.reload();
  }

  async deleteItem(data: any) {
    await this.defaultService.sensorSensorIdDelete(data.id).subscribe();
    await new Promise((resolve) => setTimeout(resolve, 300));
    location.reload();
  }
}
