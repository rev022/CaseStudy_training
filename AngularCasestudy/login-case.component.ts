import { Component, OnInit } from '@angular/core';
import {loginservice} from './loginservice';
import {loginInterface} from './loginInterface';
import { FormGroup,FormControl,Validators } from "@angular/forms"; 
import { Router } from '@angular/router';


@Component({
  selector: 'app-login-case',
  templateUrl: './login-case.component.html',
  styleUrls: ['./login-case.component.css']
})
export class LoginCaseComponent implements OnInit {

  public users!:loginInterface[];
  form2!:any;
  username!:string;
  pwd!:string;


  
  constructor(private ts:loginservice, private router:Router) { }

  ngOnInit(){
    this.form2=new FormGroup({
        username:new FormControl("",Validators.compose([Validators.required])),
        pwd:new FormControl("",Validators.compose([Validators.required])),
    });
}

onSubmit(user1:any)  {
    console.log(user1);
 this.ts.login(user1.username,user1.pwd).subscribe(data=>{
     
    if(data == true)
    {
        console.log(data);
        this.router.navigate(['/home']);
    }

    else
    {
    alert("Please enter Valid Credentials");
    }
});
}
}