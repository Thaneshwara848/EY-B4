import { Component } from '@angular/core';
import { ChatservService } from '../chatserv.service';

@Component({
  selector: 'app-rama',
  templateUrl: './rama.component.html',
  styleUrls: ['./rama.component.css']
})
export class RamaComponent {
  constructor(private ch:ChatservService){

  }


  mymsg=[];

  send(content:any){
   
    this.mymsg= this.ch.chat(content);

  }

}
