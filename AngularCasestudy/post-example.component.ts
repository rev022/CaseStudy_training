import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 
import { Router } from '@angular/router';
import {DataService} from "./Data-Service";
import { postData,respData } from './postDataObj';



@Component({

  selector: 'app-post-example',

  templateUrl: './post-example.component.html',

  styleUrls: ['./post-example.component.css']

})

export class PostExampleComponent implements OnInit {

  form:any;
  taskid!:number;
  ownerid!:number;
  creatorid!:number;
  name!:string;
  descrptn!:string;
  status!:string;
  priority!:string;
  notes!:string;
  isbookmarked!:Boolean;
  created_on!:Date;
  status_changed_on!:Date;

  data!:string;

  posData!:postData;

  resultData!:respData;

  public users:any =[];

  constructor(private dataService:DataService, private router: Router ) { }



  ngOnInit(){
    this.form=new FormGroup({
      taskid:new FormControl(
          "",
          Validators.compose([Validators.required,Validators.minLength(3)])
      ),
      ownerid:new FormControl("",Validators.compose([Validators.required])),
      creatorid:new FormControl("",Validators.compose([Validators.required])),
      name:new FormControl("",Validators.compose([Validators.required,Validators.minLength(5)])),
      descrptn:new FormControl("",Validators.compose([Validators.required,,Validators.minLength(5)])),
      status:new FormControl("",Validators.compose([Validators.required])),
      priority:new FormControl("",Validators.compose([Validators.required])),
      notes:new FormControl("",Validators.compose([Validators.required])),
      isbookmarked:new FormControl("",Validators.compose([Validators.required])),
      created_on:new FormControl("",Validators.compose([Validators.required])),
      status_changed_on:new FormControl("",Validators.compose([Validators.required]))

  });
}

  

  onSubmit(user:any){

    console.log(user);
    this.posData=new postData();

    this.posData.taskid=user.taskid;
    this.posData.ownerid=user.ownerid;
    this.posData.creatorid=user.creatorid;
    this.posData.name=user.name;
    this.posData.descrptn=user.descrptn;
    this.posData.status=user.status;
    this.posData.priority=user.priority;
    this.posData.notes=user.notes;
    this.posData.isbookmarked=user.isbookmarked;
    this.posData.created_on=user.created_on;
    this.posData.status_changed_on=user.status_changed_on;
    console.log(this.posData);
    this.dataService.addPost(this.posData).subscribe(
      data=>console.log(data)
    )


    
}
home(){
  this.router.navigate(['home'])
}


   /* sendData(){

      this.posData=new postData();

      this.posData.body="test data2";

      this.posData.title="Some Title";
      this.posData.userId=13;
this.dataService.addPost(this.posData)
console.log(this.posData);*/
 // .subscribe((res : respData) =>{
 // this.resultData = res;
 // console.log(this.resultData.id);
 // this.data=this.resultData.id+ "-" + this.resultData.title;
 // });





    }

