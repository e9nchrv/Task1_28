package ru.vsu.cs.klokov_e_a;

public interface PriorityQueue<T> {
    void add(T value);
    T remove() throws Exception;
    T element() throws Exception;
    int count();
    boolean empty();
}
