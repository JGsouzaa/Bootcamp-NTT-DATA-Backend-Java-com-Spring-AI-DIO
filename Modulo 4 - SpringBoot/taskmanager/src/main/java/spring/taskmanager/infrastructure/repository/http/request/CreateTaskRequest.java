package spring.taskmanager.infrastructure.repository.http.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import spring.taskmanager.application.input.CreateTaskInput;

import java.util.Optional;

public record CreateTaskRequest (
        @NotBlank
        @Size(min=3, max=100, message="Length must be at least 3 and max 100")
        String title,
        Optional<@Size(max=500)String> description) {
    public CreateTaskInput toInput() {
        return new CreateTaskInput(title, description);
    }
}
