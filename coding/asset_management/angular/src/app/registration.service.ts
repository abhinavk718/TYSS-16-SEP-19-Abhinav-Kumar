import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private http: HttpClient) { }
  register(register): Observable<any> {
    return this.http.post('http://localhost:8080/assetmanagement_backend/register', register);
  }
}
