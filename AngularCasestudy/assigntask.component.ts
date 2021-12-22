import { Component, OnInit } from '@angular/core';
import { AssignService } from './AssignService';
import { IAssign } from './task';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 
import { Router } from '@angular/router';

@Component({
  selector: 'app-assigntask',
  templateUrl: './assigntask.component.html',
  styleUrls: ['./assigntask.component.css']
})
export class AssigntaskComponent implements OnInit {

  public tasks!:IAssign[];
  form!:any;
  taskid!:number;
  ownerid!:number;


  constructor(private as:AssignService, private router:Router) { }

   ngOnInit(){
    this.form=new FormGroup({
      
        taskid:new FormControl("",Validators.compose([Validators.required])),
        ownerid:new FormControl("",Validators.compose([Validators.required]))
        
       
    });
}
onSubmitas(user1:any)  {
  console.log(user1);
this.as.assign(user1.taskid,user1.ownerid).subscribe(data=> this.tasks =data)
   
  
}
home(){
  this.router.navigate(['home'])
}

}