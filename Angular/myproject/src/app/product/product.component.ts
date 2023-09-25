import { Component, OnInit } from '@angular/core';
import { ApiservService } from '../apiserv.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent  implements OnInit{

  constructor(private apis:ApiservService){}
  myproducts:any=[];

  ngOnInit(): void {
    this.apis.getProduct().subscribe(res=>{
      console.log(res)
      this.myproducts=res;
    },error=>{
      console.log(error)
    })
  }
}
