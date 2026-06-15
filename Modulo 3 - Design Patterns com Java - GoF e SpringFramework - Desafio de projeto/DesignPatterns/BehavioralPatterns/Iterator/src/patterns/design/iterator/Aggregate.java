package patterns.design.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
