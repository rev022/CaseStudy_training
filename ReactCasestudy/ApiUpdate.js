import axios from "axios";

import React, { Component } from "react";



class ApiUpdate extends Component {

    constructor(props){

        super(props)

        this.state = {

            taskid:'',

            priority:'',

        }

        this.changeHandler=this.changeHandler.bind(this);

        this.submitHandler=this.submitHandler.bind(this);

    }



    changeHandler = (event) => {

        this.setState({[event.target.name]:event.target.value})

    }
    submitHandler = (event) => {

        event.preventDefault()

        console.log(this.state)

        axios.get("http://localhost:8080/taskid/"+this.state.taskid+"/priority/"+this.state.priority,this.state)

        .then(response => {

            console.log(response)

        })
        
        .catch(error => {

            console.log(error)

        })

    }
    render(){

        const {taskid,priority} = this.state

        return (

           

                        <form  onSubmit={this.submitHandler}>

                            <div>

                                <input type="number" name="taskid" value={taskid} onChange={this.changeHandler} placeholder="Task ID" required/>

                            </div>

                           

                            <div>

                            Priority :

                            <select  name="priority" value={priority} onChange={this.changeHandler} >

                                <option value="High">High</option>

                                <option value="Medium">Medium</option>

                                <option value="Low">Low</option>

                            </select>

                            </div>
                            <button type="submit">Submit</button>

                        </form>

               

        )

    }

}

export default ApiUpdate