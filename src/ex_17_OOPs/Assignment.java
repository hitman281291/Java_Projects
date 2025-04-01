package ex_17_OOPs;

public class Assignment
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.name("Hitesh");
        System.out.println(p.person_heihgt(5));
        System.out.println(p.weihgt());
        System.out.println();

    }

    static class Person
    {
        int height;
        int weight;
        int age;
        String name;
        String address;
        String phone;
        String email;
        String gender;
        String bloodGroup;
        int salary;

        int person_heihgt(int height)
        {
            return height;
        }

        void name (String name)
        {
            System.out.println(name);
        }

        float weihgt()
        {
            float weight = 10.0f;
            return weight;
        }

        void age()
        {

        }
    }
}
