import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
    products = [
      {
        img : 'https://cdn.pixabay.com/photo/2015/12/30/11/57/fruit-basket-1114060__340.jpg',
        name : 'fruits',
        price : 101
      },
      {
        img : 'https://cdn.pixabay.com/photo/2018/02/01/19/21/easter-3123834__340.jpg',
        name : 'Eggs',
        price : 102
      },
      {
        img : 'https://cdn.pixabay.com/photo/2018/05/29/23/18/potato-3440360__340.jpg',
        name : 'Potatoo',
        price : 103
      },
    ];
  constructor() { }

  ngOnInit() {
  }

}
