import java.util.Arrays;

public class Exception2 {
    void f() {

    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2 = null;
        try {
            exception2.f();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("NullPointerException перехвачен");
        }
        try {
            throw new Exception("Я исключение");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я finally");
        }
        int[] ints = new int[3];
        try {
            ints[4] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException перехвачен");
        }
        int i = 5;
        while (i >= 0) {
            try {
                ints[i] = 1;
                i--;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Уменьшаю i, теперь оно равно" + " " + i);
                i--;
            }
        }
        System.out.println(Arrays.toString(ints));
        try {
            throw new SpecialException("Я новое исключение");
        } catch (SpecialException e) {
            e.printStackTrace();
        }
    }
}

class SpecialException extends Exception {
    String message;
    public SpecialException(String message) {
        super(message);
        this.message = message;
    }

    void printMessage () {
        System.out.println(message);
    }
}
