import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-form3',
  templateUrl: './form3.component.html',
  styleUrls: ['./form3.component.css']
})
export class Form3Component implements OnInit {
   form = new FormGroup({
     name : new FormControl('', [Validators.required]),
     exp : new FormControl('', [Validators.required]),
     cctc  : new FormControl('', [Validators.required]),
     ectc : new FormControl('', [Validators.required]),
     reloc : new FormControl('', [Validators.required])
   });
  constructor() { }

  ngOnInit() {
  }
  submitForm(form: any) {
    console.log(form);
  }
}
