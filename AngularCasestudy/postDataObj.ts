/*export class postData{
    title! :string;
    body!:string;
    userId!: number;

}
export interface respData{
    title :string;
    body:string;
    userId: number;
    id:number;
}
*/
export class postData{
    taskid!: number;
  ownerid!: number;
  creatorid!:number;
  name!: string;
  descrptn!: string;
  status!: string;
  priority!: string;
  notes!: string;
  created_on!: Date;
  status_changed_on!: Date;
  isbookmarked!: boolean;
}
export interface respData{
    taskid: number;
    ownerid: number;
    creatorid:number;
    name: string;
    descrptn: string;
    status: string;
    priority: string;
    notes: string;
    created_on: Date;
    status_changed_on: Date;
    isbookmarked: boolean;
}