package com.javarush.task.task12.task1203;

/* 
Кесарю — кесарево
*/

import com.javarush.task.pro.task17.task1705.Cat;

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
       public Pet getChild() {

           return new Cat();
       }

    }

    public static class Dog extends Pet {
        public Dog getChild(){

            return new Dog();
        }

    }
}
