package com.application.task.management.service;

import com.application.task.management.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(long id);

    Project save(Project project);
}
