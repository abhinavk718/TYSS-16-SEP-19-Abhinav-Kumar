import { Component, OnInit } from '@angular/core';
import { Button } from 'protractor';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  inputData = '';
  constructor() { }
  printAlertMsg() {
    alert('hi hello from angular');
  }
  dataInput(event) {
      console.log(event.target.value);
      this.inputData = event.target.value;
  }

  ngOnInit() {
  }

}
