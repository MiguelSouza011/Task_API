package com.migueldev.task.service;

import com.migueldev.task.model.Task;
import com.migueldev.task.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task saveTask(Task task) {
        task.setCompleted(false);
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }
}
