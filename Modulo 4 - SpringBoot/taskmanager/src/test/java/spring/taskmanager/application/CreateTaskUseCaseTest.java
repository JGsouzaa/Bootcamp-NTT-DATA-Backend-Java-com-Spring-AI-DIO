package spring.taskmanager.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.taskmanager.application.input.CreateTaskInput;
import spring.taskmanager.application.output.TaskOutput;
import spring.taskmanager.domain.Task;
import spring.taskmanager.domain.TaskRepository;
import spring.taskmanager.infrastructure.repository.InMemoryTaskRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CreateTaskUseCaseTest {

    @Mock
    TaskRepository repository;

    @InjectMocks
    CreateTaskUseCase useCase;

//    @BeforeEach
//    void setup(){
//        this.useCase = new CreateTaskUseCase(new InMemoryTaskRepository());
//    }

    @Test
    void should_create_task_successfully(){
        //given
        var input = new CreateTaskInput("Study Java", Optional.of("Finish records module"));

        when(repository.save(any(Task.class)))
                .then(invocation -> invocation.getArgument(0));

        //when
        TaskOutput output = useCase.execute(input);

        //then
        assertNotNull(output);
        assertNotNull(output.id());
        assertEquals("Study Java", output.title());
        assertEquals(Optional.of("Finish records module"), output.description());

        verify(repository, times(1)).save(any(Task.class));
    }

}