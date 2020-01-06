package by.tms.old;

public class ForIfImpl implements ForIf {

    void fora() {

        int i = 0;
        /*
        for(; i < 10;){
            System.out.println(i);
            i++;
        }

        while(i < 10) {
            i++;
        }
         */

        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        System.out.println(i);
    }

    void equal(int a, int b) {
        if(a == b) {
            System.out.println(a + " == " + b);
        } else if(a > b){
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }
    public static void main(String[] args) {
        ForIf fi = new ForIfImpl();
        //fi.abc(2.0);
    }

    public void stop(String message) {

    }

    public void abc(double a){

    }

    void abc(int a){

    }

    void abc(float a){

    }

    void abc(long a){

    }

    void abc(Integer a){

    }

    void abc(Long a){

    }

    void abc(byte a){

    }

    void abc(Object a){

    }




}
