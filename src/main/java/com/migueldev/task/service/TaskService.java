package com.migueldev.task.service;

import com.migueldev.task.exceptions.ResourceNotFoundException;
import com.migueldev.task.model.Task;
import com.migueldev.task.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));

        taskRepository.deleteById(id);
    }


    public Task complete(Integer id) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));

        task.setCompleted(true);
        return taskRepository.save(task);
    }
}
