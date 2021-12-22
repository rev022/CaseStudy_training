import { Component, OnInit } from '@angular/core';
import {deleteservice} from './deleteservice';
import {IDelete} from './deleteInterface';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 
import { Router } from '@angular/router';

@Component({
  selector: 'app-task-delete',
  templateUrl: './task-delete.component.html',
  styleUrls: ['./task-delete.component.css']
})
export class TaskDeleteComponent implements OnInit {

  public tasks!:IDelete[];
  form2!:any;
  taskid!:number;

  constructor(private ts:deleteservice, private router:Router) { }

  ngOnInit(){
    this.form2=new FormGroup({
        taskid:new FormControl("",Validators.compose([Validators.required]))
       
    });
}

onSubmitdel(user1:any)  {
  console.log(user1);
this.ts.delete(user1.taskid).subscribe(data=> this.tasks =data)
   
  
}
home(){
  this.router.navigate(['home'])
}
}