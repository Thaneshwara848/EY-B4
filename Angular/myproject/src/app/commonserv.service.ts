import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CommonservService {

  constructor() { }

  dblogic()
  {
    console.log("100 lines db logic from service ...!")
  }

}
