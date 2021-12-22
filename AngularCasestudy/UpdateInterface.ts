export interface UpdateInterface{
    taskid:number;
    ownerid:number;
    creatorid:number;
    name:string;
    descrptn:string;
    status:string;
    priority:string;
    notes:string;
    created_on:Date;
    status_changed_on:Date;
    isbookmarked:boolean;
}