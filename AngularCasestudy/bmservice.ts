import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http'
import { Ibm } from "./bmInterface";

@Injectable({ providedIn: 'root' })

export class bmservice {


    constructor(private http:HttpClient) { }

    
    bm(a:boolean,b:number):Observable<Ibm[]>{
      
        return this.http.get<Ibm[]>("http://localhost:8080/isBookMarked/"+a+"/taskid/"+b);
    }
}


