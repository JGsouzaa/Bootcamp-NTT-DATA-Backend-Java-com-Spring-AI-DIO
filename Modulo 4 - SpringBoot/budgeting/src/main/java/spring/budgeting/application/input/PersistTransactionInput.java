package spring.budgeting.application.input;

import spring.budgeting.domain.Category;

public record PersistTransactionInput(String description, long amount, Category category) {
}
