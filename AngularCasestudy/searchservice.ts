import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http';
import { ISearch } from "./searchInterface";

@Injectable({ providedIn: 'root' })

export class SearchService {


    constructor(private http:HttpClient) { }

    
    search(a:number):Observable<ISearch[]>{
      
        return this.http.get<ISearch[]>("http://localhost:8080/taskid/"+a);
    }
}
