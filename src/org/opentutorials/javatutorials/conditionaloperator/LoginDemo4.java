package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo4 {

    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];

        // || (Or) 의 사용법
        if((id.equals("egoing") || (id.equals("k8805")) || id.equals("sorialgi")) // id가 egoing,k8805,sorialgi 중 하나이면서
                && password.equals("111111")) { // 비밀번호가 111111 이라면
            System.out.println("right"); // right 을 출력하고,
        } else {
            System.out.println("wrong"); // 비밀번호나 아이디가 틀리다면 wrong 을 출력한다.
        }

    }

}
