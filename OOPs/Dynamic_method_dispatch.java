package OOPs;

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Super s = new sub();
        s.method1();
        s.method2();
        // s.method3(); this can't be call coz it is not present in Super class 
    }
}
class Super{

    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 1");
    }
}
class sub extends Super{

    public void method2(){
        System.out.println("method 2");
    }
    public void method3(){
        System.out.println("method 1");
    }
}
