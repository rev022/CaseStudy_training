import axios from "axios";

import React, { Component } from "react";



class ApiLogin extends Component {

    constructor(props){

        super(props)

        this.state = {

            username:'',

            pwd:''

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

        axios.get("http://localhost:8080/username/"+this.state.username+"/pwd/"+this.state.pwd,this.state)

        .then(response => {
            
            console.log(response);

                 
                if(response == true)
               
                {
                alert("Please enter Valid Credentials");
                }


        })
        
        .catch(error => {

            console.log(error)

        })

    }

   /* home(){
        this.router.navigate(['home'])
    }*/
    render(){

        const {username,pwd} = this.state

        return (

           

                        <form  onSubmit={this.submitHandler}>

                            <div>
                                username:

                                <input type="text" name="username" value={username} onChange={this.changeHandler} placeholder="username" required/>

                            </div>

                           

                            <div>

                            password :
                            <input type="password" name="pwd" value={pwd} onChange={this.changeHandler} placeholder="pwd" required/>





                            

                            </div>

                            <button className='button' onClick={this.submitHandler}> Login</button>


                        </form>

               

        )

    }

}

export default ApiLogin