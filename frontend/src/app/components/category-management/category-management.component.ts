import { Component, OnInit } from '@angular/core';
// import { ApiService } from 'src/app/services/api.service';
import { DefaultService, PlantTypePayload } from 'src/assets/ts-api-client';

@Component({
  selector: 'app-category-management',
  templateUrl: './category-management.component.html',
  styleUrls: ['./category-management.component.css'],
})
export class CategoryManagementComponent implements OnInit {
  displayedColumns: string[] = [
    'id',
    'name',
    'description',
    'minHumidityLevel',
    'delete',
  ];
  data: any;

  category: PlantTypePayload = {};

  constructor(
    private defaultService: DefaultService // private apiService: ApiService
  ) {}

  ngOnInit(): void {
    this.defaultService.plantTypeGet().subscribe((result) => {
      this.data = result;
    });
    // this.apiService.plantTypeGet().subscribe((result) => {
    //   this.data = result;
    // });
  }
  async saveCategory(
    name: string,
    description: string,
    minHumidityLevel: string
  ) {
    this.category.name = name;
    this.category.description = description;
    this.category.minHumidityLevel = Number(minHumidityLevel);
    await this.defaultService.plantTypePost(this.category).subscribe();
    await new Promise((resolve) => setTimeout(resolve, 300));
    location.reload();
  }

  async deleteItem(data: any) {
    await this.defaultService.plantTypePlantTypeIdDelete(data.id).subscribe();
    await new Promise((resolve) => setTimeout(resolve, 300));
    location.reload();
  }
}
