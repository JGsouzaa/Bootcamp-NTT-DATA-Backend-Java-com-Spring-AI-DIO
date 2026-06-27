package spring.budgeting.infrastructure.http.request;

import spring.budgeting.application.input.PersistTransactionInput;
import spring.budgeting.domain.Category;

public record TransactionRequest(String description, Category category, long amount) {
    public PersistTransactionInput toInput() {
        return new PersistTransactionInput(description, amount, category);
    }
}