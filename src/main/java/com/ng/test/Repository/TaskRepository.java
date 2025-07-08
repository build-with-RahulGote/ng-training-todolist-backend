package com.ng.test.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ng.test.Model.Task;

public interface TaskRepository extends MongoRepository<Task,String>{

}
