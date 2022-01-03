package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {
    public static void main(String[] args) {

        // && 는 자바에서 and 기호.
        if (true && true) {
            System.out.println(1); // 좌항과 우항이 모두 true 일때만 true 값이 나옴.
        }

        if (true && false) {
            System.out.println(2); // false
        }

        if (false && true) {
            System.out.println(3); // false
        }

        if (false && false) {
            System.out.println(4); // false
        }

    }

}
