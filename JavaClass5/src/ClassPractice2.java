class Car{
    String name;
    int number;

    public Car(String n){
        name = n;
    }

//    public Car(String name){
//        this.name = name;
//    }

//    public Car(){
//
//    }
//
//    public Car(String name, int number){
//        this.name = name;
//        this.number = number;
//    }

//    public Car(){
//        this("이름없음", 0);
//    }
}


/* 오버로딩 */
//이름은 같지만 매개변수가 다른 메소드
class MyClass2{
    public int plus(int x, int y){
        return x+y;
    }

    public int plus(int x, int y, int z){
        return x + y + z;
    }

    public String plus(String x, String y){
        return x + y;
    }
}

public class ClassPractice2 {
    int globalScope = 10;
    static int staticVal = 7;

    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public void scopeTest(int value){
        int localScope = 20;
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    enum Gender{
        MALE, FEMALE;
    }

    public static void main(String[] args) {
//        System.out.println(globalScope);  //오류
//        System.out.println(localScope);   //오류
//        System.out.println(value);        //오류

        ClassPractice2 v1 = new ClassPractice2();
        ClassPractice2 v2 = new ClassPractice2();
        v1.globalScope = 20;
        v2.globalScope = 30;

        System.out.println(v1.globalScope);  //20 이 출력된다.
        System.out.println(v2.globalScope);  //30이 출력된다.

        v1.staticVal = 10;
        v2.staticVal = 20;

        System.out.println(v1.staticVal);  //20 이 출력된다.
        System.out.println(v2.staticVal);  //20 이 출력된다.


        /* enum */

        String gender1;

        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        Gender gender2;

        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;



        /* 생성자 */
        Car c1 = new Car("소방차");
        Car c2 = new Car("구급차");
        //Car c3 = new Car(); // 컴파일 오류가 발생합니다.

        System.out.println(c1.name);

        System.out.println(c2.name);


        /* 오버로딩 */
        MyClass2 m = new MyClass2();
        System.out.println(m.plus(5,10));
        System.out.println(m.plus(5,10,15));
        System.out.println(m.plus("hello" + " world"));



        Car c5 = new Car();
        Car c6 = new Car("소방차");
        Car c7 = new Car("구급차", 1234);
    }

}

