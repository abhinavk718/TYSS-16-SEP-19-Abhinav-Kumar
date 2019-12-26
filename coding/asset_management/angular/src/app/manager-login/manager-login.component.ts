import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-manager-login',
  templateUrl: './manager-login.component.html',
  styleUrls: ['./manager-login.component.css']
})
export class ManagerLoginComponent implements OnInit {
  error: string;
  constructor(private auth: LoginService, private router: Router) { }

  login(form: NgForm) {
    this.error = null;
    this.auth.login(form.value).subscribe(res => {
      console.log(res);
      this.router.navigateByUrl('/home');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
   }
  ngOnInit() {
  }

}
