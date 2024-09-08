/*
                                [Most Important Comment]
    We Need to make all class Static because 'JavaAbstractClass.this' cannot be
    referenced from a static context(In the same class we can't call
    non-static Abstract class in the main method.)

*/

import java.util.Scanner;

public class JavaAbstractClass {
    static abstract class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    static class MyBook extends Book {
        @Override
        void setTitle(String s) {
            title = s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        MyBook book = new MyBook();
        book.setTitle(s);
        System.out.println("The title is: " + book.getTitle());
    }
}
