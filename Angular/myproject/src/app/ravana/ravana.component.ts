import { Component } from '@angular/core';
import { ChatservService } from '../chatserv.service';

@Component({
  selector: 'app-ravana',
  templateUrl: './ravana.component.html',
  styleUrls: ['./ravana.component.css']
})
export class RavanaComponent {

  constructor(private ch:ChatservService){

  }


  mymsg=[];

  send(content:any){
   
    this.mymsg= this.ch.chat(content);

  }
}
