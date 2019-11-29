import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  @Input() laptop: {name , imgUrl , price , description};
  constructor() { }

  ngOnInit() {
  }

}
