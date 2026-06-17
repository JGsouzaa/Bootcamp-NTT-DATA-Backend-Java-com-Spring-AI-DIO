package spring.taskmanager.application;

import org.springframework.stereotype.Service;
import spring.taskmanager.application.input.UpdateTaskInput;
import spring.taskmanager.application.output.TaskOutput;
import spring.taskmanager.domain.TaskId;
import spring.taskmanager.domain.TaskNotFoundException;
import spring.taskmanager.domain.TaskRepository;

@Service
public class UpdateTaskUseCase {
    private final TaskRepository repository;

    public UpdateTaskUseCase(TaskRepository repository){
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id, UpdateTaskInput input){
        var task = repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));

        task.update(input.title(), input.description(), input.status());

        var updated = repository.save(task);

        return TaskOutput.from(updated);
    }
}
