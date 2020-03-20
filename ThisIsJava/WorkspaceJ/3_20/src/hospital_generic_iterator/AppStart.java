package hospital_generic_iterator;

public class AppStart {
    public static void main(String[] args) {
        Hospital<Animal> hospital= new AnimalHospital<>(100);
        hospital.cure(new Dog());
        hospital.cure(new Cat());
        hospital.cure(new Cat());
        hospital.cure(new Dog());
        hospital.cure(new Dog());
        hospital.cure(new Dog());
        hospital.cure(new Cat());
        hospital.cure(new Dog());
    }
}
