package Tasks;

public class Task012_RightTraingle_Pyramid {
    public static void main(String[] args) {
        // ✅ Right Triangle Star Pattern
        // *
        //**
        //***
        //****
        //*****

        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
