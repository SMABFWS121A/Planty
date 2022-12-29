import { Component, OnInit } from '@angular/core';
import { DefaultService } from 'src/assets/ts-api-client';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  plants: any;

  constructor(private defaultService: DefaultService) {}

  ngOnInit(): void {
    this.defaultService.plantGet().subscribe((result) => {
      this.plants = result;
    });
  }
}
