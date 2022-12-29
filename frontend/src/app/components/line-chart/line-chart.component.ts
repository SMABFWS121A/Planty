import { Component, Input, OnInit } from '@angular/core';
import { Chart, registerables } from 'node_modules/chart.js';
import { ApiService } from 'src/app/services/api.service';
import { DefaultService } from 'src/assets/ts-api-client';
Chart.register(...registerables);

@Component({
  selector: 'app-line-chart',
  templateUrl: './line-chart.component.html',
  styleUrls: ['./line-chart.component.css'],
})
export class LineChartComponent implements OnInit {
  @Input() plantID: string = '';
  plantData: any;
  lableData: any[] = [];
  moistureData: any[] = [];
  plantName: string = '';

  constructor(
    private apiService: ApiService,
    private defaultService: DefaultService
  ) {}

  ngOnInit(): void {
    this.defaultService
      .moistureRecordByPlantPlantIdGet(this.plantID)
      .subscribe((result) => {
        this.plantData = result;
        if (this.plantData != null) {
          for (let i = 0; i < this.plantData.length; i++) {
            this.lableData.push(this.plantData[i].timestamp);
            this.moistureData.push(this.plantData[i].humidity_level);
          }
          this.renderChart(this.lableData, this.moistureData);
        }
      });
    this.defaultService.plantPlantIdGet(this.plantID).subscribe((result) => {
      this.plantName = result.name!;
    });
  }

  renderChart(lableData: any, moistureData: any) {
    new Chart(this.plantName + 'line', {
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
      options: {
        responsive: true,
        scales: {
          y: {
            beginAtZero: true,
          },

          //     x: {
          //       beginAtZero: true,
          //     },
        },
      },
    });
  }
}
