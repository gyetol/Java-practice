package hospital_generic_iterator;

public interface Curable<T> {
    public abstract T cure(T obj);
}
