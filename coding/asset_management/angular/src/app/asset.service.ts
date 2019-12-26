import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class AssetService {

  constructor(private http: HttpClient) { }
  addasset(asset): Observable<any> {
    return this.http.post('http://localhost:8080/assetmanagement_backend/addasset', asset);
  }
}
