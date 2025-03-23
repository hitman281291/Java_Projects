package Tasks;

public class Task013_Left_Trainagle {
    public static void main(String[] args) {
        // ✅ Left Triangle Star Pattern
        //
        //*****
        //****
        //***
        //**
        //*

        for(int i=5; i>=1 ; i--)
        {
           for (int j=1; j<=i; j++)
           {
               System.out.print("*");
           }
            System.out.println();
        }

    }
}
