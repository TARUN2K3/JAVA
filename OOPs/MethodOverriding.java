package OOPs;

public class MethodOverriding {
    public static void main(String[] args) {
        SuperClass s = new SuperClass(); 
        s.display();

        SubClass su = new SubClass(); 
        su.display();
    }
}

class SuperClass { 
    public void display() {
        System.out.println("Super class"); 
    }
}

class SubClass extends SuperClass { 
    @Override
    public void display() {
        System.out.println("Sub class"); 
    }
}
