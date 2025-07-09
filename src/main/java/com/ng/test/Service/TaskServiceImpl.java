package com.ng.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ng.test.Model.Task;
import com.ng.test.Repository.TaskRepository;
@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public Task createTask(Task task) {  //Adding Task
		return taskRepository.save(task);
	}

	@Override
	public List<Task> getAllTasks() {   //show all tasks
		return taskRepository.findAll();
	}

	@Override
	public void deleteTask(String id) {
		taskRepository.deleteById(id);
		
	}

}
