package com.ng.test.Model;

import java.time.LocalDate;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "tasks")
public class Task {
	
	@Id
	private String id;
	
	private String assignTo;
	private String description;
	private String status;
	private String priority;
	private LocalDate dueDate; 
	
	
}