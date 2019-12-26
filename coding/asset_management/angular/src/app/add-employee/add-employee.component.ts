import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
  error: string;
  constructor(private auth: EmployeeService) { }

  addEmp(form: NgForm) {
    this.error = null;
    this.auth.addEmployee(form.value).subscribe(res => {
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
   }
   ngOnInit() {
  }

}
