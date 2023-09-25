import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiservService {

  constructor(private http: HttpClient) { }

  getProduct(){ 
    return this.http.get("https://fakestoreapi.com/products");
  }

}
