import java.util.Scanner ;
public class main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        /*
        // Lab n°3
        //Exercise n°1
        System.out.print("Enter the number of grades: ");
        int n = scanner.nextInt();
        while ( n <= 0){
            System.out.print("The number must be strictly positive, reEnter it: ");
            n = scanner.nextInt();
        }
        int j = 0 ;
        double g ;
        for (int i = 1 ; i <= n ; i++){
            System.out.print("Enter the grade number " + i + ": ");
            g = scanner.nextDouble();
            while ( g < 0 || g > 20){
                System.out.print("The grade must be between 0 and 20, reEnter it: ");
                g = scanner.nextDouble();
            }
            if ( g >= 10) j++ ;
        }
        System.out.print("There are " + j + " marks above or equal 10");

        //Exercise n°2
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        int sum = 0, nOfDigits = 0, nmbr, r;
        double con = number -  Math.floor(number);
        while (con != 0){
            number *= 10;
            con = number -  Math.floor(number);
        }
        nmbr = (int) Math.floor(number);
        while (nmbr != 0){
            nOfDigits ++;
            r = nmbr % 10 ;
            sum += r;
            nmbr /= 10 ;
        }
        System.out.println("The sum of digits of the number you entered is: " + sum);
        System.out.println("The number has " + nOfDigits + " digits");
        System.out.println(Math.log(number) + 1);

        // Exercise n°3: Strong number
        System.out.print("Enter a natural number: ");
        int a;
        do {
            a = scanner.nextInt();
            if (a < 0) System.out.print("Invalid input, the number must be a natural number, reEnter it: ");
        }while (a < 0);
        if (a == 0) System.out.println(a + " is not a strong number.");
        else {
            int reste, sum = 0, b = a, rsum;
            while (b != 0){
                reste = b % 10;
                rsum = 1;
                for (int i = 1; i <= reste; i++){
                    rsum *= i;
                }
                sum += rsum ;
                b /= 10;
            }
            if ( sum == a) System.out.println(a + " is a strong number.");
            else System.out.println(a + " is not a strong number.");
        }

        // Exercise n°4: reverse a number
        System.out.print("Enter a natural number: ");
        int c;
        do {
            c = scanner.nextInt();
            if (c < 0) System.out.print("Invalid input, the number must be a natural number, reEnter it: ");
        }while (c < 0);
        int revNum = 0;
        if (c != 0) {
            while (c != 0){
                revNum *= 10;
                revNum += c % 10;
                c /= 10;
            }
        }
        System.out.println("The reversed number is: " + revNum);*/

        // Exercise n°6: convert from binary to decimal
        /*boolean b ;
        String vv ;
        char z ;
        int d, dec ;
        System.out.print("Enter a binary number: ");
        do {
            b = true ;
            dec = 0 ;
            vv = scanner.nextLine();
            for (int i = vv.length() - 1; i >= 0  ; i--) {
                z = vv.charAt(i);
                if (z != '1' && z != '0') {
                    System.out.print("This isn't a binary number, Re-enter the number: ");
                    b = false ;
                    break;
                }
                d = z -'0';
                dec += (int) ( d * Math.pow(2,vv.length() - i - 1));
            }

        } while ( b == false) ;
        System.out.println("The number " + vv + " in decimal is: " + dec);

        // Exercise n°7: prime factors
        System.out.print("Enter a natural number: ");
        int n= scanner.nextInt();
        while (n <= 0) {
            System.out.print("Invalid input, the number should be strictly positive, Re-enter it: ");
            n = scanner.nextInt();
        }
        if ( n == 1 ) System.out.print( n + " has only one factor: 1");
        else {
            // verify if n is prime or not
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n) ; i++){
                if ( n % i == 0) {
                    isPrime = false ;
                    break;
                }
                else continue;
            }
            if (isPrime) System.out.println( n + " is a prime number so its prime factor is only it self");
            else {
                System.out.print("The prime factors of " + n + " are: ");
                for (int i = 2; i <= n ;i++){
                    isPrime = true ;
                    if (i > 2) {
                        for (int j = 2; j * j<= i; j++) {
                            if ( i % j == 0){
                                isPrime = false ;
                                break;
                            }
                        }
                    }
                    if ( isPrime) {
                        if (n % i == 0){
                            System.out.print(i + " ");
                            while (n % i == 0){
                                n /=i;
                            }
                        }
                    }
                }
                System.out.println();
            }
        }*/

        //Exercise n°8: Average
        System.out.println("This program reads strictly positive numbers and counts their average ");
        double aver = 0 ;
        int counter = 0;
        int x;
        do {
            System.out.print("Do you want to add a number? If yes type it, if no enter '0': ");
            x = scanner.nextInt();
            while (x < 0) {
                System.out.print("ERROR, the number must be strictly positive ( or 0 to stop ), Re-enter the number: ");
                x = scanner.nextInt();
            }
            if ( x != 0){
                counter ++ ;
                aver = ( double) ( ( aver * (counter - 1 ) + x ) / counter );
            }
        } while ( x > 0);
        if ( counter == 0) {
            System.out.println("No average!");
        }
        else System.out.print("The average of the numbers you entered is: " + aver ) ;
        scanner.close();
    }
}
