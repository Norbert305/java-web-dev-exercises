package Classes;

public class Person {
    //These are my instance fields
    public int age;
    public int wisdom;
    public int fitness;

    //my constructor here
    public Person(int inputAge){
        this.age = inputAge;
        this.wisdom = inputAge * 5;
        this.fitness = 100 - inputAge;
    }
    //each of these methods setAge, setWisdom, and setFitness is being used in the hasBirthday method
    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setWisdom(int newWisdom){
        this.wisdom = newWisdom;
    }

    public void setFitness(int newFitness){
        this.fitness = newFitness;
    }

    public void hasBirthday(){
        //method is being used to gather the methods from above and change the data
        this.setAge(this.age + 1);
        this.setWisdom(this.wisdom + 5);
        this.setFitness(this.fitness - 3);
    }

    public static void main(String[] args){
        Person emily = new Person(20);
        emily.hasBirthday();
        System.out.println("New age is: " + emily.age);//New age is: 21
        System.out.println("New wisdom is: " + emily.wisdom);//New wisdom is: 105
        System.out.println("New fitness is: " + emily.fitness);//New fitness is: 77
    }

}
