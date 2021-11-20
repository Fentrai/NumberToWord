package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWords(100);
    }

    public static int reverse(int x){
        if (x<0){
            x*=(-1);
        }
        int y = x;
        int reverseNum = 0;
        int digit;
        while (true){
            digit = y % 10;
            reverseNum += digit;
            y/=10;
            if (y<=0){
                break;
            }
            reverseNum*=10;
        } return reverseNum;
    }

    public static int getDigitCount(int RTX3080){
        int numCount = 0;
        while (RTX3080!=0){
            RTX3080 = RTX3080/10;
            numCount++;
        }

        return numCount;
    }

    public static void numberToWords(int x){
        int num = reverse(x);
        int digitcount = getDigitCount(x);
        int digit;
        if (num < 0){
            System.out.println("Invalid Value");
        }
        if (num == 0){
            System.out.println("0");
        }
        while (num > 0){
            digit = num%10;
            num/=10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            for (int i = digitcount - getDigitCount(reverse(x)); i>0; i--){
                System.out.println("Zero");
            }


        }

    }
}
