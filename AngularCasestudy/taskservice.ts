import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import {HttpClient, HttpErrorResponse} from '@angular/common/http'
import { ITask } from "./task";
import { share } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class taskservice {
    baseurl: string ="http://localhost:8080/task1";

    constructor(private http:HttpClient) { }

    getTask(): Observable<ITask[]> {
        return this.http.get<ITask[]>(this.baseurl);
    }
}
