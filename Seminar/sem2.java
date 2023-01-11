package Seminar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Scanner;

public class sem2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        /* System.out.println("Input number: " ); */

        /*
         * int num = scan.nextInt();
         * scan.close();
         * String c1 = "f";
         * String c2 = "t";
         * StringBuilder s = new StringBuilder();
         * for (int i = 0; i < num; i+=2) {
         * s.append(c1+c2);
         * }
         * System.out.println(s);
         */
        /*
         * String str = "потоп";
         * System.out.println(encodingRLE("qqqssrrrr"));
         * System.out.println(isPalindrome(str));
         */
        // readToFile();
        printDir();

    }

    public static void printDir() throws IOException {
        FileWriter filelog = new FileWriter("sample.log", true);
        

        try {

            File dir = new File(".//");
            File file = new File("k://sample.txt");
            file.createNewFile();
            PrintStream stream = new PrintStream(file);
            System.setOut(stream);
            if (dir.isDirectory()) {
                for (File item : dir.listFiles()) {
                    if (item.isDirectory()) {
                        System.out.println(item.getName() + " \t folder");
                    } else {
                        System.out.println(item.getName() + " \t file");
                    }

                }
            }
        } catch (Exception e) {
            filelog.append("\n" + e.toString());
        }
        filelog.close();

    }

    public static void readToFile() throws IOException {
        String str = "TEST".repeat(3);
        FileWriter fw = new FileWriter("test.txt", true);
        fw.append(str + "\n");
        fw.close();

    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.reverse().toString().equals(str);
    }

    public static String encodingRLE(String str) {
        String result = "";
        int count = 1;

        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            } else {
                result += ((count) + Character.toString(ch));
                ch = str.charAt(i);
                count = 1;

            }

        }

        result += (count + Character.toString(ch));
        return result;
    }

}
