import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ChatservService {



  msgs:any=[];
  
  constructor() { }

  chat(content:any){

       this.msgs.push(content);
       return this.msgs;
  }

}
