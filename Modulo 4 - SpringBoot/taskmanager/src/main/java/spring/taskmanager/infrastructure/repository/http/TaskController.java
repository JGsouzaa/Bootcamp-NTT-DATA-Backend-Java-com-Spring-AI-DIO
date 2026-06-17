package spring.taskmanager.infrastructure.repository.http;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.taskmanager.application.CreateTaskUseCase;
import spring.taskmanager.application.input.CreateTaskInput;
import spring.taskmanager.infrastructure.repository.http.request.CreateTaskRequest;
import spring.taskmanager.infrastructure.repository.http.response.TaskResponse;

import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase){
        this.createTaskUseCase = createTaskUseCase;
    }

    @PostMapping
    TaskResponse create(@RequestBody CreateTaskRequest request){
        var input = request.toInput();
        var output = createTaskUseCase.execute(input);
        return TaskResponse.from(output);
    }
}
