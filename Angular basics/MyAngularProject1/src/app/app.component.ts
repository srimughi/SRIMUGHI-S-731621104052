import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
  imagePath : string;

  constructor(){
    this.name = "Sri";
    this.age = 30;
    this.email = "sri@gmail.com";
    this.imagePath = "./assests/logo1.png";
  }
  change(){
    this.name="Maha";
  }
}

