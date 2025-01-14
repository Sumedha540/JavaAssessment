package week4;

class FinalClass {
    public final void finalMethod() {
        System.out.println("This is a final method in FinalClass");
    }
}

class SubClass extends FinalClass {
    // Error: Cannot override the final method from FinalClass
    /*
    public void finalMethod() {
        System.out.println("An error statement is shown!!");
    }
    */
}

public class Ques6 {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass();
        finalObj.finalMethod();
    }
}

