import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  plants: any;

  constructor(private apiService: ApiService) {}

  ngOnInit(): void {
    this.apiService.getPlants().subscribe((result) => {
      this.plants = result;
    });
  }
}
