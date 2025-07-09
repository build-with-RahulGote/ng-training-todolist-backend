package com.ng.test.Service;

import java.util.List;

import com.ng.test.Model.Task;

public interface TaskService {

	Task createTask(Task task);
	List<Task> getAllTasks();
	void deleteTask(String id);
	Task updateTask(String id,Task task);
	Task getTaskById(String id);
	
	List<Task> searchTasks(String keyword);
}
