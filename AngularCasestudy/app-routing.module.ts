import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//import { FormExample } from './FormExample';
//import { ReactiveForm } from './ReactiveForm';
import { TaskCaseComponent } from './task-case-get/task-case.component';
import { LoginCaseComponent } from './login-case/login-case.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AddUserComponent} from './add-user/add-user.component'
import {PostExampleComponent} from './post-example/post-example.component';
import { TaskDeleteComponent } from './task-delete/task-delete.component';
import { UpdateExampleComponent } from './update-example/update-example.component';
import {AddNotesComponent} from './add-notes/add-notes.component'
import { AddBmComponent } from './add-bm/add-bm.component';
import { AssigntaskComponent } from './assigntask/assigntask.component';
import { SearchTaskComponent } from './search-task/search-task.component';
import { TrackTaskComponent } from './track-task/track-task.component';

const routes: Routes = [
  //{path: 'TemplateForm', component:FormExample},
  //{path: 'ModelForm', component: ReactiveForm}
  {path:'home', component:WelcomeComponent},
  {path:'', component:LoginCaseComponent},
  {path:'deletetask', component:TaskDeleteComponent},


  {path:'adduser',component:AddUserComponent},
  {path:'addtask',component:PostExampleComponent},
  {path:'gettask',component:TaskCaseComponent},
  {path:'pri',component:UpdateExampleComponent},
  {path:'notes',component:AddNotesComponent},
  {path:'bm',component:AddBmComponent},
  {path:'assign',component:AssigntaskComponent},
  {path:'search',component:SearchTaskComponent},
  {path:'track',component:TrackTaskComponent}

  


];

@NgModule({
  declarations:[],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
