import { Injectable } from '@angular/core';
//import { Event } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Event } from './model/Event';
@Injectable({
  providedIn: 'root'
})
export class EventService {
    url :string;
    event : Event;
    eventArr :Event[];
  constructor(private http : HttpClient) { //predefined service for http
      this.url ="http://localhost:3085/event";
      this.event = new Event();
      this.eventArr =[];
  }
  insertEvent(event : Event){
    this.http.post<Event>(this.url,event).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Added"; //subscribe==>commit
  }
  updateEvent(event : Event){
    this.http.put<Event>(this.url+"/"+event.id,event).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Updated"; //subscribe==>commit
  }
  deleteEvent(Eventid : number){
    this.http.delete<Event>(this.url+"/"+Eventid).subscribe() //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Deleted"
  }
  
  findEvent(Eventid : number){
    this.http.get<Event>(this.url+"/"+Eventid).subscribe(data =>this.event=data); //post-->update method is called by http client <Employee says where ii is saving
     return this.event;
  }
  findAllEvent(){
    this.http.get<Event[]>(this.url).subscribe(data =>this.eventArr=data); 
    return this.eventArr;
  }
}
