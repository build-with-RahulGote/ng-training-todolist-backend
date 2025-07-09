package com.ng.test.Service;

import java.util.List;

import com.ng.test.Model.Task;

public interface TaskService {

	Task createTask(Task task);
	List<Task> getAllTasks();
	void deleteTask(String id);
}
