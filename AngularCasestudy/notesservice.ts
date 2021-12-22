import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http'
import { INotes } from "./notesInterface";

@Injectable({ providedIn: 'root' })

export class notesservice {


    constructor(private http:HttpClient) { }

    
    notes(a:string,b:number):Observable<INotes[]>{
      
        return this.http.get<INotes[]>("http://localhost:8080/notes/"+a+"/taskid/"+b);
    }
}


