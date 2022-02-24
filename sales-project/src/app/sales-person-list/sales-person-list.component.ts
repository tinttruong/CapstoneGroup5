import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list-bootstrap.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  // create an array of objects
  salesPersonList: SalesPerson[] = [
    new SalesPerson("Anup", "Kumar", "anup.kumar@luv2code.com", 4000),
    new SalesPerson("John", "Doe", "john.doe@luv2code.com", 5000),
    new SalesPerson("Jane", "Doe", "jane.doe@luv2code.com", 7500),
    new SalesPerson("Scarlett", "Johanson", "scar.jo@luv2code.com", 50000)
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
