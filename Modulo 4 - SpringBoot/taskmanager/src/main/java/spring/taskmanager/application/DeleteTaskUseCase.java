package spring.taskmanager.application;

import org.springframework.stereotype.Service;
import spring.taskmanager.domain.TaskId;
import spring.taskmanager.domain.TaskNotFoundException;
import spring.taskmanager.domain.TaskRepository;

@Service
public class DeleteTaskUseCase {

    private final TaskRepository repository;

    public DeleteTaskUseCase(TaskRepository repository){
        this.repository = repository;
    }

    public void execute(TaskId id){
        if (repository.findById(id).isEmpty()){
            throw new TaskNotFoundException(id);
        }

        repository.delete(id);
    }



}
