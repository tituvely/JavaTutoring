class Car {
    String name;
    int number;

    void run(){
        System.out.println(this.name + "차가 달립니다");
    }
}

public class ClassPractice {

    public static void main(String[] args) {

        String str = new String("hello world");
        System.out.println(str.length());
        if(str.contains("h")) {
            System.out.println("h를 포함");
        }else {
            System.out.println("안포함");
        }

        String [] array1 = new String[];
        array1 = str.split(" ");
        System.out.println(array1[0]);  //hello
        System.out.println(array1[1]);  //world


        Car c1 = new Car();
        //class (instance name) = new class();
        Car c2 = new Car();

        c1.name = "붕붕이";
        c1.number = 3245;
        c1.run();

        c2.name = "봉봉이";
        c2.number = 1234;
        c2.run();


    }
}
