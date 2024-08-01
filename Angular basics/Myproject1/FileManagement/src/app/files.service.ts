import { Injectable } from '@angular/core';
import {File } from './model/File';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class FilesService {

  url : string;

  constructor(private http: HttpClient) 
  { 
    this.url = "http://localhost:3004/files";

  }
  insertfile(file :File){
  this.http.post<File>(this.url,file).subscribe();
  return "File Details Added";
  }
}

