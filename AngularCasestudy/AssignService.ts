import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http'
import { IAssign } from "./task";

@Injectable({ providedIn: 'root' })

export class AssignService {


    constructor(private http:HttpClient) { }

    
    assign(a:number,b:number):Observable<IAssign[]>{
      
        return this.http.get<IAssign[]>("http://localhost:8080/taskid/"+a+"/ownerid/"+b);
    }
}
