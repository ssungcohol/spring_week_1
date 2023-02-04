package Day01;

import java.awt.*;

class Car {
    private int maxPeople;
    private int people;
    private int price;
    private int number;
    private int gas = 100;
    private int velocity;
    private String state;


    public void changeState(String state) {
        this.state = state;
        System.out.println("상태 : " + state);
    }

    public void changePeople(int people) { // 승객 변화 메서드 생성 및 받아올 (매개변수) 적기
        this.people = people; // this.people == iv, people == 매개변수 == 변화되는 값!
        this.maxPeople = 30;  // this.people == 지역변수? lv
        this.price = 1000;

        if (people <= 30) {
            System.out.println("탑승 승객 수 = " + people);
            System.out.println("잔여 승객 수 = " +(maxPeople-people));
            System.out.println("요금 확인 = " + (price * people));
        } else if (people > 30) {
            System.out.println("최대 승객 수를 초과했습니다.");
        }
    }

    public void changeGas(int gas) {
        this.gas += gas;// this = 클래스 내부의 변수를 뜻한다~
        if (this.gas > 10) {
            System.out.println("주유량 : " + (this.gas));
        } else if (this.gas <= 10) {
            System.out.println("주유량 : " + (this.gas));
            System.out.println("주유가 필요합니다");
            System.out.println("상태 : 차고지행");
        }

    }
}


    class Mobility {
        public static void main(String[] args) {
            Bus bus1 = new Bus(1); //
            Bus bus2 = new Bus(2);
            bus1.changePeople(2); // 버스승객 + 2
            bus1.changeGas(-50);
            bus1.changeState("차고지행"); // bus 상태 변경
            bus1.changeGas(+10); // 주유량 10 충전
            bus1.changePeople(45);  // 승객 45명
            bus1.changePeople(5);  // 승객 5명
            bus1.changeGas(-55);  // 기름 -55
        }
    }


