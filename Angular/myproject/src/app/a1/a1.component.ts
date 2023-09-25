import { Component } from '@angular/core';
import { CommonservService } from '../commonserv.service';

@Component({
  selector: 'app-a1',
  templateUrl: './a1.component.html',
  styleUrls: ['./a1.component.css']
})
export class A1Component {

  constructor(private dbc:CommonservService){

  }
    a1component()
    {
      // console.log("A1 100 lines db connicivity logic...!")
    this.dbc.dblogic();
    }

}
