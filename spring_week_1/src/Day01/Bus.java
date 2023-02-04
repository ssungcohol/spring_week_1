package Day01;

class Bus extends Car {  //자손
    public Bus(int number) {  // 생성자
        System.out.println(number + "번 버스객체 만들어짐!");
    }
}


// 메서드만들어주고, 받아올 매개변수 ()에 넣어주고
// this.~~~~을 사용해 매개변수 사용할 것이라는 것을 선언!
// 이후 main 에서 메서드를 호출하여 ()에 인자를 입력!