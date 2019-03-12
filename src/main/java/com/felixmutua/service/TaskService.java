package com.felixmutua.service;

import com.felixmutua.domain.Task;

public interface TaskService {


    Iterable<Task> list();

    Task save (Task task);
}
