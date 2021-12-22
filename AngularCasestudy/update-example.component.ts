import { Component, OnInit } from '@angular/core';
import { updateService } from './updateservice';
import { UpdateInterface } from './UpdateInterface';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-example',
  templateUrl: './update-example.component.html',
  styleUrls: ['./update-example.component.css']
})
export class UpdateExampleComponent implements OnInit {

  //public tasks!:UpdateInterface[];
    public task1!:UpdateInterface[];

    form2!:any;
    taskid!:number;
    priority!:string;

    constructor(private ts:updateService,private router:Router){}

    ngOnInit(){
      this.form2=new FormGroup({
        taskid:new FormControl("",Validators.compose([Validators.required])),

        priority:new FormControl("",Validators.compose([Validators.required]))
          
         
      });
  }
  onSubmitpri(user1:any)  {
    console.log(user1);
  this.ts.setPriority(user1.taskid,user1.priority).subscribe(data=> this.task1 =data)
     
    
  }
  home(){
    this.router.navigate(['home'])
  }

}
