import java.util.Arrays;

public class Dormitoris  implements Live{
    private String address;
    private Person[]family;

    public Dormitoris(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public void paiment() {
        System.out.println("Obshejiteada aiyna 20 tys rub toloshot");

    }

    @Override
    public String toString() {
        return "Dormitoris{" +
                "address='" + address + '\'' +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
