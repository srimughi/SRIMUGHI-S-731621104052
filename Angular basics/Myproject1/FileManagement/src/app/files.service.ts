import { Injectable } from '@angular/core';
import { File } from './model/file';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class FilesService {
    url :string;
    file : File;
    fileArr :File[];
  constructor(private http : HttpClient) { //predefined service for http
      this.url = "http://localhost:3004/employees";
      this.file = new File();
      this.fileArr =[];
  }
  insertFile(file : File){
    this.http.post<File>(this.url,file).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "File Details Added"; //subscribe==>commit
  }
  updateFile(file : File){
    this.http.put<File>(this.url+"/"+file.fileName,file).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "File Details Updated"; //subscribe==>commit
  }
  deleteFile(FileName : string){
    this.http.delete<File>(this.url+"/"+FileName).subscribe(); //post-->update method is called by http client <Employee says where ii is saving
    return "File Details Deleted";
  }
  
  findFile(FileName: string){
    this.http.get<File>(this.url+"/"+FileName).subscribe(data =>this.file=data); //post-->update method is called by http client <Employee says where ii is saving
     return this.file;
  }
  findAllFile(){
    this.http.get<File[]>(this.url).subscribe(data =>this.fileArr=data); 
    return this.fileArr;
  }
}
