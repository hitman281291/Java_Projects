package ex_18_OOPs_Constructor;

public class Assignment_constuctor
{
    public static void main(String[] args)
    {
            Person p = new Person();  //Default constructor

            Person p1 = new Person("Arpita",28,"Bangalore",8765478,false); //Parameterized constructor

            p.behavior();
            p1.behavior();
    }

    static class Person
    {
        String name;
        int age;
        String Address;
        long phone;
        boolean isMale;

        Person ()  //Direct constructor
        {
            System.out.println("This is a default constructor for person class");
            name = "Hitesh";
            age = 33;
            Address = "Bangalore";
            phone = 89876545;
            isMale = true;

            System.out.println(name);
            System.out.println(age);
            System.out.println(Address);
            System.out.println(phone);
            System.out.println(isMale);

        }

        Person (String name_arg, int age_arg, String Address_arg, long phone_arg, boolean isMale_arg)
        {
            System.out.println("This is under parameterized constuctor");
            this.name = name_arg;
            this.age = age_arg;
            this.Address = Address_arg;
            this.phone = phone_arg;
            this.isMale = isMale_arg;

            System.out.println(this.name);
            System.out.println(this.age);
            System.out.println(this.Address);
            System.out.println(this.phone);
            System.out.println(this.isMale);

        }

        void behavior()
        {
            System.out.println(this.name+" is eating");
            System.out.println(this.name+" lives at "+this.Address);
            System.out.println(this.name+" has phone number "+this.phone);
            System.out.println(this.name+" walks 10000 steps daily ");
        }
    }
}
