import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-get-data',
  templateUrl: './get-data.component.html',
  styleUrls: ['./get-data.component.css']
})
export class GetDataComponent implements OnInit {

  public datas = [];
  constructor(private http: HttpClient) {
    this.getData();
   }
  getData() {
   return this.http.get<any>('http://localhost:8080/assetmanagement_backend/get-all').subscribe(data => {
      this.datas = data;
      console.log(this.datas);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    }
    );
  }
  ngOnInit() {
  }

}
