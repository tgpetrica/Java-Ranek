package Accel;
class ChangeIt {
    static void doIt(int[] z) {
        //z = null;
        int A[] = z;
        A[0] = 99;
    }
}

class LowHighSwap {
    static void doIt(int[] z) {
        int temp = z[z.length - 1];
        z[z.length - 1] = z[0];
        z[0] = temp;
    }
}

class BlurTest {
    static void blur(char[] z, String st) {
        if (z.length < st.length()) return;
        for (int j = 0; j < st.length(); j++) {
            z[j] = st.charAt(j);
        }
    }
}

class Call {
    static void routine(double[] arr) {
        System.out.println("\tR inainte: " + arr[0]);
        arr[0] = 100.0;
        arr = new double[]{2.5, 4.5, 8.5};
        System.out.println("\tR dupa: " + arr[0]);
    }
}

public class TestIt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ChangeIt.doIt(arr);
        //LowHighSwap.doIt(arr);
        
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println();
        char[] arr1 = new char[10];
        String text1 = "HELLO";
        BlurTest.blur(arr1, text1);

        for (char c : arr1) {
            System.out.print(c + " ");
        }

        char[] arr2 = new char[3];
        String text2 = "WORLD";
        BlurTest.blur(arr2, text2);
        for (char c : arr2) {
            System.out.print(c + " ");
        }

        System.out.println();

        double[] rats = {1.2, 3.4, 5.6};

        System.out.println("inainte: " + rats[0]);
        Call.routine(rats);
        System.out.println("dupa: " + rats[0]);

        System.out.println();
        double a[] = new double[9];
        System.out.println(a[5]);

        int x;
        System.out.println(x);
    }
}
