package com.company;
import java.util.Scanner;
import java.util.Random;

    import static java.lang.System.*;
    import static java.lang.Math.*;

public class Main {
    public static String roundpt2 (float val)
    { return String.format("%.2f", val); }
    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Scanner scan = new Scanner(in);
        ////////////////////1/////////////////////////
        System.out.println("///1///");
        for (int i=0; i<10; i++){
            System.out.println(i);
            i++;
        }
        ////////////////////2/////////////////////////
        out.println("///2///");
        for (float x = 0; x <= 4.1; x+=0.4)
        {
            out.printf("y(%s) = ", roundpt2(x));
            float y = (float) (3*(pow(x, 3) - pow(x, 2))/(pow(x, 3) + pow(x, 2)));
            out.println(roundpt2(y));
        }
        ////////////////////4/////////////////////////
        out.println("///4///");
        String str = scan.nextLine();
        char[] chr = str.toCharArray();
        int lstr = str.length();
        for (int i = 1; i <= lstr; i++)
        {
            out.print(chr[lstr-i] + " ");
        }
        out.println();
        ////////////////////3/////////////////////////
        out.println("///3///");
        int drop = scan.nextInt();
        String result = "";
        for(int i = 0; i < drop; i++){
            result += (rand.nextInt(6) + 1) + " ";
        }
        out.println(result);
    }
}
