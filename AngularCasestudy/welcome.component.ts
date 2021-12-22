import { Component, OnInit } from '@angular/core';
import { AddUserComponent } from '../add-user/add-user.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  constructor( private router:Router) { }

  ngOnInit(): void {
  }

  adduser(){
    this.router.navigate(['/adduser'])
  }

  addtask(){
    this.router.navigate(['/addtask'])
  }
  
  deletetask(){
    this.router.navigate(['/deletetask'])
  }
  gettask(){
    this.router.navigate(['/gettask'])
  }
  updatepri(){
    this.router.navigate(['/pri'])
  }
  addnotes(){
    this.router.navigate(['/notes'])
  }
  addbm(){
    this.router.navigate(['/bm'])
  }
  assign(){
    this.router.navigate(['/assign'])
  }
  search(){
    this.router.navigate(['/search'])
  }
  track(){
    this.router.navigate(['/track'])
  }
  logout(){
    this.router.navigate([''])
  }
}
