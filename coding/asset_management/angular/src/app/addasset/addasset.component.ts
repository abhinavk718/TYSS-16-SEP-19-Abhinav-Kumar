import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AssetService } from '../asset.service';

@Component({
  selector: 'app-addasset',
  templateUrl: './addasset.component.html',
  styleUrls: ['./addasset.component.css']
})
export class AddassetComponent implements OnInit {
  error: string;
  constructor(private auth: AssetService) { }

  addAsset(form: NgForm) {
    this.error = null;
    this.auth.addasset(form.value).subscribe(res => {
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
