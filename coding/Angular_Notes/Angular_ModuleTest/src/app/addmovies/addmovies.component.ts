import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {
 constructor() { }

 ngOnInit() {
 }
 addMovie(form: NgForm) {
  console.log(form.value);
}
}
