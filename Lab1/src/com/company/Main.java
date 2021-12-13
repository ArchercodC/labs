package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 10}};
        int arr2[] = {2, 5, 1, 6, 4, 1};

        System.out.println(method1(13573));
        System.out.println(method2(300));
        System.out.println(method3(1, 5, 7));
        System.out.println(method4(15));
        System.out.println(method5(2, 4));
        System.out.println(method6(12345));
        System.out.println(method7(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(method8(arr2));
        System.out.println(method9(arr, 2)[0]);
        System.out.println(method9(arr, 2)[1]);
    }

    public static int method1(int num) {
        num = num / 100;
        num = num % 10;
        return num;
    }

    public static boolean method2(int num) {
        return (num % 2 == 0) && (num / 100 > 0);
    }

    public static String method3(int A, int B, int C) {
        if ((A > B && B > C) || (A < B && B < C)) {
            A = A * 2;
            B = B * 2;
            C = C * 2;
        } else {
            A = -A;
            B = -B;
            C = -C;
        }
        return "A = " + A + ", B = " + B + ", C = " + C;
    }

    public static String method4(int num) {
        switch (num) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                return num + " учебных заданий";
            case 21:
            case 31:
                return num + " учебное задание";
            case 22:
            case 23:
            case 24:
            case 32:
            case 33:
            case 34:
                return num + " учебных задания";
            default:
                return "";
        }
    }

    public static int method5(int num, int pow) {
        int Sum = 1;
        int k = num;
        for (int i = 1; i <= pow; i++) {
            Sum += num;
            num *= k;
        }
        return Sum;
    }

    public static String method6(int num) {
        int dig;
        String res = "";
        while (num > 0) {
            dig = num % 10;
            res += Integer.toString(dig);
            num /= 10;
        }
        return res;
    }

    public static String method7(int[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i+=2) {
            res += Integer.toString(arr[i]);
            res += " ";
            res += Integer.toString(arr[i + 1]);
            res += " ";
            res += Integer.toString(arr[arr.length - i - 1]);
            res += " ";
            res += Integer.toString(arr[arr.length - i - 2]);
            res += " ";
        }
        return res;
    }

    public static int method8(int[] arr) {
        int max = arr[0];
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                k = i;
            }
        }

        return arr.length-1-k;
    }

    public static int[] method9(int[][] arr, int line) {
        int S = 0;
        int M = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == line) {
                for (int j = 0; j < arr[i].length; j++) {
                    S += arr[i][j];
                    M *= arr[i][j];
                }
            }
        }
        return new int[]{S,M};
    }

}
