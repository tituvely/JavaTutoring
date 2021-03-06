public class ArrayPractice {
    public static void main(String[] args) {
        /* 배열 Array */
//       배열은 같은 데이터 타입을 가진 연속된 메모리 공간으로 이루어진 자료구조이다.
//       같은 데이터 타입을 가진 여러개의 변수가 필요할 때 사용한다.

        int i;
        int[] array1 = new int[4];


        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        //자바에서 배열의 인덱스는 0번 부터 사용한다. 4개짜리 배열은 0부터 3까지의 인덱스를 가지게 된다.
        //배열인덱스 0번부터 3번까지 차례로 1,2,3,4 값을 저장한다.
        System.out.println(array1[1]);

        int value = array1[2];
        //array1 이 참조하는 배열의 2번 인덱스에 해당하는 값 3을 꺼내서 int형 변수 value에 담는다.
        System.out.println(array1[1]);
        //array1 이 참조하는 배열의 1번 인덱스에 해당하는 값 2가 콘솔에 출력된다.


        int[] array2 = new int[]{1,2,3,4,5};
        //int 값을 5개저장 할 수 있는 배열이며, 해당 배열에는 1,2,3,4,5가 순서대로 저장되게 된다.
        //선언과 동시에 초기화
        System.out.println(array2[0]); //1


        /* for 반복문을 이용해서 배열 사용하기 */
        int[] iarray = new int[100];
        iarray[0] = 1;
        iarray[1] = 2;


        System.out.println(iarray.length);
        //배열을 참조하는 레퍼런스 변수.length 하면 해당 배열의 길이를 리턴한다.

        //배열에 1부터 100까지 값넣기
        //배열에 값을 반복적으로 넣어야 하므로, for 반복문을 이용한다.
        for(i = 0; i < iarray.length; i++){
            //배열의 인덱스는 0부터 시작하므로, 0부터 배열의 길이보다 하나 작을때까지 반복하면 배열의 크기만큼 반복할 수 있다.
            iarray[i] = i + 1;
            //배열의 인덱스는 0부터인데 넣고 싶은 값은 1부터 사용해야하므로, 인덱스에 1을 더해준 값을 넣어준다.
        }

        for(i = 0; i < iarray.length; i++){
            System.out.println(iarray[i]);
        }

        //배열에 저장된 값을 모두 더해주기
        int sum = 0;
        //값을 누적하기위한 변수는 반복문 밖에서 선언한다.

        for(i = 0; i < iarray.length; i++){
            // 배열의 크기만큼 반복한다.

            sum = sum + iarray[i];
            //반복문 밖에서 선언한 변수에 반복적으로 값을 누적한다.
        }

        System.out.println(sum);
        //배열에 들어있는 모든 값 누적한 변수를 출력한다.

        //배열에 저장된 값을 모두 곱해주기
        int mul = 1;

        for(i = 0  ; i < 10 ; i++){
            mul = mul * iarray[i];
        }

        System.out.println(mul);

        /* 2차원 배열 */
        int[][] array4 = new int[3][4];

//      2차원 배열에 값을 저장하는 방법
//      만약 array4[1] = 10 ; 이렇게 사용하면 오류!!
//      array4[1] 은 또 다른 1차원 배열을 가리킬 수 있는 참조형 변수이기 때문에 값을 담을수는 없다.
        array4[0][0] = 10;

        //가변크기의 2차원 배열을 생성하는 방법
        int[][] array5 = new int[3][];
        //위와 같이 선언하면 array5는 3개짜리 배열을 참조한다. 3개짜리 배열은 아직 참조하는 배열이 없다는 것을 의미.

        array5[0] = new int[1]; //정수를 하나 담을 수 있는 배열을 생성해서 array5 의 0 번째 인덱스가 참조한다.
        array5[1] = new int[2]; //정수를 두개 담을 수 있는 배열을 생성해서 array5 의 1 번째 인덱스가 참조한다.
        array5[2] = new int[3]; //정수를 세개 담을 수 있는 배열을 생성해서 array5 의 2 번째 인덱스가 참조한다.


        int[][] array6 = {{1}, {2,3}, {4,5,6}};
        //위와 같이 선언할 경우 array6[0][0] 는 1이다. array6[1][0]은 2이다.
        //선언과 동시에 초기화
        System.out.println(array6[2][0]); //4


        /* for each 문 */
        int[] iarr = {10,20,30,40,50};

        for(i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }

        for(int a :iarr){
            System.out.println(a);
        }

        double[] doublearray = {0, -32, 9.3, 3.14};

        for(double d: doublearray){
            System.out.println(d);
        }

    }
}
