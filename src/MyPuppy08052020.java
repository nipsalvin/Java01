/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nips
 */
public class MyPuppy08052020 {

    int puppyAge;

    public MyPuppy08052020(String name)
    // public is not crucial
    {
        System.out.println("the name is " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("puppy's age is " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        MyPuppy08052020 myPuppy = new MyPuppy08052020("dylan");
        myPuppy.setAge(50);
        myPuppy.getAge();

    }

}
