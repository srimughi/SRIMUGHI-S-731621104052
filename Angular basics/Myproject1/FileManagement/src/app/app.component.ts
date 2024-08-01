import { Component } from '@angular/core';
import { FilesService } from './files.service';
import { File } from './model/File';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'FileManagement';
  result: string;
  file: File;
  constructor(private service : FilesService) {
    this.file= new File();
    this.result = "";
    }
    insertfile (data: any){
    this.file.fileName= data.fileName;
    this.file.fileSize =data.fileSize;
    this.file.fileType =data.fileType;
    this.file.fileDate =data.fileDate;
    this.result=this.service.insertFile(this.file);
    //alert(data.empId+" "+ data.empName+" "+data.empSalary);
  }

  // addFile(formData: any) {
  //   this.result = `Added File: ${formData.fileName}`;
  // }
  // updateFile(formData: any) {
  //   this.result = `Updated File: ${formData.fileName}`;
  // }
  // deleteFile(formData: any) {
  //   this.result = `Deleted File: ${formData.fileName}`;
  // }
  // findFile(formData: any) {
  //   this.result = `Found File: ${formData.fileName}`;
  // }
  // findAllFiles() {
  //   this.result = 'Listing all files...';
  // }
}
