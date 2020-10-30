package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello GitHub my old friend");

        System.out.println("-----------------------");

        int i, j;
        for (i = 0; i < 5; i++) {
            System.out.print("*");
            for (j = 0; j < 5; j++) {
                if ((j == 5 - 1)
                        || (i == 5 / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
//------------------------------------------------------------
        System.out.print("\n");System.out.print("\n");System.out.print("\n");

        for (i = 0; i < 5; i++) {
            System.out.print("*");
            for (j = 0; j < 5; j++) {
                if ((i == 0 || i == 5 - 1)
                        || (i == 5 / 2
                        && j <= 5 / 2))
                    System.out.print("*");
                else
                    continue;
            }
            System.out.print("\n");
        }
        //------------------------------------------------------------
        System.out.print("\n");System.out.print("\n");System.out.print("\n");

        for (i = 0; i < 5; i++) {
            System.out.print("*");
            for (j = 0; j <= 5; j++) {
                if (i == 5 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        //------------------------------------------------------------
        System.out.print("\n");System.out.print("\n");System.out.print("\n");

        for (i = 0; i < 5; i++) {
            System.out.print("*");
            for (j = 0; j <= 5; j++) {
                if (i == 5 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        //------------------------------------------------------------
        System.out.print("\n");System.out.print("\n");System.out.print("\n");

        int  space = (5 / 3);
        int width = 5 / 2 + 5 / 5 + space + space;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= width; j++) {
                if (j == width - Math.abs(space)
                        || j == Math.abs(space))
                    System.out.print("*");
                else if ((i == 0
                        || i == 5 - 1)
                        && j > Math.abs(space)
                        && j < width - Math.abs(space))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if (space != 0
                    && i < 5 / 2) {
                space--;
            }
            else if (i >= (5 / 2 + 5 / 5))
                space--;
            System.out.print("\n");
        }


    }
}
