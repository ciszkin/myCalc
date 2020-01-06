package by.tms.old;

public class Objects {

    Integer integer = 56;
    Short aShort = 56;
    Byte aByte = 56;
    Long aLong = 56L;
    Double aDouble = 56d;
    Float aFloat = 56f;

    Boolean aBoolean = true;

    Character character = 'd';

    public static void main(String[] args) {
        Menu menu = new Menu();
        while(menu.update()) {};

    }


    public static String reverse(String str) {

        int i = str.length() - 1;
        char[] temp = new char[str.length()];

        while(i >= 0) {
            temp[str.length() - 1 - i] = str.charAt(i);
            i--;
        }
        return new String(temp);
    }
}
