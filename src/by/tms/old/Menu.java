package by.tms.old;

import java.util.Scanner;

class Menu {
    private String str = "";
    private Scanner scan = new Scanner(System.in);

    boolean update() {
        if(str.length() == 0) {
            this.newWord();
            return true;
        } else {

            System.out.println();
            System.out.println("1 - enter new word or number");
            System.out.print("2 - revert <" );
            System.out.print(str);
            System.out.println(">");
            System.out.print("3 - check if <");
            System.out.print(str);
            System.out.println("> is palindrome");
            System.out.print("4 - print N first fibonacci numbers, where N - number of characters in <");
            System.out.print(str);
            System.out.println(">");
            System.out.print("5 - print N first triangle numbers, where N - number of characters in <");
            System.out.print(str);
            System.out.println(">");
            System.out.println("0 - exit");

            String cmd = scan.nextLine();

            switch (cmd) {
                case "1":
                    this.newWord();
                    return true;
                case "2":
                    System.out.println("Reverted: " + Main.revert(str));
                    return true;
                case "3":
                    System.out.println("<" + str + "> is palindrome: " + Main.isPalindrome(str));
                    return true;
                case "4":
                    Main.fibonacci(str.length());
                    return true;
                case "5":
                    Main.triangleNumber(str.length());
                    return true;
                case "0":
                    return false;
                default:
                    System.out.println("No such command! Try again!");
                    return true;
            }
        }

    }

    private void newWord() {
        System.out.println("Enter a word or a number:");
        str = scan.nextLine();
    }
}
