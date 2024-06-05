package datastructures.set;

import builders.SetBuilder;

import java.util.Arrays;
import java.util.Random;

public class StaticSet implements ISet {
    private final int max;

    private final int[] array;
    private int count;

    public StaticSet(SetBuilder builder) {
        this.max = builder.getMax();
        this.array = builder.getArray();
        this.count = builder.getCount();
    }

    @Override
    public void add(int a) {
        if (count == max) {
            throw new RuntimeException("Limite de elementos alcanzado");
        }
        for (int i = 0; i < count; i++) {
            if (this.array[i] == a) {
                return;
            }
        }
        this.array[count] = a;
        this.count++;
    }

    @Override
    public void remove(int a) {
        for (int i = 0; i < count; i++) {
            if (this.array[i] == a) {
                this.array[i] = this.array[count - 1];
                count--;
                return;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int choose() {
        if (this.count == 0) {
            throw new RuntimeException("No se puede elegir un valor de un conjunto vacio");
        }
        return this.array[new Random().nextInt(this.count)];
    }

    @Override
    public String toString() {
        return "StaticSet{max=" + max + ", count=" + count + ", array=" + Arrays.toString(array) + '}';
    }
}
