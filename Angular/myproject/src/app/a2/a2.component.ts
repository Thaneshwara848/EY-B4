import { Component } from '@angular/core';
import { CommonservService } from '../commonserv.service';

@Component({
  selector: 'app-a2',
  templateUrl: './a2.component.html',
  styleUrls: ['./a2.component.css']
})
export class A2Component {

  constructor(private db:CommonservService){

  }
  a2component()
  {
   // console.log("A2 100 lines db connicivity logic...!")
   this.db.dblogic();
  }
}
