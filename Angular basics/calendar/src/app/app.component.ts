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
    this.event = new Event();
    this.result = "";
    this.eventArr = [];
    this.flag = false;
  }  //  memory allocation assigning 
  insertEvent(data : any){
    this.event.EventName=data.eventName; //taking value from text box model object
    this.event.id=data.Eventid;
    this.event.EventDay=data.eventDay;
    alert(data.eventName+" "+data.Eventid+" "+data.eventDay);
    this.result = this.service.insertEvent(this.event); // object as an arguement
     //employee service file 
  }
  updateEvent(data : any){
    this.event.EventName=data.eventName; //taking value from text box model object
    this.event.id=data.Eventid;
    this.event.EventDay=data.eventDay;
    alert(data.eventName+" "+data.Eventid+" "+data.eventDay);
    this.result = this.service.updateEvent(this.event); 
}
  deleteEvent(data : any){
    this.result = this.service.deleteEvent(data.Eventid); 
  }
  findEvent(data : any){
    this.event = this.service.findEvent(data.eventName);
    this.result = this.event.EventName+" "+this.event.id+" "+this.event.EventDay;
  }
  findAllEvent(){
    this.eventArr = this.service.findAllEvent();
    this.flag = true;
    
  }
}

