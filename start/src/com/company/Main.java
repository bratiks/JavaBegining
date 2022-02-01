package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("“Your time is limited,\n" +
                "\tso don’t waste it\n" +
                "\t\tliving someone else’s life”\n" +
                "\t\t\tSteve Jobs");

        second(null);
        //third(null);
        //fourth(null);
        //fifth(null);
        //sixth(null);
        //seventh(null);
        //eighth(null);
        //ninth(null);
        //tenth(null);
        //eleventh(5, "right", '&');
        int[] arr = new int[] {5, 1, 5, 3, 6};
        arr = sort(arr, "down");
        for (int num:arr
             ) {
            System.out.print(num);
        }
    }

    public static void second(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nNumber: ");
        int number = input.nextInt();

        System.out.print("Percent: ");
        int percent = input.nextInt();

        System.out.print(percent + "%" + number + " = " + (int)(percent/100f*number));
    }

    public static void third(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigit #1: ");
        String number_first = input.next();

        System.out.print("\nDigit #2: ");
        String  number_second = input.next();

        System.out.print("\nDigit #3: ");
        String  number_third = input.next();

        System.out.println("Number: " + number_first.charAt(0) + number_second.charAt(0) + number_third.charAt(0));
    }

    public static void fourth(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        while(true){
            System.out.println("Enter a six-digit number: ");
            number = input.nextInt();

            if(String.valueOf(number).length() != 6){
            }else{
                break;
            }
        }

        String temp = String.valueOf(number);
        String str = String.valueOf(temp.charAt(5)) + String.valueOf(temp.charAt(4)) + String.valueOf(temp.charAt(2)) + String.valueOf(temp.charAt(3)) + String.valueOf(temp.charAt(1)) + String.valueOf(temp.charAt(0));
        number = Integer.parseInt(str);

        System.out.println(number);
    }

    public static void fifth(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        while(true){
            System.out.print("\nEnter a number of month(1-12): ");
            number = input.nextInt();

            if(number > 12 || number < 1){
                System.out.print("incorrect value");
            }else{
                break;
            }
        }

        if(number == 12 || number < 3){
            System.out.println("Winter");
        }else if(number < 6){
            System.out.println("Spring");
        }else if(number < 9){
            System.out.println("Summer");
        }else{
            System.out.println("Autumn");
        }
    }

    public static void sixth(String[] args){

        Scanner input = new Scanner(System.in);

        float number;

        System.out.print("\nEnter the number of meters: ");

        number = input.nextFloat();

        if(number >= 1609.34){
            System.out.print(String.format("%.2f", number/1609.34) + "mi");
        }else if(number >= 0.91){
            System.out.print(String.format("%.2f", number/0.91) + "yd");
        }else{
            System.out.print(String.format("%.2f", number/0.0254) + "in");
        }

        // 1м = 1.09 ярд
        // 1м = 39.37 дюйм
        // 1м = 0.00062 миль
    }

    public static void seventh(String[] args){
        Scanner input = new Scanner(System.in);

        int number_first, number_second;

        while (true){
            System.out.print("\nВведите два разных числа, первое должно быть меньше второго: ");
            number_first = input.nextInt();
            number_second = input.nextInt();

            if(number_first >= number_second){
            }else{
                break;
            }
        }


        for(int i = number_first; i < number_second; i++){
            if(i%2!=0)
                System.out.print("\t" + i);
        }
    }

    public static void eighth(String[] args){
        Scanner input = new Scanner(System.in);

        int number_first, number_second;

        while (true){
            System.out.print("\nВведите два разных числа, первое должно быть меньше второго: ");
            number_first = input.nextInt();
            number_second = input.nextInt();

            if(number_first >= number_second){
            }else{
                break;
            }
        }


        for(int i = number_first; i <= number_second; i++){
            for(int j = 1; j < 11; j++){
                System.out.println(i + " * " +  j + " = " + i*j);
            }
            System.out.print("-----\n");
        }
    }

    public static void ninth(String[] args){
        int[] numbers = new int[] {1, -6, 5, 6, 3, 8};

        int max = numbers[0], min = numbers[0], plus = 0, minus = 0, zero = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }else if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] == 0){
                ++zero;
            }else if(numbers[i] < 0){
                ++minus;
            }else{
                ++plus;
            }
        }

        System.out.print("\nМакс.: " + max+ " Мин.: " + min + "\nОтрицательные: " + minus  + " Нули: " + zero + " Положительные: " + plus);
    }

    public static int[] add(int[] arr, int number){
        int[] new_arr = new int[arr.length+1];

        if(arr.length == 0){
            new_arr[0] = number;
        }else{
            for(int i = 0; i < arr.length; i++){
                new_arr[i] = arr[i];
            }
            new_arr[arr.length] = number;
        }
        return new_arr;
    }

    public static void tenth(String[] args){
        int[] numbers = new int[] {1, -6663, 72, 84, -2, 2365, 0, -9, 9, 6432, -7, 8 ,-7743 ,362 ,-35, 44, 26};

        int[] odd = new int[0];
        int[] even= new int[0];
        int[] positive= new int[0];
        int[] negative= new int[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2==0){
                odd = add(odd, numbers[i]);
            }else{
                even = add(even, numbers[i]);
            }

            if(numbers[i] < 0){
                negative = add(negative, numbers[i]);
            }else{
                positive = add(positive, numbers[i]);
            }
        }
        
        System.out.println("\nODD: ");
        for (int num:odd) {
            System.out.print(num + " ");
        }

        System.out.print("\nEVEN: ");
        for (int num:even) {
            System.out.print(num + " ");
        }

        System.out.print("\nPOSITIVE: ");
        for (int num:positive) {
            System.out.print(num + " ");
        }

        System.out.print("\nNEGATIVE: ");
        for (int num:negative) {
            System.out.print(num + " ");
        }
    }

    public static void eleventh(int length, String direction, char symbol){
        System.out.println();
        if(direction == "down"){
            for(int i = 0; i < length; i++){
                System.out.println(symbol);
            }
        }else if(direction == "right"){
            for(int i = 0; i < length; i++){
                System.out.print(symbol);
            }
        }
    }

    public static int[] sort(int[] arr, String type){
        if(type == "up"){
            boolean isSorted = false;
            int tmp;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                        isSorted = false;

                        tmp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tmp;
                    }
                }
            }
        }else if(type == "down"){
            boolean isSorted = false;
            int tmp;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] < arr[i+1]){
                        isSorted = false;

                        tmp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tmp;
                    }
                }
            }
        }
        return arr;
    }
}
