export interface ITask {
    taskid:number;
    
    ownerid:number;
    creatorid:number;
    name:string;
    descrptn:string;
    status:string;
    priority:string;
    notes:string;
    isbookmarked:Boolean;
    created_on:Date;
    status_changed_on:Date;
}