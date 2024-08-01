import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee : Employee;
  result : string;
  employeeArr : Employee[];
  flag : boolean;
  constructor(private service : EmployeeService){ //injecting own service
    this.employee = new Employee();
    this.result = "";
    this.employeeArr = [];
    this.flag = false;
  }  //  memory allocation assigning 
  insertEmployee(data : any){
    this.employee.id=data.empId; //taking value from text box model object
    this.employee.empName=data.empName;
    this.employee.empSalary=data.empSalary;
    alert(data.empId+" "+data.empName+" "+data.empSalary);
    this.result = this.service.insertEmployee(this.employee); // object as an arguement
     //employee service file 
  }
  updateEmployee(data : any){
    this.employee.id=data.empId; //taking value from text box model object
    this.employee.empName=data.empName;
    this.employee.empSalary=data.empSalary;
    alert(data.empId+" "+data.empName+" "+data.empSalary);
    this.result = this.service.updateEmployee(this.employee); 
}
  deleteEmployee(data : any){
    this.result = this.service.deleteEmployee(data.empId); 
  }
  findEmployee(data : any){
    this.employee = this.service.findEmployee(data.empId);
    this.result = this.employee.id +" "+this.employee.empName+" "+this.employee.empSalary;
  }
  findAllEmployee(){
    this.employeeArr = this.service.findAllEmployee();
    this.flag = true;
    
  }
}

