package org.opentutorials.javatutorials.conditionaloperator;

public class NotDemo {
    public static void main(String[] args) {

        if (!true) {
            System.out.println(1); // true 앞에 ! (not)이 붙어서 false 가 되기때문에 실행되지않음.
        }

        if(!false) {
            System.out.println(2); // false 앞에 ! (not)이 붙어서 true 가 되어서 이 구문이 실행되게 된다.
        }

    }

}
