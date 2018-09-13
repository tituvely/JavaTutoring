public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");

        // This is one line comment

        /*
        This is two
        line comment
         */

        /* 변수 */
        int count = 1;    // 1
        count = 2;        // 2

        double average = 10;
        float length = 5;

        String name = "유경";

        /* 상수 */
        final int J;
        J = 10;

        /* 기본형 */
        boolean isFun = true;

        char c ='f';

        int x = 59;

        long big = 3456789L; (값을 적을때는 뒤에 소문자 l이나 대문자 L을 적어야 합니다.)

        float f = 32.5f (float에 값을 대입할 때는 실수 뒤에 소문자 f나 대문자 F를 붙여야 합니다.)

        double d = 23.34;

        /* 형변환 */
        // 크기가 작은 타입 -> 큰 타입
        int x = 50000;
        long y = x;

        // 크기가 큰 타입 -> 작은 타입
        // long x = 5000;
        // int y = (int) x;

        /* 산술연산자 */
        //부호 연산자
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1;

        //증감 연산자
        int i4 = ++i3;
        int i5 = i3++;
        int i6 = --i3;
        int i7 = i3--;

        int i = 5;
        int j = 2;
        System.out.println(i +  j);
        System.out.println(i -  j);
        System.out.println(i *  j);
        System.out.println(i /  j);
        System.out.println(i %  j);

        /* 비교연산자 */
        i = 5;
        j = 5;

        // i 와 j 가 같은지 비교 하는 비교 연산자
        System.out.println(i == j )
        System.out.println(i == j )
        System.out.println(i != j );
        System.out.println(i < j);
        System.out.println( i <= j);
        System.out.println(i > j);
        System.out.println(i >= j);

        //복합 대입 연산자
        i += 10; // i = i + 10;  과 같은 의미

        System.out.println(i);
        System.out.println(i -=5);
        System.out.println(i);

        /* 연산자 우선순위 */
        int a = 5;
        int b = 10;
        int c = 5
        System.out.println(  a - b * c );
        //결과는 -45가 나오게 됩니다

        int a = 5;
        System.out.println(++a - 5);
        //결과는 1

        int a = 5;
        System.out.println(a++ - 5);
        //결과는 0
        System.out.println(a);
        //결과는 1
    }
}
