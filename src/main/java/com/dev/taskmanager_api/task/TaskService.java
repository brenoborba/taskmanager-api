package com.dev.taskmanager_api.task;

import com.dev.taskmanager_api.user.User;
import com.dev.taskmanager_api.user.UserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final UserService userService;

    public TaskService(TaskRepository taskRepository, UserService userService) {
        this.taskRepository = taskRepository;
        this.userService = userService;
    }

//    @Transactional
//    public Task create(Task task) {
//
//    }
}
