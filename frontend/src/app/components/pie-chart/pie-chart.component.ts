import { Component, Input, OnInit } from '@angular/core';
import { Chart } from 'chart.js';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-pie-chart',
  templateUrl: './pie-chart.component.html',
  styleUrls: ['./pie-chart.component.css'],
})
export class PieChartComponent implements OnInit {
  @Input() plantName: string = '';
  moistureData: number = NaN;
  plantData: any;

  constructor(private apiService: ApiService) {}

  ngOnInit(): void {
    this.apiService.getPlantInfo().subscribe((result) => {
      this.plantData = result;
      if (this.plantData != null) {
        this.moistureData =
          this.plantData[this.plantData.length - 1].moistureLevel;
        this.renderChart();
      }
    });
  }

  renderChart() {
    new Chart(this.plantName + 'pie', {
      type: 'doughnut',
      data: {
        labels: ['moistlevel'],
        datasets: [
          {
            label: 'Percent',
            data: [this.moistureData * 10, 100 - this.moistureData * 10],
            backgroundColor: ['rgb(54, 162, 235)', 'rgb(211,211,211)'],
            hoverOffset: 4,
          },
        ],
      },
    });
  }
}
