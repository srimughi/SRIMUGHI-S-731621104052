import { Component } from '@angular/core';
import{FilesService} from './files.service';
import { File } from './model/file';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  file : File;
  result : string;
  fileArr : File[];
  flag : boolean;
  constructor(private service : FilesService){ //injecting own service
    this.file = new File();
    this.result = "";
    this.fileArr = [];
    this.flag = false;
  }  //  memory allocation assigning 
  insertFile(data : any){
    this.file.fileName=data.fileName; //taking value from text box model object
    this.file.fileType=data.fileType;
    this.file.fileSize=data.fileSize;
    alert(data.fileName+" "+data.fileType+" "+data.fileSize);
    this.result = this.service.insertFile(this.file); // object as an arguement
     //employee service file 
  }
  updateFile(data : any){
    this.file.fileName=data.FileName; //taking value from text box model object
    this.file.fileType=data.FileType;
    this.file.fileSize=data.FileSize;
    alert(data.fileName+" "+data.fileType+" "+data.fileSize);
    this.result = this.service.updateFile(this.file); 
}
  deleteFile(data : any){
    this.result = this.service.deleteFile(data.FileName); 
  }
  findFile(data : any){
    this.file = this.service.findFile(data.FileName);
    this.result = this.file.fileName+" "+this.file.fileType+" "+this.file.fileSize;
  }
  findAllFile(){
    this.fileArr = this.service.findAllFile();
    this.flag = true;
    
  }
}

