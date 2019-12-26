import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }
  login(login): Observable<any> {
    return this.http.post('http://localhost:8080/assetmanagement_backend/login', login);
  }
}
