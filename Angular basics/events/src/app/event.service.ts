import { Injectable } from '@angular/core';
import { Event } from './model/Event';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EventService {
    url :string;
    event : Event;
    eventArr :Event[];
  constructor(private http : HttpClient) { //predefined service for http
      this.url = "http://localhost:3004/event";
      this.event = new Event();
      this.eventArr =[];
  }
  insertEvent(event : Event){
    this.http.post<Event>(this.url,event).subscribe() //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Added"; //subscribe==>commit
  }
  updateEvent(event : Event){
    this.http.put<Event>(this.url+"/"+event.id,event).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Updated"; //subscribe==>commit
  }
  deleteEvent(id : number){
    this.http.delete<Event>(this.url+"/"+id).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "Event Details Deleted";
  }
  
  findEvent(id: number){
    this.http.get<Event>(this.url+"/"+id).subscribe(data =>this.event=data); //post-->update method is called by http client <Employee says where ii is saving
     return this.event;
  }
  findAllEvent(){
    this.http.get<Event[]>(this.url).subscribe(data =>this.eventArr=data); 
    return this.eventArr;
  }
}
