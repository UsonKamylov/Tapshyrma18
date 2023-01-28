import java.util.Arrays;

public class Flat  implements Live {
    private String address;
    private Person[]family;

    public Flat(String address, Person[] family) {
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
        System.out.println("Kvartirada aiyna 45 tys rub toloshot");

    }

    @Override
    public String toString() {
        return "Flat{" +
                "address='" + address + '\'' +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
