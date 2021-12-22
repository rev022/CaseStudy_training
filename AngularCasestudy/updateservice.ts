import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http'
import { UpdateInterface } from "./UpdateInterface";

@Injectable({ providedIn: 'root' })

export class updateService {

   // baseurl:string="http://localhost:8080/taskid/22"

    constructor(private http:HttpClient) { }

    //getTasks(): Observable<UpdateInterface[]> {

       // return this.http.get<UpdateInterface[]>(this.baseurl);

   // }
    setPriority(a:string,b:string):Observable<UpdateInterface[]>{
      
        return this.http.get<UpdateInterface[]>("http://localhost:8080/taskid/"+a+"/priority/"+b);
    }
}

