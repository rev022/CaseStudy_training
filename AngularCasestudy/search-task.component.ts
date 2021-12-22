import { Component, OnInit } from '@angular/core';
import { ISearch } from './searchInterface';
import { SearchService } from './searchservice';
import { Router } from '@angular/router';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 


@Component({
  selector: 'app-search-task',
  templateUrl: './search-task.component.html',
 styleUrls: ['./search-task.component.css']
})
export class SearchTaskComponent implements OnInit {
  public tasks!:ISearch[];
  form!:any;
  taskid!:number;
  constructor(private ss:SearchService, private router:Router) { }

  ngOnInit(){
    this.form=new FormGroup({
        taskid:new FormControl("",Validators.compose([Validators.required]))
  
        });
}
onSubmitsearch(user1:any)  {
  console.log(user1);
this.ss.search(user1.taskid).subscribe(data=> this.tasks =data)
   
  
}
home(){
  this.router.navigate(['home'])
}
}