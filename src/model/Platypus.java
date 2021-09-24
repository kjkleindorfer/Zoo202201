package model;

/** 
 * @author Noah Clark - npclark
 * CIS 175 - Fall 2021
 * Sep 24, 2021
 */

public class Platypus {
    
    // Initialize variables
    String name;
    int age;
    double weight;

    // Constructors
    public Platypus(){
        super();
        this.name = "Perry";
        this.age = 5;
        this.weight = 3.6;
    }
    public Platypus(String name, int age, double weight){
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    // Methods
    @Override
    public String toString() {
        return "Platypus [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
    public String speak(){
        return "Gyururururururu";
    }
}
