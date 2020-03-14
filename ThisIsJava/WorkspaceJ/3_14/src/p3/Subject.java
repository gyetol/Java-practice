package p3;

public abstract class Subject {
    public abstract void addObserver(Observer o);
   // public abstract Observer removeObserver();
    public abstract void notifyObserver();
}
