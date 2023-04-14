import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
// import { ApiService } from 'src/app/services/api.service';
import {
  DefaultService,
  PlantPayload,
  PlantTypePayload,
  SensorPayload,
} from 'src/assets/ts-api-client';

@Component({
  selector: 'app-plant-management',
  templateUrl: './plant-management.component.html',
  styleUrls: ['./plant-management.component.css'],
})
export class PlantManagementComponent implements OnInit {
  selectedFW = new FormControl();
  visibility: string | undefined;
  menuetype: string | undefined;
  description: string | undefined;

  categoryNames: string[];
  sensorNames: string[];

  plant: PlantPayload = {};

  displayedColumns: string[] = [
    'id',
    'name',
    'description',
    'category',
    'sensor',
  ];
  plants: any;
  sensors: any = [];
  categories: any = [];

  constructor(
    private defaultService: DefaultService // private apiService: ApiService
  ) {
    this.categoryNames = [];
    this.sensorNames = [];
  }
  ngOnInit(): void {
    this.defaultService.sensorGet().subscribe((result) => {
      result.forEach((element) => {
        this.sensorNames.push(element.name!);
      });
      this.sensors = result;
    });
    this.defaultService.plantTypeGet().subscribe((result) => {
      result.forEach((element) => {
        this.categoryNames.push(element.name!);
      });
      this.categories = result;
    });
    this.defaultService.plantGet().subscribe((result) => {
      this.plants = result;
    });
    // this.apiService.plantGet().subscribe((result) => {
    //   this.data = result;
    // });
  }

  async savePlant(
    name: string,
    description: string,
    category: string,
    sensor: string
  ) {
    this.plant.name = name;
    this.plant.description = description;
    for (let i = 0; i <= this.categories.length; i++) {
      if (this.categories[i].name === category) {
        this.plant.plantTypeId = this.categories[i].id;
        break;
      }
    }
    for (let i = 0; i <= this.sensors.length; i++) {
      if (this.sensors[i].name === sensor) {
        this.plant.sensorId = this.sensors[i].id;
        break;
      }
    }
    await this.defaultService.plantPost(this.plant).subscribe();
  }
}
