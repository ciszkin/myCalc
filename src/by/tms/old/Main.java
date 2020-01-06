package by.tms.old;

public class Main {



    public static void main(String[] args) {
        /*
        int[] a = new int[100];
        //int i = a[3];
        for(int i = 1, ii = 0; ii < a.length; i++, ii++) {
            a[ii] = i;
        }

        //System.out.println(Arrays.toString(a));

        for(int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0)
                System.out.println(a[j]);
        }


 */
        //System.out.println(Main.isPalindrome(1221));
        //System.out.println(Main.isPalindrome("hellolleh"));

        int [] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*1000);
        }

        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(Main.sort(arr)));
        //System.out.println(Main.fibonacci(6));
        //Main.fibonacci(10);
        Main.triangleNumber(10);

    }

    public static boolean isPalindrome(int x) {

        int y = 0;
        int dy = 0;
        int temp = x;

        if(x < 0) {
            return false;
        } else {
            while(temp != 0){
                dy = temp%10;
                temp /= 10;
                y = y*10 + dy;
            }
            return x == y;
        }

    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        while(i < str.length()/2) {
            if(str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static String revert(String str) {
        StringBuilder revStr = new StringBuilder(str);
        return revStr.reverse().toString();
    }

    public static int[] sort(int[] arr) {
        int temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void fibonacci(int n) {
        int result = 0;
        int f0 = 0;
        int f1 = 1;
        if(n > 0)
            System.out.println(f0);
        if(n > 1)
            System.out.println(f1);
        if(n > 2) {
            for (int i = 0; i < n - 2; i++) {
                result = f0 + f1;
                f0 = f1;
                f1 = result;
                System.out.println(result);
            }
        }
    }

    public static void triangleNumber(int n) {
        for(int i = 0; i < n; i++) {
            int triangle = i*(i + 1)/2;
            System.out.println(triangle);
        }
    }

}