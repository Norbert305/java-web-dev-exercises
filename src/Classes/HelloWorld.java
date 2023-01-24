package Classes;

public class HelloWorld {

    public String message = "Hello World";

    //Here is our instance in the sayHello method
    public void sayHello() {
        System.out.println(message);
    }
    public static void main(String[] args) {
        //here is our new object that prints out our instance from above
       HelloWorld hello = new HelloWorld();
       hello.sayHello();
    }





}
