
class NewException extends Exception {
    public NewException() {
    }

    public NewException(String message) {
        super(message);
    }
}

public class MyException {
    void f() throws NewException {
        System.out.println("I'm throwing exception");
        throw new NewException("Создано в методе f()");
    }

    public static void main(String[] args) throws NewException {
        MyException myException = new MyException();
        myException.f();
        //        try {
//            myException.f();
//        } catch (NewException e) {
//            e.printStackTrace();
//        }

    }
}
