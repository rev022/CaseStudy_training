import { Component, OnInit } from '@angular/core';
import {bmservice} from './bmservice';
import {Ibm} from './bmInterface';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 
import { Router } from '@angular/router';


@Component({
  selector: 'app-add-bm',
  templateUrl: './add-bm.component.html',
  styleUrls: ['./add-bm.component.css']
})
export class AddBmComponent implements OnInit {

  public tasks!:Ibm[];
  form2!:any;
  taskid!:number;
  isbookmarked!:boolean;

  constructor(private ts:bmservice, private router:Router) { }

  ngOnInit(){
    this.form2=new FormGroup({
      isbookmarked:new FormControl("",Validators.compose([Validators.required])),
        taskid:new FormControl("",Validators.compose([Validators.required]))
        });
}
onSubmitbm(user1:any)  {
  console.log(user1);
this.ts.bm(user1.isbookmarked,user1.taskid).subscribe(data=> this.tasks =data)
   
  
}
home(){
  this.router.navigate(['home'])
}

}
