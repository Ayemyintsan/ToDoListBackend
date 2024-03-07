package com.talent.todolist.repo;

import com.talent.todolist.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository <Task,Long> {
}
