import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http'
import { IDelete } from "./deleteInterface";

@Injectable({ providedIn: 'root' })

export class deleteservice {


    constructor(private http:HttpClient) { }

    
    delete(a:string):Observable<IDelete[]>{
      
        return this.http.get<IDelete[]>("http://localhost:8080/taskdel/"+a);
    }
}

