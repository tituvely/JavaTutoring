import java.util.Scanner;
public class ControlPractice {
    public static void main(String args[]) {
        /* 조건문 */
//        if(조건식){
//            실행문;
//            실행문;
//        }else if(조건식){
//            실행문;
//        }else{
//            실행문;
//        }

//
//        /* 논리연산자 */
//        boolean b1 = true;
//        boolean b2 = false;
//        boolean b3 = true;
//
//        System.out.println(b1 && b2);
//        System.out.println(b1 && b3);
//
//        System.out.println(b1 || b2);
//
//        System.out.println(b1 ^ b2);
//        System.out.println(b1 ^ b3);
//
//        System.out.println(!b1);
//        System.out.println(!b2);
//
//        /* 삼항연산자 */
//        //조건식 ? 피연산자1 : 피연산자2
//        int c1 = (5>4) ? 50 : 40;
//        //조건식이 true이므로 b1은 50이 된다.
//
//        int c2 = 0;
//        if(5 > 4){
//            c2 = 50;
//        }else{
//            c2 = 40;
//        }
//
//        /* switch */
////        switch(변수){
////            case 값1 :
////                실행문;
////                break;
////            case 값2 :
////                실행문;
////                break;
////            default;
////        }
//        int value = 1;
//
//        switch(value){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3 :
//                System.out.println("3");
//                break;
//            default :
//                System.out.println("그 외의 숫자");
//        }
//
//        String str = "A";
//
//        switch(str){
//            case "A":
//                System.out.println("1");
//            case "B":
//                System.out.println("2");
//            case "C" :
//                System.out.println("3");
//            default :
//                System.out.println("그 외의 숫자");
//        }
//
//
//        /* while */
////        while(조건문){
////            실행문;
////        }
//
//
//        int i = 0;  //while에서 사용할 변수를 선언
//
//        while(i < 10){
//            System.out.println(i);
//            i++; //조건문을 원하는 만큼만 반복하고 빠져나가기 위한 부분
//        }
//
//        /* do while */
//        value = 0;
//
//        // Scanner는 java.util 패키지에 있는 클래스로써 키보드로 부터 값을 입력받는다던지 할 때 유용하게 사용할 수 있는 클래스입니다.
//        Scanner scan = new Scanner(System.in);
//        //위 처럼 작성하시면 키보드로부터 값을 입력받을 수 있는 Scanner객체가 생성됩니다.
//
//        do{
//            value = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
//            System.out.println("입력받은 수 : " + value);
//        }while(value != 10);  // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.
//
//        System.out.println("반복문 종료");
//
//        /* for문 */
////        for(초기화식; 조건식; 증감식){
////            실행문;
////            실행문;
////        }
//
//        int total = 0; //1부터 100까지 합한 결과값을 담기위한 변수 선언
//
//        for(i = 1; i <= 100; i++){ //1부터 100까지 반복하기 위한 for 반복문
//
//            total = total + i; // 1부터 100까지 반복해서 total 변수에 값을 누적
//        }
//        System.out.println(total);  //결과값 출력
//
////        int total = 0;
////        for(int i = 1; i <= 100; i++){
////            if(i % 2 != 0){  // 2로 나눈 나머지가 0이 아니라는것은 홀수를 의미한다.
////                continue; // 홀수일 경우 total = total + i; 문장이 실행되지 않으므로, 결과적으로 짝수만 더해준다.
////            }
////            total = total + i;
////        }
////        System.out.println(total);
    }
}
