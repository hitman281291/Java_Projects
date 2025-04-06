package ex_21_OOPs_Encapsulation.Task;

//single inheritance
public class Student extends Notes
    {
        String name;
        int Student_id;

                public Student(String name, int Student_id)
                {
                    this.name = name;
                    this.Student_id = Student_id;
                }

                public String toString()
                {
                    return name+ " " + Student_id;
                }

        @Override
        public void notes() {
            super.notes();
        }
    }
