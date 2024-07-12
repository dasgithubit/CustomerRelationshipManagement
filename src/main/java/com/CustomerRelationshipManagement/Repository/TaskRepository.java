package com.CustomerRelationshipManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerRelationshipManagement.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
