import { Component, OnInit } from '@angular/core';
import {notesservice} from './notesservice';
import {INotes} from './notesInterface';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-notes',
  templateUrl: './add-notes.component.html',
  styleUrls: ['./add-notes.component.css']
})
export class AddNotesComponent implements OnInit {
  public tasks!:INotes[];
  form2!:any;
  taskid!:number;
  notes!:string;

  constructor(private ts:notesservice, private router:Router) { }

  ngOnInit(){
    this.form2=new FormGroup({
      notes:new FormControl("",Validators.compose([Validators.required])),
        taskid:new FormControl("",Validators.compose([Validators.required]))
        
       
    });
}
onSubmitnotes(user1:any)  {
  console.log(user1);
this.ts.notes(user1.notes,user1.taskid).subscribe(data=> this.tasks =data)
   
  
}
home(){
  this.router.navigate(['home'])
}

}
