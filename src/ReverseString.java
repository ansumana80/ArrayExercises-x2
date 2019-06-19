import java.util.Arrays;
import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner ansu = new Scanner(System.in);
        System.out.println("Enter a word to reverse");


        String joanna= ""; String reverse="";

        joanna = ansu.nextLine();

        for(int i=(joanna.length()-1); i>=0; i--)

        {
            reverse= reverse + joanna.charAt(i);
        }
        System.out.println("Reversed string of " + joanna + " is " +reverse);

        //another option, using array
        System.out.println("Enter a word to reverse");
        String jimmy="";
        jimmy = ansu.nextLine();
        String [] apple = new String [jimmy.length()];
        for(int i=(jimmy.length()-1); i>=0; i--)
        {

            apple[i]=Character.toString(jimmy.charAt(i));

        }
        for(int i=(apple.length-1); i>=0; i--)
        {

            System.out.print(apple[i]);

        }

        //Excercise 2: Write a program that will find the length
       // of an input string without using the library function.
       System.out.println("Enter a string and I will tell you its lengh");

        {

            String peso=ansu.nextLine();
            int count=0;
            char ar[]=peso.toCharArray();
            for(char c : ar)
            {
                count++;
            }
            System.out.println(count);
        }

       //Prompt the user to input 10 values and store them into an array.// If there are any duplicate values in
       // that array, remove them and print out the remaining values.

        System.out.println("Enter 10 values greater than 0. I will remove the duplicates and print the remaining");

        int[] number1 = new int[10];
        int[] number2 = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Value # " + (i+1) + " : ");
            number1[i] = ansu.nextInt();

        }
        Arrays.sort(number1);


        number2[0] = number1[0];
        for(int x = 1; x < number1.length; x++){


            int num = number1[x];
            int num2 = number1[x-1];

            if(num != num2) {
                number2[x] = num;
            }
        }

        System.out.println("Without the duplicates. Your array consists of: ");
        for(int x = 0; x < number2.length; x++)
        {
            if(number2[x] != 0)
            {
                if(number2[x] != 0)
                {
                    System.out.println(number1[x]);
                }

            }
        }


        //Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all pairs
        // from arrays 1 and 2 that gives a sum of 13

        System.out.println(("Given array 1: [1,7,6,5,9] and array 2: " +
                    "[2,7,6,3,4] \n" + "Write a program that will print " +
                "out all pairs from arrays 1 and 2 that gives a sum of 13:"));
            int[] num5= {1,7,6,5,9};
            int[] num6= {2,7,6,3,4};

            for(int i=0; i<num5.length; i++)
            {
                for(int x=0; x<num6.length; x++)
                {
                    if((num5[i] + num6[x] ==13))
                    {
                        System.out.println(num5[i] + "," + num6[x]);
                    }
                }
            }

        //Prompt the user to input 10 values and store them into an array.
        // Output the total number of odd and even values in the array.


        int[] num10 = new int[10];
        int odd = 0;
        int even = 0;


        System.out.println("Enter 10 values. I will tell you the total number of odd and even numbers: ");
        for(int r = 0; r < 10; r++)
        {
            System.out.println("Value # " + (r+1) + " : ");
            num10[r] = ansu.nextInt();

            if(num10[r]%2 == 0)
            {
                even += 1;
            }
            else
            {
                odd += 1;
            }
        }
        System.out.println("Your array contains " + Arrays.toString(num10));
        System.out.print("There are " + odd + " odd numbers, and " + even + " even numbers.");


    }




}
