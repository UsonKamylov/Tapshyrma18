public class Main {
    public static void main(String[] args) {

        Person person=new Person("Uson",23);
        Person person2=new Person("Asan",24);
        Person person3=new Person("Bakyt",22);
        Person[] family=new Person[]{person,person2,person3};

        Flat flat=new Flat("Streleskaya",family);
        flat.paiment();
        System.out.println(flat);
        System.out.println(family.length);

        Person perso=new Person("Kumar",30);
        Person perso2=new Person("Aibek",17);
        Person perso3=new Person("Mukabyl",27);
        Person[] familys=new Person[]{perso,perso2,perso3};

        Dormitoris dormitoris=new Dormitoris("Novokuzneskaya",family);
        dormitoris.paiment();
        System.out.println(dormitoris);
        System.out.println(familys.length);








    }
}