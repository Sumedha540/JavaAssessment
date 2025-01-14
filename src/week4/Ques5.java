package week4;

class ParentVariable {
    private int privateVariable = 12;
    protected int protectedVariable = 49;
    public int publicVariable = 65;

    public int getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }
}

class Child extends ParentVariable {
    void accessVariables() {
        System.out.println("private Variable is:" + getPrivateVariable());
        System.out.println("Protected Variable is:" + protectedVariable);
        System.out.println("Public Variable is:" + publicVariable);
    }
}

public class Ques5 extends ParentVariable {
    public static void main(String[] args) {
        Child a = new Child();
        a.accessVariables();
    }
}


