package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calc(sc.nextLine());
    }
    public static String calc(String input) {


                String text = input;
                String[] words = text.split(" ");
                String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                int a_rim = 0;
                int b_rim = 0;
                boolean is_1 = true;
                if (words.length <= 2) {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("throws Exception //т.к. строка не является математической операцией");
                    }
                } else if (words.length != 3) {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    }
                } else if (is_1 == true) {
                    char x = text.charAt(0);
                    boolean result1 = Character.isDigit(x);
                    char y;
                    if (words[0].equals("10")) {
                        y = text.charAt(5);
                    } else y = text.charAt(4);
                    boolean result2 = Character.isDigit(y);
                    String string = "10";


                    if ((result1 == false && result2 == true) || (result1 == true && result2 == false)) {


                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                        }
                    } else {
                        if (result1 == false && result2 == false) {
                            String mark = words[1];
                            for (int i = 0; i < rim.length; i++) {
                                if (words[0].equals(rim[i])) {
                                    a_rim = (i + 1);
                                    for (int j = 0; j < rim.length; j++)
                                        if (words[2].equals(rim[j])) {
                                            b_rim = (j + 1);
                                        }
                                }
                            }
                            int sum = 0;
                            if (mark.equals("+")) sum = (a_rim + b_rim);
                            if (mark.equals("-")) {
                                if (b_rim == a_rim) {
                                    try {
                                        throw new Exception();
                                    } catch (Exception e) {
                                        System.out.println("throws Exception //т.к. в системе римских цифр отсутствует ноль");
                                    }}
                                if (b_rim > a_rim) {
                                    try {
                                        throw new Exception();
                                    } catch (Exception e) {
                                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                                    }
                                } else sum = (a_rim - b_rim);
                            }
                            if (mark.equals("/")) sum = (a_rim / b_rim);
                            if (mark.equals("*")) sum = (a_rim * b_rim);
                            System.out.print(sum == 100 ? "C" : "");
                            sum %= 100;
                            System.out.print(sum >= 90 ? "XC" :
                                    sum >= 80 ? "LXXX" :
                                            sum >= 70 ? "LXX" :
                                                    sum >= 60 ? "LX" :
                                                            sum >= 50 ? "L" :
                                                                    sum >= 40 ? "XL" :
                                                                            sum >= 30 ? "XXX" :
                                                                                    sum >= 20 ? "XX" :
                                                                                            sum >= 10 ? "X" : "");
                            sum %= 10;
                            System.out.print(sum >= 9 ? "IX" :
                                    sum >= 8 ? "VIII" :
                                            sum >= 7 ? "VII" :
                                                    sum >= 6 ? "VI" :
                                                            sum >= 5 ? "V" :
                                                                    sum >= 4 ? "IV" :
                                                                            sum >= 3 ? "III" :
                                                                                    sum >= 2 ? "II" :
                                                                                            sum >= 1 ? "I" : "");
                        } else {
                            if (words.length == 3) {
                                int a = Integer.valueOf(words[0]);
                                int b = Integer.valueOf(words[2]);
                                String mark = words[1];

                                if (mark.equals("+")) System.out.println(a + b);
                                else if (mark.equals("-")) System.out.println(a - b);
                                else if (mark.equals("/")) {
                                    if (b == 0) {
                                        try {
                                            throw new Exception();
                                        } catch (Exception e) {
                                            System.out.println("throws Exception //т.к. деление на ноль");
                                        }
                                    } else System.out.println(a / b);
                                } else if (mark.equals("*")) System.out.println(a * b);
                            }
                        }
                    }
                }

        return text;
    }}




