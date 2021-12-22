import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http'
import { loginInterface } from "./loginInterface";

@Injectable({ providedIn: 'root' })

export class loginservice {


    constructor(private http:HttpClient) { }

    
    login(a:string,b:string):Observable<any>{
      
        return this.http.get<boolean>("http://localhost:8080/username/"+a+"/pwd/"+b);
    }
}


