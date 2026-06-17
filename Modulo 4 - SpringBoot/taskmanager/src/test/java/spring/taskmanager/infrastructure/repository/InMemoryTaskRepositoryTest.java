package spring.taskmanager.infrastructure.repository;

import org.springframework.stereotype.Repository;
import spring.taskmanager.domain.*;

@Repository
class InMemoryTaskRepositoryTest extends TaskRepositoryTest {

    @Override
    protected TaskRepository createRepository(){
        return new InMemoryTaskRepository();
    }


}