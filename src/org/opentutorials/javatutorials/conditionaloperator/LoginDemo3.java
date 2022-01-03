package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {

    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];

        // 그 전에는 if 문을 두번 썻다면 이번에는 && (and)를 이용해서 if 문을 한번만 써서 단축하여 사용.
        if(id.equals("egoing") && password.equals("111111")) {  // and 의 앞의 내용과 뒤의내용이 둘다 true 여야만 and 가 true 가 되면서 right 이 출력됨.
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

    }

}
