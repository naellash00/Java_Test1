import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1.Write a Java program that accept three numbers
        // from the user and print the largest number .
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();
        int max;
        if(number1>number2 && number1 >number3)
            max = number1;
        else if(number2>number1 && number2>number3)
            max = number2;
        else
            max = number3;
        System.out.println("The largest number is " +  max);
        input.nextLine();

        System.out.println("**************************");

        //2.Write a Java program that accept a String and a number from the user,
        // then print the character in the given index .
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        System.out.println("Enter a number of index: ");
        int numberOfIndex = input.nextInt();
        if(numberOfIndex < inputString.length()){
            for (int i = 0; i < inputString.length(); i++) {
                if(i==numberOfIndex)
                    System.out.println(inputString.charAt(i));
            }
        }
        else
            System.out.println("your index is out of bounds");

        System.out.println("**************************");

        //3. Write a program to enter the numbers till the user wants
        // and at the end it should display the sum entered
        int sum = 0, manyNumbers;
        do{
            System.out.println("Enter any numbers you want (and 0 to quit)");
            manyNumbers = input.nextInt();
            sum += manyNumbers;
        } while(manyNumbers != 0);
        System.out.println("The sum of the numbers is " + sum);

        System.out.println("**************************");

        //4.Write a Java program to find positive and negative numbers
        // of a given array: [10, -21 , 30, 31, -25]
        int [] checkNumbers = {10, -21 , 30, 31, -25};
        for(int i : checkNumbers){
            if(i>0)
                System.out.print(i + " is a positive number \n");
            else
                System.out.print(i + " is a negative number  \n");
        }

        System.out.println("**************************");

        //5.Write a Java program to find a shortest word of a given array:
        // [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
        String [] listOfWords = {"Tuwaiq","Bootcamp","Student","JAVA"}; //5

        int shortestWordLength = listOfWords[0].length(); //6

        String shortestWord = "null";
        for (int i = 0; i < listOfWords.length; i++) {
            // i=0, if(6<6) x -> i=1, if(8<6) x -> i=2, if(7<6) x ->
            // i=3 if(4<6), shortestWord = java -> i=4, if(2<4XX6
            if(listOfWords[i].length() < shortestWordLength){
                shortestWordLength = listOfWords[i].length();
                shortestWord = listOfWords[i];
            }
        }
        System.out.println("The shortest word is " + shortestWord);
    } // end main
}