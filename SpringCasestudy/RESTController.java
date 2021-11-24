package com.sonata.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	@Autowired
	TaskInterface task;
	//@GetMapping(value = "/task")
	@Autowired
	UserInterface user;

	

	@RequestMapping(value = "/task1", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> getTask() {
		return  task.getData();	
	}
	
/*	@RequestMapping(value = "/task2", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public int setPriority() {
		return  task.setPriority(24);	
	}   */
	
	@RequestMapping(value ="/taskid/{taskid}/priority/{pri}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask(@PathVariable int taskid, @PathVariable String pri, Model model) {
		model.addAttribute("pri", pri);
		model.addAttribute("taskid", taskid);
	int	row=task.setPriority(taskid,pri);
		return task.printTask(taskid);
	}	

	@PostMapping(value= "/addtask", consumes = "application/json", produces = "application/json")
	public Task addTask(@RequestBody Task t) throws Exception
	{
		task.addtask(t);
		return t;


	}
	@RequestMapping(value ="/notes/{notes}/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> addNotes(@PathVariable String notes,  @PathVariable int taskid, Model model) {
		model.addAttribute("notes", notes);
		model.addAttribute("taskid", taskid);
	int	row=task.addNotes(notes,taskid);
		return task.printTask(taskid);
	}	
	
	
	
	
	
	@RequestMapping(value ="/isBookMarked/{isBookMarked}/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> addBM( @PathVariable String isBookMarked, @PathVariable int taskid, Model model) {
		model.addAttribute("isBookMarked", isBookMarked);
		model.addAttribute("taskid", taskid);
	int	row=task.addBM(isBookMarked,taskid);
		return task.printTask(taskid);
	}	
	
	
	@PostMapping(value= "/adduser", consumes = "application/json", produces = "application/json")
	public User insert(@RequestBody User u) throws Exception
	{
		user.insert(u);
		return u;


	}
	@RequestMapping(value ="/taskid/{taskid}/ownerid/{ownerid}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> assignTask(@PathVariable int taskid, @PathVariable int ownerid, Model model) {
		
		model.addAttribute("taskid", taskid);
		model.addAttribute("ownerid", ownerid);

	int	row=task.assignTask(taskid,ownerid);
		return task.printTask(taskid);
	}
	@RequestMapping(value ="/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> SearchTask(@PathVariable int taskid,  Model model) {
		model.addAttribute("taskid", taskid);
	List<Task>	row=task.SearchTask(taskid);
		return task.printTask(taskid);
	}
	@RequestMapping(value ="/status/{status}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> TrackTask(@PathVariable String status, Model model) {
	model.addAttribute("status",status);
	List<Task>	row=task.TrackTask(status);

	return task.TrackTask(status);
	}
	
	
	
	
	}	

	


