export class postData{
userid!: number;
username!: string;
email!: string;
fname!: string;
lname!: string;
phno!: bigint;
role!: string;
isactive!: boolean;
dob!: Date;
created_on!: Date;
pwd!: string;
}
export interface respData{
    userid: number;
    username: string;
    email: string;
    fname: string;
    lname: string;
    phno: bigint;
    role: string;
    isactive: boolean;
    dob: Date;
    created_on: Date;
    pwd: string;
}