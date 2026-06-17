package spring.taskmanager.infrastructure.repository;

import spring.taskmanager.domain.*;

class InMemoryTaskRepositoryTest extends TaskRepositoryTest {

    @Override
    protected TaskRepository createRepository(){
        return new InMemoryTaskRepository();
    }


}