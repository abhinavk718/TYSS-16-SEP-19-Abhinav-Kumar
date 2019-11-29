import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  name = 'Mikel';
  imgurl = 'https://cdn.pixabay.com/photo/2019/09/21/10/50/fuchsia-4493575__340.jpg';
  address = 'Btm 1st stage Bangalore';
  colorName = 'red';
  isActive = false;
  colSpanValue = 2;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'blue';
      this.isActive = !this.isActive;
    },  2000);
  }
}
