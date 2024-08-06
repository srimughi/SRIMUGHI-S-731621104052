import { Component } from '@angular/core';
import { Event } from './model/Event';
import { EventService } from './event.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  events : Event;
  result : string;
  eventArr : Event[];
  flag : boolean;
  constructor(private service : EventService){ //injecting own service
    this.events = new Event();
    this.result = "";
    this.eventArr = [];
    this.flag = false;
  }  //  memory allocation assigning 
  insertEvent(data : any){
    this.events.id=data.eventId; //taking value from text box model object
    this.events.eventName=data.eventName;
    this.events.eventDate=data.eventDate;
    alert(data.eventId+" "+data.eventName+" "+data.eventDate);
    this.result = this.service.insertEvent(this.events); // object as an arguement
     //employee service file 
  }
  updateEvent(data : any){
    this.events.id=data.eventId; //taking value from text box model object
    this.events.eventName=data.eventName;
    this.events.eventDate=data.eventDate;
    alert(data.eventId+" "+data.eventName+" "+data.eventDate);
    this.result = this.service.updateEvent(this.events); 
}
  deleteEvent(data : any){
    this.result = this.service.deleteEvent(data.eventId); 
  }
  findEvent(data : any){
    this.events = this.service.findEvent(data.eventId);
    this.result = this.events.id +" "+this.events.eventName+" "+this.events.eventDate;
  }
  findAllEvent(){
    this.eventArr = this.service.findAllEvent();
    this.flag = true;
    
  }
}

