package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {

    public static void main(String[] args) {
        // Or 기호는 \\ 를 시프트 눌른상태로 누르면 || 로 나옴. 즉, Or = ||
        if (true || true) {
            System.out.println(1); // 좌항이나 우항 둘 중 하나라도 true 라면 true 값이 나옴.
        }

        if (true || false) {
            System.out.println(2); // 좌항이나 우항 둘 중 하나라도 true 라면 true 값이 나옴.
        }

        if (false || true) {
            System.out.println(3); // 좌항이나 우항 둘 중 하나라도 true 라면 true 값이 나옴.
        }

        if (false || false) {
            System.out.println(4); // 좌항과 우항이 모두 false 일때만 false 값이 나옴.
        }
        // 즉, 마지막 false Or false if 문만 제외하고는 모두 출력되서 1 2 3 이 출력되서 나옴.
    }

}
