import { Component, Input, OnInit } from '@angular/core';
import { Chart, registerables } from 'node_modules/chart.js';
import { ApiService } from 'src/app/services/api.service';
Chart.register(...registerables);

@Component({
  selector: 'app-line-chart',
  templateUrl: './line-chart.component.html',
  styleUrls: ['./line-chart.component.css'],
})
export class LineChartComponent implements OnInit {
  @Input() plantName: string = 'PlantTestName';

  constructor(private apiService: ApiService) {}

  chartData: any;

  lableData: any[] = [];
  moistureData: any[] = [];

  ngOnInit(): void {
    this.apiService.getPlantInfo().subscribe((result) => {
      this.chartData = result;
      if (this.chartData != null) {
        for (let i = 0; i < this.chartData.length; i++) {
          this.lableData.push(this.chartData[i].date);
          this.moistureData.push(this.chartData[i].moistureLevel);
        }
        this.renderChart(this.lableData, this.moistureData);
      }
    });
  }

  renderChart(lableData: any, moistureData: any) {
    new Chart('lineChart', {
      type: 'line',
      data: {
        labels: lableData,
        datasets: [
          {
            label: this.plantName,
            data: moistureData,
            borderWidth: 1,
          },
        ],
      },
      // options: {
      //   scales: {
      //     y: {
      //       beginAtZero: true,
      //     },
      //     x: {
      //       beginAtZero: true,
      //     },
      //   },
      // },
    });
  }
}
