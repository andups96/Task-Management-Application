package com.application.task.management.persistence.repository;

import com.application.task.management.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {

    Optional<Project> findById(long id);

    Project save(Project project);

}
