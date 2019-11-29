import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent implements OnInit {

form = new FormGroup({
    pname : new FormControl('', [Validators.required]),
    price : new FormControl('', [Validators.required]),
    imgurl : new FormControl('', [Validators.required])
  });
  constructor() { }

  ngOnInit() {
  }
  addProducts(form: any) {
    console.log(form);
  }

}
