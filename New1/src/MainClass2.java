class Sample {

    int a=100;

    public void m1(){
        System.out.println("Sample : m1");
    }

}

class Example extends Sample {
    
    int b=200;

    public void m2(){
        System.out.println("Example : m2");
    }

}

class MainClass2 {

    public static void main(String[] args) {
        Example e=new Example();
        Sample e=new Example();
        e.m1();
        e.m2();
        System.out.println(e.a);
        System.out.println(e.b);
    }

}
