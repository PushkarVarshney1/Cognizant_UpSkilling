package JavaCoreExercise;

public class ClassAndObjectCreation {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "City", 2022);
        Car c2 = new Car("Hyundai", "i20", 2023);
        c1.displayDetails();
        c2.displayDetails();
    }
}
class Car {

    String mk;
    String md;
    int y;

    Car(String mk, String md, int y) {
        this.mk = mk;
        this.md = md;
        this.y = y;
    }

    void displayDetails() {
        System.out.println(mk + " " + md + " " + y);
    }
}