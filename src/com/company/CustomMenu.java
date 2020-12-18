package com.company;

import java.util.Scanner;

public class CustomMenu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println(" Input minimum number between 1 and 499: ");
            int min = in.nextInt();
            if (min < 1 || min > 499) {
                continue;
            }

            while (true) {
                System.out.println(" Input maximum number between 2 and 500: ");
                int max = in.nextInt();
                if (max < 2 || max > 500) {
                    continue;
                }


                Randomaizer randomaizer = new Randomaizer();

                while (true) {
                    System.out.println(" Input number command: \n 1.generate \n 2.help \n 3.exit \n ");
                    int num = in.nextInt();


                    switch (num) {

                        case (1):

                            randomaizer.generate(min, max);
                            continue;

                        case (2):
                            randomaizer.help();
                            continue;

                        case (3):
                            randomaizer.exit();

                        default:
                            System.out.println("Oooops!");
                            continue;
                    }
                }
            }
        }
    }
}

