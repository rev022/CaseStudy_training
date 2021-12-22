import React, { Component } from "react";
import axios from "axios";

class ApiSearch extends Component{
    constructor(props){
        super(props)
        this.state = {
            
            tasks:[],
            taskid: ''
        }
        this.handleClick= this.handleClick.bind(this)
    }

    changeHandler = (event) => {

        this.setState({[event.target.name]:event.target.value})

    }
        handleClick () {
            axios.get('http://localhost:8080/taskid/'+this.state.taskid)
            .then(response=>{ this.setState({tasks: response.data})
            console.log(response.data)
            })
        }

        render(){
            const {tasks,taskid}= this.state
            return(
                <div>
                    <form  onSubmit={this.submitHandler}>

<div>

    <input type="number" name="taskid" value={taskid} onChange={this.changeHandler} placeholder="Task ID" required/>

</div>

</form>

                    <button className='button' onClick={this.handleClick}> Task Details</button>

                    <h3> Details of all task</h3>
                    {
                        tasks.map(task=>
                           <div key={task.taskid}> <br />
                               TASKID: {task.taskid} <br />
                               OWNERID: {task.ownerid} <br/>
                               CREATORID: {task.creatorid} <br />
                               NAME: {task.name} <br />
                               DESCRIPTION: {task.descrptn} <br />
                               STATUS: {task.status} <br />
                               PRIORITY: {task.priority} <br />
                               NOTES: {task.notes} <br />
                               CREATED_ON: {task.created_on} <br />
                               STATUS_CHANGED_ON: {task.status_changed_on} <br />
                               </div>
                            )
                    }

                    </div>


            )
        }
    }
export default ApiSearch;