package OOPs;

public class Abstract_class {
    public static void main(String[] args) {
        Super s = new sub();
        s.method1();
        s.method2();
    }
}

abstract class Super{ // Abstract class shuld have one abstarct method then after it called Abstract class
    public void Super(){
        System.out.println("Super Method");
    }
    public void method1(){
        System.out.println("Method 1");
    }
    abstract public void method2(); // There is no Method Body
}

class sub extends Super{
    @Override
    public void method2(){
        System.out.println("Method 2 of sub class");
    }
}
