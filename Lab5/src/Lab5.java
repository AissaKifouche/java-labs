import java.util.Scanner;

public class Lab5 {
    public static void main( String ... args) {
        int exercise;
        System.out.print("What exercise do you want to see ( from 1 to 2 ): ");
        Scanner scanner = new Scanner(System.in);
        exercise = scanner.nextInt();
        switch (exercise) {
            case 1 -> {
                int[] vect = fill();
                display(vect);
                minAndMax(vect);
                System.out.println(isIn(vect, 8));
                numberOfOccurences(vect);
                int[] V1 = new int[12];
                sorter(vect,V1);
                display(V1);
                int[] V2 = new int[12] ;
                reverse(vect, V2);
                System.out.println();
                display(V2);
            }

            case 2 -> {
                System.out.print("This program creates a pascal triangle, specify its dimensions: ");
                int d = scanner.nextInt();
                int[][] pas = new int[d][d];
                pascalTrFill(pas);
                pascalTrDisp(pas);
            }

            default -> System.out.println("not valid");
        }
        scanner.close();
    }

    static int[] fill(){
        return new int[] { 4,1,6,3,8,1,6,2,8,1,5,7 };
    }

    static void display(int[] arr) {
        for (int i : arr) System.out.println(i);
    }

    static void minAndMax(int[] arr) {
        int min, max, minIndex, maxIndex;
        min = max = arr[0];
        maxIndex = minIndex = 0;
        for (int i = 1 ; i <= arr.length - 1 ; i++) {
            if (max < arr[i]){
                max = arr[i] ;
                maxIndex = i + 1;
            }
            if (min > arr[i]) {
                min = arr[i] ;
                minIndex = i + 1;
            }
        }
        System.out.println("The biggest element in the array is: " + max + " and it is found in position: " + maxIndex);
        System.out.println("The smallest element in the array is: " + min + " and it is found in position: " + minIndex);
    }

    static boolean isIn (int[] arr, int n) {
        for (int i : arr){
            if (i == n){
                return true;
            }
        }
        return false;
    }

    static void numberOfOccurences(int[] arr) {
        int num1 = arr[0], nmbrOfOcc = 1, num2 = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            num1 = arr[i];
            nmbrOfOcc = 0;
            if (!alreadyThere(num1, i, arr)) {
                for (int j = 0; j <= arr.length - 1; j++) {
                    num2 = arr[j];
                    if (num1 == num2) nmbrOfOcc++;
                }
                System.out.println("The number: " + num1 + " has occured " + nmbrOfOcc + " times");
            }
        }
    }

    static boolean alreadyThere(int a, int i , int[] arr) {
        for (int j = 0; j < i; j++) {
            if (arr[j] == a) return true;
        }
        return false;
    }

    static void sorter(int[] arr1, int[] arr2) {
        int temp;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i <= arr2.length - 1 ; i++) {
            for (int j = i; j <= arr2.length - 1 ; j++) {
                if (arr2[i] > arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
    }

    static void reverse(int[] arr1, int[] arr2) {
        if (arr2.length == arr1.length) {
            for (int i = 0; i <= arr1.length - 1; i++) {
                arr2[arr2.length - i -1] = arr1[i] ;
            }
        }
        else System.out.println("The two arrays aren't of the same size so the second array cannot conatain the elements of the first array in reversed order");
    }
    
    static void pascalTrFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i ; j++) {
                if (j == 0 || i == j) arr[i][j] = 1;
                else arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
    }

    static void pascalTrDisp (int[][] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
