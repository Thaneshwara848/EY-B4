import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-reactivdrivenform',
  templateUrl: './reactivdrivenform.component.html',
  styleUrls: ['./reactivdrivenform.component.css']
})
export class ReactivdrivenformComponent implements OnInit{
  student:any=''
  ngOnInit() {
  this.student=new FormGroup({

    firstname:new FormControl("",Validators.compose([
      Validators.required,
      Validators.minLength(3),
      Validators.maxLength(10),
      Validators.pattern('^[A-Za-z]*$')
      
    ])),

    lastname:new FormControl("",Validators.compose([
      Validators.required,
      Validators.minLength(3),
      Validators.maxLength(10)
      
    ])),

    userage:new FormControl("",Validators.compose([
      Validators.required,
      Validators.min(18),
      Validators.max(60)
      
    ])),
    Email:new FormControl("",Validators.compose([
      Validators.required,
      Validators.email
    ])),

  })
  
}
}
