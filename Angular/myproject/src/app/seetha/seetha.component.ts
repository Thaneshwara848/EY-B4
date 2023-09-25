import { Component } from '@angular/core';
import { ChatservService } from '../chatserv.service';

@Component({
  selector: 'app-seetha',
  templateUrl: './seetha.component.html',
  styleUrls: ['./seetha.component.css']
})
export class SeethaComponent {

  constructor(private ch:ChatservService){

  }


  mymsg=[];

  send(content:any){
   
    this.mymsg= this.ch.chat(content);

  }

}
