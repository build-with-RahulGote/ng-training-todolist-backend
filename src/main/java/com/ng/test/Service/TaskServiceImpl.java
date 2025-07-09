package com.ng.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ng.test.Model.Task;
import com.ng.test.Repository.TaskRepository;
@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskRepository;  //Bean for Repository
	
	@Override
	public Task createTask(Task task) {  //Adding Task
		return taskRepository.save(task);
	}

	@Override
	public List<Task> getAllTasks() {   //show all tasks
		return taskRepository.findAll();
	}

	@Override
	public void deleteTask(String id) { //delete task
		taskRepository.deleteById(id);
		
	}

	@Override
	public Task updateTask(String id, Task task) { //update task
Task prev = taskRepository.findById(id).orElse(null);
	
		if(prev != null) {
			prev.setAssignTo(task.getAssignTo());;
			prev.setDescription(task.getDescription());
			prev.setDueDate(task.getDueDate());
			prev.setPriority(task.getPriority());
			prev.setStatus(task.getStatus());
			
			return taskRepository.save(prev);
		}
		return null;
	}

	@Override
	public Task getTaskById(String id) {
		
		return taskRepository.findById(id).orElse(null);
	}

	@Override
    public List<Task> searchTasks(String keyword) {
        return taskRepository.searchTasks(keyword);
    }
	

}
