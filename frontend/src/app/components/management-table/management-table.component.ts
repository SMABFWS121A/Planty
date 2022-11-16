import {Component, Input, OnInit} from '@angular/core';
import { GitHubService } from './api.service';
import { repos } from './repos';

export interface PeriodicElement {
  name: string;
  description: string;
  categories: string;
  sensors: string;
}

@Component({
  selector: 'app-management-table',
  templateUrl: './management-table.component.html',
  styleUrls: ['./management-table.component.css']
})

export class ManagementTableComponent implements OnInit {
  @Input() endPoint: string | undefined;

  displayedColumns: string[] = ['name', 'description', 'categories', 'sensors'];
  dataSource = repos;
  repos: string[] = [];


  errorMessage: string | undefined;


  constructor(private githubService: GitHubService) {
  }

  public getRepos() {
    this.errorMessage = "";
    this.githubService.getRepos(this.endPoint)
      .subscribe(
        (response) => {                           //next() callback
          console.log('response received')
          this.repos = response;
        },
        (error) => {                              //error() callback
          console.error('Request failed with error')
          this.errorMessage = error;
        },
        () => {                                   //complete() callback
          console.error('Request completed')      //This is actually not needed
        })
  }

  ngOnInit(): void {
    this.getRepos()
    let endPoint = this.endPoint;
  }
}
