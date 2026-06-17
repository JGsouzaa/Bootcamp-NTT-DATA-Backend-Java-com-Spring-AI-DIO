package spring.taskmanager.application;

import org.springframework.stereotype.Service;
import spring.taskmanager.application.input.CreateTaskInput;
import spring.taskmanager.application.output.TaskOutput;
import spring.taskmanager.domain.Task;
import spring.taskmanager.domain.TaskRepository;

@Service
public class CreateTaskUseCase {
    private final TaskRepository repository;

    public CreateTaskUseCase(TaskRepository repository){
        this.repository = repository;
    }

    public TaskOutput execute(CreateTaskInput input) {
        var task = new Task(input.title(), input.description());
        var saved = repository.save(task);
        return TaskOutput.from(saved);
    }
}
