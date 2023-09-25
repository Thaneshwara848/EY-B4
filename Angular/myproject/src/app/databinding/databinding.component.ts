import { Component } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent {

  abc()
  {
    alert("Hi Boss you clicked the button ")
  }
  atoz(){
    console.log("Hi Console ")

  }
  xyz(uname:string){
    alert("Hi "+uname)
  }

  myname='';
  justtocheck="Demo"
  fullname(fn:string,ln:string){

    //alert("Hi "+(fn+ln))
    this.myname=fn+ln;
  }
  myimage="../../assets/download1.jpg";
  solution="Loding...!"
  aaaa:boolean=false;
}
