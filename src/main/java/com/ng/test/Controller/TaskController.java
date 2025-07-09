package com.ng.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ng.test.Model.Task;
import com.ng.test.Service.TaskService;


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
}
