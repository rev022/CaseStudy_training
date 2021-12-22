import React from "react";
import axios from "axios";
import StudComponent from "./StudComponent";
import ClassComponent from "./ClassComponent";
import AssignmentProdComp from "./AssignmentProdComp";
import StateExample from "./StateExample";
import reactDom from "react-dom";
import { Route, Link, BrowserRouter as Router, Routes } from "react-router-dom";
import ApiGet from "./ApiGet";
import ApiAddTask from "./ApiAddTask";
import ApiUpdate from "./ApiUpdate";
import ApiLogin from "./ApiLogin"
import ApiDel from "./ApiDel";
import ApiSearch from "./ApiSearch";

const routing =(
    <Router>
        <body style={{backgroundColor:"lightblue", textAlign:"center"}}>
        <div>
            <ul>
                <li>
                   <button> <Link to="/" >login </Link></button>
                </li>
                <li>
                <button> <Link to="/get" > get task details</Link></button>

                </li>
                <li>
                <button><Link to="/updatepri" > update priority</Link></button>

                </li>
                <li>
                <button>  <Link to="/addtask" > add task</Link></button>

                </li>

                <li>
                <button><Link to="/deltask" > delete task</Link></button>

                </li>

                <li>
                <button><Link to="/searchtask" > search task</Link></button>

                </li>
            </ul>
        <Routes>
            <Route path="/" element ={<ApiLogin />} />
            <Route path="/get" element ={<ApiGet />} />
            <Route path="/updatepri" element ={<ApiUpdate />} />
            <Route path="/addtask" element ={<ApiAddTask />} />
            <Route path="/deltask" element ={<ApiDel />} />
            <Route path="/searchtask" element ={<ApiSearch />} />







        </Routes>
        </div>
        </body>
    </Router>
)
export default  routing;
