package datastructures.stack;

import builders.StackBuilder;

import java.util.Arrays;

public class Stack implements IStack {

    private static final int MAX = 10000;

    private final int[] array;
    private int count;

    public Stack(StackBuilder builder) {
        this.array = builder.getArray();
        this.count = builder.getCount();
    }

    @Override
    public void add(int a) {
        if (this.count >= MAX) {
            throw new RuntimeException("Limite excedido");
        }
        this.array[this.count++] = a;
    }

    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        this.count--;
    }

    @Override
    public int getTop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return this.array[this.count - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public String toString() {
        return "Stack{" + "array=" + Arrays.toString(array) + ", count=" + count + '}';
    }
}
