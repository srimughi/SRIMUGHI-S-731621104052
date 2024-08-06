import { Injectable } from '@angular/core';
import { Event } from './model/Event';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EventService {
    url :string;
    events : Event;
    eventArr :Event[];
  constructor(private http : HttpClient) { //predefined service for http
      this.url = "http://localhost:3004/events";
      this.events = new Event();
      this.eventArr =[];
  }
  insertEvent(events : Event){
    this.http.post<Event>(this.url,events).subscribe() //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Added"; //subscribe==>commit
  }
  updateEvent(event : Event){
    this.http.put<Event>(this.url+"/"+event.id,event).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Updated"; //subscribe==>commit
  }
  deleteEvent(eventId : number){
    this.http.delete<Event>(this.url+"/"+eventId).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Deleted";
  }
  
  findEvent(eventId : number){
    this.http.get<Event>(this.url+"/"+eventId).subscribe(data =>this.event=data); //post-->update method is called by http client <Employee says where ii is saving
     return this.event;
  }
  findAllEvent(){
    this.http.get<Event[]>(this.url).subscribe(data =>this.eventArr=data); 
    return this.eventArr;
  }
}
