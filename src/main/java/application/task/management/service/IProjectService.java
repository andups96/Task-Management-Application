package application.task.management.service;

import application.task.management.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(long id);

    Project save(Project project);
}
