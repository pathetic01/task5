package com.pm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;

        appealToUser();

        int lengthS = read(a);

        checkIfWrongNum(lengthS);
        // проверка

        printTringle(lengthS);
    }

    private static void printTringle(int lengthS){
        for(int i = lengthS; i >= 1; i --){
            if (i == lengthS){
                for(int j = 1; j <= lengthS; j ++ ){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else if(i - 2 >= 0){
                for(int j = i; j != lengthS; j ++){
                    System.out.print(" ");
                }
                for(int j = i; j >= 1; j --){
                    if(j == i){
                        System.out.print("*");
                    }
                    else if(j == 1){
                        System.out.print("*\n");
                    }
                    else { System.out.print("$");
                    }
                }
            }
            else{
                for(int j = i; j != lengthS; j ++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
        }
    }


    public static void appealToUser(){
        System.out.printf("Введите размер фигуры для постройки треугольника. Число целое и больше 2. s: ");
    }

    private static int read(int x){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        return x;
    }

    private static void checkIfWrongNum(int sum){
        if(sum < 3){
            System.out.println("Полученно неверное число");
            System.exit(0);
        }
    }
}