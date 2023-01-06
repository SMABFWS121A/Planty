import {Component, OnInit} from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-plant-managemnet',
  templateUrl: './plant-managemnet.component.html',
  styleUrls: ['./plant-managemnet.component.css'],
})


export class PlantManagemnetComponent implements OnInit {

  selectedFW = new FormControl();
  categories: string[] = ['Category 1', 'Category 2', 'Category 3'];
  sensors: string[] = ['Sensor 1', 'Sensor 2', 'Sensor 3'];

  constructor() {}
  ngOnInit(): void {}
}




