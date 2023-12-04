package Model;

public class MyArray<T> {
    private T[] array;

    public MyArray() {
    }

    public MyArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
