package day02;

import day02.MyClass;

public class B06MethodeTest {
    /**
     
     * 메소드의 형식.
     * ㄴ정해진 기능을 처리.재사용성 을 위한 함수 형식
     * ㄴ입력 과 출력 입력은 메소드 인자,출력은 메소드 리턴
     *      ㄴ인자, 리턴 유무 조합으로 4가지 형식 가능
     * *////static 키워드 : 객체를 new 연산으로 만들지 않고 클래스이름으로 바로사용할수 있는 형식
     //                    static 는 객체 개념과 상관이없다.
         
          public static void main(String[] args) {
            MyClass.helo();
            MyClass.message = "HI,HELLO";
            System.out.println(MyClass.message);
            MyClass.helo("React");
            MyClass.helo("HTML");

            System.out.println("MyClass message 변수 문자열 :" + MyClass.getMessage());
            System.out.println("MyClass message 변수 문자열 길이 :" + MyClass.getMessageLength());
            System.out.println("MyClass message 변수 문자열 길이 :" + MyClass.getStringInfo("HIHI"));
            
            System.out.println();

            
  

 
          }
}
class MyClass {
    static String message;

    //메소드 인자가 없는것 VS 있는것 
    static void helo() {
        System.out.println("============= ");
        System.out.println("welcom!! 호호호호 ");
        System.out.println("============= ");

    }
    static void helo(String  language) {
        System.out.println("============= ");
        System.out.println("welcom!!" + language );// language 변수는 메소드 입력갑 -> 인자로 선언
        System.out.println("============= ");

    }

    //리턴이 있는 메소드
    static String getMessage() {
        return message;
    }
    static int getMessageLength(){
        return message.length();  //문자열의 길이를 구하는 메소드 
    }


    //getStringInfo(문자열) 실행 하면 문자열의 길이를 리턴하는 메소드

    static int getStringInfo(String data) {
        return data.length();
    }


 }




