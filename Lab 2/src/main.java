import java.lang.constant.Constable;
import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Lab n°2 exercise n°1 question n°1
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("The number's absolute value is: " + Math.abs(num));
        System.out.println("The number's square is: " + Math.pow(num, 2));
        if ( num < 0){
            System.out.println(num + " is a negative number so it doesn't have a square root");
        }
        else {
            System.out.println("The number's square root is: " + Math.sqrt(num));
        }
        System.out.println("The exponential of " + num + " is: " + Math.exp(num));
        System.out.println("The integer part of " + num + " is: " + Math.floor(num));

        // question n°2
        String s1,s2;
        System.out.print("Enter a string: ");
        s1 = scanner.nextLine();
        System.out.print("Enter another string: ");
        s2 = scanner.nextLine();
        System.out.println("The length of the first string is: " + s1.length() + " and the length of the second string is: " + s2.length());
        System.out.println("The concatenation of the two strings is: " + s1.concat(s2));

        // exercise n°3 question n°2
        System.out.print("Enter three words, enter the first: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter the third word: ");
        String str3 = scanner.nextLine();
        if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0){
            if ( str2.compareTo(str3) < 0){
                System.out.println("The order of the three words is: \n1." + str1 +"\n2." + str2+ "\n3." + str3);
            }
            else System.out.println("The order of the three words is: \n1." + str1 +"\n2." + str3 + "\n3." + str2);
        }
        else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0){
            if (str1.compareTo(str3) < 0){
                System.out.println("The order of the three words is: \n1." + str2 +"\n2." + str1+ "\n3." + str3 );
            }
            else System.out.println("The order of the three words is: \n1." + str2 +"\n2." + str3+ "\n3." + str1 );
        }
        else {
            if (str1.compareTo(str2) < 0) System.out.println("The order of the three words is: \n1." + str3 +"\n2." + str1+ "\n3." + str2 );
            else System.out.println("The order of the three words is: \n1." + str3 +"\n2." + str2+ "\n3." + str1 );
        }

        // exercise n°4
        System.out.println("This program is small calculator that performs addition, substraction, multiplication and division between two numbers");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Choose an operator from this list: \n+ for addition \n- for substraction \n* for multiplication \n/ for division");
        System.out.print("You choose: ");
        String operator = scanner.nextLine();
        char op = operator.charAt(0);
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        double res ;
        switch (op){
            case '+' -> {
                res = num1 + num2 ;
                System.out.print("The result is: " + res );
            }
            case '-' -> {
                res = num1 - num2 ;
                System.out.print("The result is: " + res );
            }
            case '*' -> {
                res = num1 * num2 ;
                System.out.print("The result is: " + res );
            }
            case '/' -> {
                if (num2 != 0){
                    res = (double) num1 / num2 ;
                    System.out.print("The result is: " + res );
                }
                else System.out.println("You can't divide on 0");
            }
        }

        // Exercise n°5
        System.out.println("This program solves the equations of the form ax²+bx+c=0");
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();
        if (a == 0){
            System.out.println("The equation has one solution which is: "+ -c/b);
        }
        else {
            double delta = Math.pow(b, 2) - 4 * a * c ;
            if (delta > 0){
                System.out.println("The equation has two solutions: ");
                System.out.println("The first solution is: " + (-b + Math.sqrt(delta))/(2 * a) + "      The second solution is: " + (-b - Math.sqrt(delta))/(2 * a));
            } else if (delta == 0) {
                System.out.println("The equation has a double solution which is: " + -b/(2 * a));
            }
            else {
                System.out.println("The solution has no solution in the set of real numbers but has two solutions in the set of imaginary numbers: ");
                String sol1, sol2;
                sol1 = ( (double) -b/(2 * a)) + " + " +( Math.sqrt(-delta) / (2 * a)) + " i" ;
                sol2 = ( (double) -b/(2 * a)) + " - " +( Math.sqrt(-delta) / (2 * a)) + " i" ;
                System.out.println("The first imaginary solution is: (" + sol1 + ")   The second imaginary solution is: (" + sol2 + ")" );
            }
        }

        // Exercise n°6
        final double TVA = 0.17;
        System.out.print("Enter the number of items: ");
        int nmbrItems = scanner.nextInt();
        System.out.print("Enter the price of a unit in dinars: ");
        double price = scanner.nextDouble();
        double amount = nmbrItems * price ;
        double total;
        if (amount >= 100000){
            total = amount + amount * TVA - amount * 0.1 ;
            System.out.println("The unit price is: " + price + " DZA, the amount before tax is: " + amount + " DZA, the total price with taxes and discount is: " + total + "DZA");
        }
        else if ( amount >= 50000 ) {
            total = amount + amount * TVA - amount * 0.05 ;
            System.out.println("The unit price is: " + price + " DZA, the amount before tax is: " + amount + " DZA, the total price with taxes and discount is: " + total + "DZA");
        }
        else {
            total = amount + amount * TVA ;
            System.out.println("The unit price is: " + price + " DZA, the amount without taxes is: " + amount + " DZA, you don't have a discount, so the total price with taxes is: " + total + " DZA");
        }
        scanner.close();
    }
}

