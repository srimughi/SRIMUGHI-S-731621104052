import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
 flag : boolean;
 vehicles :string[];
 Selectedvehicle : string;
 myStyle : {};
 myclass : string;
  constructor(){
    //this.name = "Sri";
    //this.age = 30;
    //this.email = "sri@gmail.com";
    //this.imagePath = "./assests/logo1.png";
    //this.fname = "";
    this.flag =true;
    this.vehicles = ["Twowheeler","Threewheeler","Fourwheeler"];
    this.Selectedvehicle ="";
    this.myStyle ={'width':'30%','height':'210px','border':'2px solid green','border-radius':'25px'};
    this.myclass = "myclass1";
  }
  changeFlag() {
    this.flag=!this.flag;
  }
  SetSelectedItem(str : string){
    this.Selectedvehicle = str;
  }
 change(){
  this.myStyle ={'width':'30%','border':'2px solid red','border-radius':'25px'};
  }
}

