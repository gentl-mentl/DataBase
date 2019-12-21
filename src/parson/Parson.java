package parson;

public class Parson {

    public  String firstName;
    public String lastName;
    public int age;

    public Parson(String firstName, String lastName,int age)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }
    public void display()
    {


        System.out.print(getFirstName()+" ");
        System.out.print(getLastName());
        System.out.print(" " +getAge());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
