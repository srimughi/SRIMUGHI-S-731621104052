import { Component } from '@angular/core';
import { Event } from './model/Event';
import { EventService } from './event.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  event : Event;
  result : string;
  eventArr : Event[];
  flag : boolean;
  constructor(private service : EventService){ //injecting own service
    this.event= new Event();
    this.result = "";
    this.eventArr = [];
    this.flag = false;
  }  //  memory allocation assigning 
  insertEvent(data : any){
    this.event.id=data.id; //taking value from text box model object
    this.event.eventName=data.eventName;
    this.event.eventDate=data.eventDate;
    alert(data.id+" "+data.eventName+" "+data.eventDate);
    this.result = this.service.insertEvent(this.event); // object as an arguement
     //employee service file 
  }
  updateEvent(data : any){
    this.event.id=data.id; //taking value from text box model object
    this.event.eventName=data.eventName;
    this.event.eventDate=data.eventDate;
    alert(data.id+" "+data.eventName+" "+data.eventDate);
    this.result = this.service.updateEvent(this.event); 
}
  deleteEvent(data : any){
    this.result = this.service.deleteEvent(data.id); 
  }
  findEvent(data : any){
    this.event = this.service.findEvent(data.id);
    this.result = this.event.id +" "+this.event.eventName+" "+this.event.eventDate;
  }
  findAllEvent(){
    this.eventArr = this.service.findAllEvent();
    this.flag = true;
    
  }
}

