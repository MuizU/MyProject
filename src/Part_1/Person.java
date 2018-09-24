package Part_1;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String n){
         name = n;
    }
    public void displayName(){
        System.out.println(name);
    }
    public void setSurname(String sName){
        surname = sName;
    }
    public void setAge(int personAge){
        age = personAge;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
}
