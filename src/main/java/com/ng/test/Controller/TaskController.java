package com.ng.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ng.test.Model.Task;
import com.ng.test.Service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/task")
	public Task createTask(@RequestBody Task task)
	{
		return taskService.createTask(task);
	}
	
	
	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@DeleteMapping("/task/{id}")
	public void deleteTask(@PathVariable String id)
	{
		taskService.deleteTask(id);
	}
	
	
	@PutMapping("/task/{id}")
	public Task updateTask(@PathVariable String id, @RequestBody Task task)
	
	{
		return taskService.updateTask(id, task);
	}
	
	@GetMapping("/task/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable String id) {
	    Task task = taskService.getTaskById(id);
	    if (task != null) {
	        return ResponseEntity.ok(task);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	
	
}
