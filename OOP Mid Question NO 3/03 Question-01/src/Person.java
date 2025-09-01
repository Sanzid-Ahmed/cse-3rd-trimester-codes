public class Person {
    public String name, gender;
    private int age; // private = restricted access

    // Write constructor to initialize name and gender with this reference keyword;
    Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    // Write getter method for age;
    int getAge(){
        return age;
    }
    // Write setter method for age;
    void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Prof. Albert Einstein", "Male");
        System.out.println(p1.name);
    }
}