package spring.budgeting.infrastructure.persistency.repository;

import org.springframework.data.repository.CrudRepository;
import spring.budgeting.domain.Category;
import spring.budgeting.infrastructure.persistency.entity.TransactionEntity;

import java.util.List;
import java.util.UUID;

public interface TransactionEntityRepository extends CrudRepository<TransactionEntity, UUID> {
    List<TransactionEntity> findAllByCategory(Category category);
}
