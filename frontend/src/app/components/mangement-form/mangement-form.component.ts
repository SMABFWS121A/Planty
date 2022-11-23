import { Component, Input, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-mangement-form',
  templateUrl: './mangement-form.component.html',
  styleUrls: ['./mangement-form.component.css'],
})
export class MangementFormComponent implements OnInit {
  @Input() visibility: string | undefined;
  @Input() menuetype: string | undefined;
  @Input() description: string | undefined;

  selectedFW = new FormControl();
  categories: string[] = ['Category 1', 'Category 2', 'Category 3'];
  sensors: string[] = ['Sensor 1', 'Sensor 2', 'Sensor 3'];

  constructor() {}
  ngOnInit(): void {
    let visibility = this.visibility;
    let menuetype = this.menuetype;

    if (this.description) {
      this.description = 'IP-Adress';
    } else {
      this.description = 'Description';
    }
  }
}
