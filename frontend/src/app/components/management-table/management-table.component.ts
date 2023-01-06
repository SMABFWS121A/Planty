import { Component, Input, OnInit } from '@angular/core';
import { ApiService } from '../../services/api.service';
import { repos } from '../../models/repos';

export interface PeriodicElement {
  name: string;
  description: string;
  categories: string;
  sensors: string;
}

@Component({
  selector: 'app-management-table',
  templateUrl: './management-table.component.html',
  styleUrls: ['./management-table.component.css'],
})
export class ManagementTableComponent implements OnInit {
  @Input() endPoint: string | undefined;

  displayedColumns: string[] = ['name', 'description', 'categories', 'sensors'];
  dataSource = repos;
  repos: string[] = [];

  errorMessage: string | undefined;

  constructor(private githubService: ApiService) {}

  public getRepos() {
    this.errorMessage = '';
    this.githubService.getRepos(this.endPoint).subscribe(
      (response) => {
        //next() callback
        this.repos = response;
      },
      (error) => {
        //error() callback
        this.errorMessage = error;
      },
      () => {
        //complete() callback
      }
    );
  }

  ngOnInit(): void {
    this.getRepos();
    let endPoint = this.endPoint;
  }
}
