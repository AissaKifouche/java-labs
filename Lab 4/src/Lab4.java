import java.util.Scanner;

public class Lab4 {
    public static void main (String [] Args) {
        // Lab 4
        Scanner scanner = new Scanner(System.in);

        // Exercise n°1: integer and fractional parts
        /*System.out.print("Enter a number: ");
        double a = scanner.nextDouble();
        intPart(a);*/

        // Exercise n°2:
        /*System.out.println("Enter X and N to calculate the series in Exercise n°2");
        System.out.print("X = ");
        int x = scanner.nextInt();
        System.out.print("N = ");
        int n = scanner.nextInt();
        double sum = 1 ;
        for (int i = 0; i <= n ; i++) {
            sum += ( double ) ( i * (power(-1,i) / (power(x, i) + i))) ;
        }
        System.out.println("The sum is: " + sum );

        // Exercise n°3: reverse each word
        System.out.print("Enter some text: \n");
        String txt = scanner.nextLine();
        System.out.println("This program will reverse each word of your text alone, if it's a word it will be reversed, if it's a sentence each word will be reversed alone");
        String ss = mirror( txt );
        System.out.print("The reversed text is: " + ss);

        //Exercise n°4: Palindrom
        System.out.print("Enter a word: ");
        String word = scanner.next();
        if ( isPalindrom(word) ) System.out.println("The word " + word + " is a palindrom word");
        else System.out.println("The word " + word + " is not a palindrom word");

        //Exervise n°5: number of words in a sentence and the longest one
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        nbrWord(sentence);*/

        //Exercise n°7: Execution time
        long t1 = System.currentTimeMillis() ;
        long t2 = pressEnter();
        long t3 = t2 - t1;
        System.out.println("The execution time is: " + t3 + "ms" );

        scanner.close();
    }
    static double power ( double a, int b) {
        if (b == 0) return 1 ;
        else if (b == 1) return a ;
        double result = 1 ;
        for (int i = 1; i <= b ; i++) {
            result *= a ;
        }
        return result ;
    }

    static long pressEnter (){
        System.out.print("Press Enter: ");
        Scanner n = new Scanner(System.in);
        n.nextLine();
        return System.currentTimeMillis();
    }

    static void nbrWord ( String sent ){
        sent += " .";
        int nmbr = 0;
        String w1 = "", w2 = "";
        if (sent.charAt(0) != ' ') nmbr ++ ;
        int i = 0;
        while ( i <= sent.length() - 1 ) {
            if (sent.charAt(i) != ' ') w2 += sent.charAt(i);
            if ( sent.charAt(i) == ' ' && sent.charAt(i + 1) != ' ' ){
                nmbr++;
                if ( sent.charAt(i + 1) == '.' ) nmbr -- ;
                if (w1.length() >= w2.length()) w2 = "";
                else {
                    w1 = w2;
                    w2 = "";
                }
            }
            if ( w1.length() != 0 && w1.charAt(w1.length() - 1) == '.' ) {
                String w3 = "";
                for (int j = 0; j < w1.length()-1 ; j++) {
                    w3 += w1.charAt(j);
                }
                w1 = w3 ;
            }
            i++;
        }

        System.out.println("The number of words in your sentence is: " + nmbr);
        System.out.println("The longest word in your sentence is: " + w1);
    }

    static boolean isPalindrom( String word){
        if ( word.length() == 1) return true;
        int i = 0;
        boolean pali = true ;
        do {
            if ( word.charAt(i) != word.charAt(word.length() - i - 1) ){
                pali = false;
                break;
            }
            i ++;
        } while ( i <= word.length() - i - 1);
        return pali;
    }

    static String mirror (String text ){
        text += ".+" ;
        String a = "", ret ="";
        int i = 0 ;
        while ( i < text.length()-1 && ( text.charAt(i) != '.'  &&  text.charAt(i + 1) != '+') ){
            if (text.charAt(i) == ' '){
                for (int j = a.length() - 1; j >=0 ; j--) {
                    ret += a.charAt(j) ;
                }
                ret += " ";
                a = "" ;
                i++;
                continue ;
            }
            a += text.charAt(i) ;
            i++ ;
            if( i == text.length() - 2){
                for (int j = a.length() - 1; j >= 0 ; j--) {
                    ret += a.charAt(j) ;
                }
            }
        }
        return ret ;
    }

    static void intPart ( double a ){
        int i = 0 ;
        do {
            i++;
        } while ( i <= a - 1 ) ;
        double b = a - i ;
        System.out.println("The integer part of the number " + a + " is: " + i );
        System.out.println("and its decimal part is: " + b );
    }
}
