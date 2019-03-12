package com.felixmutua.service;

import com.felixmutua.domain.Task;

import java.util.Optional;

public interface TaskService {


    Iterable<Task> list();

    Task save (Task task);

    Optional<Task> findById(Long aLong);


}
