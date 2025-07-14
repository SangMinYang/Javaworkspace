package Day04;

import java.util.Arrays;
//자바에서 java.lang 기본 패키지 이외의 곳들은 import 하고 사용.
//java.lang 패키지 소속. String , Sytem , Integer 와 같은 래퍼 클래스 등등

public class B18ArrayTest {
    public static void main(String[] args) {
        //자바의 배열 선언 : 배열 타입 []기호, 배열 리터럴 {}
        int[] arr1 = {11, 22,33,44,55,};
        int[] arr2 = new int [10]; //10개요소 메모리 공강 확보ㅡ 기본값은0
        System.out.println("arr1: " +arr1);//arr1 : [I@4517d9a3 에서 [I int 배열]
        System.out.println("arr2: " +arr2);

     double[] drr1 = {5.2,6.1,6.8};
     double[] drr2 = {5.2,6.1,6.8};
     System.out.println("drr1" + drr1); //drr1[D@85ede7b 참조값 
     System.out.println("drr2" + drr2); //drr2[D@5674cd4d 참조값 

     //배열의 기본 속성 (메소드 아님 )
       System.out.println("arr1: " + arr1.length);//arr1 : 5
       System.out.println("arr2: " + arr2.length);//arr2 : 10
        

        //배열 요소는 인덱스로 지정합니다 . 인덱스 0 부터 
        // arr1, arr2 배열의 마지막 요소를 99 로 저장하기 

        arr1[arr1.length-1] =99; 
        arr2[arr2.length-1] =99;
        System.out.println("arr1[4]:" +arr1[4]); 
        System.out.println("arr2[9]:" +arr2[9]); 

        //자바 스크립는 배열 메소드 중에 push(),pull() 로 배열의 크기(length)가 동적으로 변경
        //자바는 배열 크기는 고정입니다.
        //자바는 배열관련 메소드는 Arrays 클래스의 static 메소드 사용합니다.

        //1.배열의 값들을 하나의 문자열로 리턴
        System.out.println("arr1:" + Arrays.toString(arr1)); 
        System.out.println("arr2:" + Arrays.toString(arr2)); 
        //2.배열 요소를 특정 값으로 채우기 
        Arrays.fill(arr2, 3);
        System.out.println("arr2:" + Arrays.toString(arr2)); 
        Arrays.fill(arr2, 2, 5, 7); //7로 채워지는 인덱스 :2,3,4
         System.out.println("arr2:" + Arrays.toString(arr2)); 

         //배열의 비교 

         System.out.println("실수배열 비교:" + (drr1 == drr2)); //참조갑 비교 false
         System.out.println("실수배열배열 요소 값 비교:" + Arrays.equals(drr1, drr2)); //true


         //배열의 복사 : 복사한 새로운 배열의 참조값을 리턴 -int[]

         int[] newarr1 = Arrays.copyOf(arr1, 3);
         // 첫번재 인자 배열에서 복사하기, 두번재 인자는 복사할 갯수
         System.out.println("복사한 배열 :" + Arrays.toString(newarr1)); 

         //5 배열의 정렬

         int [] sarr1 = {56,45,77,64,72};
         Arrays.sort(sarr1);
         System.out.println("정렬후 sarr1 배열" + Arrays.toString(sarr1) );

         /*Arrays 의 메소드 중에서 fill , sort 는 리턴타입이 void 이며 배열의 요소 값들을 변경 */
         

    
    
    }

}
