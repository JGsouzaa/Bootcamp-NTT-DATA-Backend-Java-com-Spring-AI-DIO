package spring.taskmanager.application;

import org.springframework.stereotype.Service;
import spring.taskmanager.application.output.TaskOutput;
import spring.taskmanager.domain.Task;
import spring.taskmanager.domain.TaskRepository;

import java.util.List;

@Service
public class GetTasksUseCase {
    private final TaskRepository repository;

    public GetTasksUseCase(TaskRepository repository){
        this.repository = repository;
    }

    public List<TaskOutput> execute(){
        return repository.findAll().stream().map(TaskOutput::from).toList();
    }
}
