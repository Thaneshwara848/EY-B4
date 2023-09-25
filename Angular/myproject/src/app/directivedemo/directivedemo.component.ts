import { Component } from '@angular/core';

@Component({
  selector: 'app-directivedemo',
  templateUrl: './directivedemo.component.html',
  styleUrls: ['./directivedemo.component.css']
})
export class DirectivedemoComponent {

  option=false;
  emp=["Abi","Barath","Charan","Darsha","Ganesh"];

  fruits=["Apple","banana","Cherry","Graps"];

  storeFruts(addFruit:string){
  
    this.fruits.push(addFruit);  
  }
  num=6;
  // abc(){
  //   for(var i=0;i<this.emp.length;i++){
  //     console.log(this.emp[i])
  //   }
  // }
}
