package Part_1;

public class MyApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person p = new Person("Ben");
        p.displayName();
        //First person
        Person person1 = new Person("Muiz");
        person1.setAge(19);
        person1.setSurname("Uvais");
        //second person
        Person person2 = new Person("Muiz1");
        person2.setSurname("Uvais1");
        person2.setAge(20);
        //third person
        Person person3 = new Person("Muiz2");
        person3.setAge(21);
        person3.setSurname("Uvais2");


            }
}
