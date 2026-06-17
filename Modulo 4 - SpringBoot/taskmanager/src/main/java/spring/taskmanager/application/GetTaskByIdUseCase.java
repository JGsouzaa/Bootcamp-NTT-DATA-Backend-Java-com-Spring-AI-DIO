package spring.taskmanager.application;

import org.springframework.stereotype.Service;
import spring.taskmanager.application.output.TaskOutput;
import spring.taskmanager.domain.TaskId;
import spring.taskmanager.domain.TaskNotFoundException;
import spring.taskmanager.domain.TaskRepository;

@Service
public class GetTaskByIdUseCase {
    private final TaskRepository repository;

    public GetTaskByIdUseCase(TaskRepository repository){
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id){
        return repository.findById(id).map(TaskOutput::from).orElseThrow(() -> new TaskNotFoundException(id));
    }
}
