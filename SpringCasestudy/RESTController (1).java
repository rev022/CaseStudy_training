package com.sonata.Rest;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins="http://localhost:4200/")
@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class RESTController {
	@Autowired
	TaskInterface task;
	//@GetMapping(value = "/task")
	@Autowired
	UserInterface user;

	
//done1
	@GetMapping(value = "/task1",produces = {"application/json"})
	public List<Task> getTask() {
		return  task.getData();	
	}
	
/*	@RequestMapping(value = "/task2", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public int setPriority() {
		return  task.setPriority(24);	
	}   */
	
	
	//done2
	@RequestMapping(value ="/taskid/{taskid}/priority/{pri}",method = RequestMethod.GET,produces = {"application/json"})
	public List<Task> printTask(@PathVariable int taskid, @PathVariable String pri, Model model) {
		model.addAttribute("pri", pri);
		model.addAttribute("taskid", taskid);
	int	row=task.setPriority(taskid,pri);
		return task.printTask(taskid);
	}	
//done3
	@PostMapping(value= "/addtask", consumes = "application/json", produces = "application/json")
	public Task addTask(@RequestBody Task t) throws Exception
	{
		task.addtask(t);
		return t;


	}
	
	//done4
	@RequestMapping(value ="/notes/{notes}/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> addNotes(@PathVariable String notes,  @PathVariable int taskid, Model model) {
		model.addAttribute("notes", notes);
		model.addAttribute("taskid", taskid);
	int	row=task.addNotes(notes,taskid);
		return task.printTask(taskid);
	}	
	
	
	
	
	//done5
	@RequestMapping(value ="/isBookMarked/{isBookMarked}/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json"})
	public List<Task> addBM( @PathVariable String isBookMarked, @PathVariable int taskid, Model model) {
		model.addAttribute("isBookMarked", isBookMarked);
		model.addAttribute("taskid", taskid);
	int	row=task.addBM(isBookMarked,taskid);
		return task.printTask(taskid);
	}	
	
	//done6
	@PostMapping(value= "/adduser", consumes = "application/json", produces = "application/json")
	public User insert(@RequestBody User u) throws Exception
	{
		user.insert(u);
		return u;


	}
	//done7
	
	@RequestMapping(value ="/taskid/{taskid}/ownerid/{ownerid}",method = RequestMethod.GET,produces = {"application/json"})
	public List<Task> assignTask(@PathVariable int taskid, @PathVariable int ownerid, Model model) {
		
		model.addAttribute("taskid", taskid);
		model.addAttribute("ownerid", ownerid);

	int	row=task.assignTask(taskid,ownerid);
		return task.printTask(taskid);
	}
	
	//done8
	@RequestMapping(value ="/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json"})
	public List<Task> SearchTask(@PathVariable int taskid,  Model model) {
		model.addAttribute("taskid", taskid);
	List<Task>	row=task.SearchTask(taskid);
		return task.printTask(taskid);
	}
	
	//done9
	@RequestMapping(value ="/status/{status}",method = RequestMethod.GET,produces = {"application/json"})
	public List<Task> TrackTask(@PathVariable String status, Model model) {
	model.addAttribute("status",status);
	List<Task>	row=task.TrackTask(status);

	return task.TrackTask(status);
	}
	//done10
	//login to user
	@RequestMapping(value ="/username/{username}/pwd/{pwd}",method = RequestMethod.GET,produces = {"application/json"})
	public boolean login(@PathVariable String pwd, @PathVariable String username, Model model) throws SQLException {
	model.addAttribute("uname",username);
	model.addAttribute("pwd", pwd);
	return user.login(username, pwd);
	}
	
	
	//delete task
	@RequestMapping(value ="/taskdel/{taskid}",method = RequestMethod.GET,produces = {"application/json"})
	public int delete(@PathVariable int taskid, Model model)  {
	model.addAttribute("taskid",taskid);
	return task.delete(taskid);
	
	
	}
	
	
	}	

	


