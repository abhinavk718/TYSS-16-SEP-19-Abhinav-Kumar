import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
   @Input() mobile: {name , imgUrl, price , description};
  constructor() { }

  ngOnInit() {
  }

}
