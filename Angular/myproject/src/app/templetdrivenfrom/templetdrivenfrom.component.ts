import { Component } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-templetdrivenfrom',
  templateUrl: './templetdrivenfrom.component.html',
  styleUrls: ['./templetdrivenfrom.component.css']
})
export class TempletdrivenfromComponent {

  constructor(private router:Router) {}


  userLoginInformation(userForm:any){

    if(userForm.uname=="Thanesh" && userForm.upass=="Thanesh@123"){
      this.router.navigate(['home']);
    }
    else{
      alert("Please Enter the Correct Data ")
    }
  
    
  }
}
