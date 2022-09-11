package com.nackademinjava;

public class Main {

    public static void main(String[] args) {
	    // Useful when you have more complex Java Code
        // Creating is same as a Class.
        // A Class have to type "implements" to access the interface
        // You can't have multiple inheritance, but you can implement multiple interfaces!

        Cat dexter = new Cat(2, "Dexter");
        Dog alfonz = new Dog(10, "Alfonz");

        makeTheNoise(dexter);
        makeTheNoise(alfonz);
    }

    private static void makeTheNoise(MakesNoise makesNoise) {
        // This method doesn't know if it's a cat or dog, just knows if it can makeNoise
        // Takes in the object, and it will know how to make its noise!
        makesNoise.makeNoise();
    }
}
