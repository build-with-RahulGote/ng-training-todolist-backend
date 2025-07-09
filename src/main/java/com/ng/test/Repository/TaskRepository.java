package com.ng.test.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ng.test.Model.Task;
@Repository
public interface TaskRepository extends MongoRepository<Task,String>{
	@Query("{ '$or': [ " +
	           "{ 'assignTo': { $regex: ?0, $options: 'i' } }, " +
	           "{ 'description': { $regex: ?0, $options: 'i' } } " +
	           "] }")
	List<Task> searchTasks(String keyword);
	
	  Page<Task> findAll(Pageable pageable);
}
