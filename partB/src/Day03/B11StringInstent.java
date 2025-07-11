package Day03;

import java.nio.channels.Pipe.SourceChannel;

//String 클래스의 인스턴스 메소드 
//                 ㄴ 생성된 객체를 대상으로 실행하며 객체의 값에따라 결과가 다름
public class B11StringInstent {
    public static void main(String[] args) {
        
     String message ="Hello";
    //  String temp =new String("helo"); message,temp2는 같은 참조값  참조값이 다른 하나가 temp 
    //  String temp2 ="hello";

       //message 문자열 객체의 이;ㄴ스턴스 메소드 (자바스크립트 ,차이썬 등 거의 유사)
       message = "helo~ java!!";// 문자열 구성하는 문자의 위치는 0부터 시작 (배열의 인덱스 생각)
     System.out.println(message);  //message.toString() 실행.재정의 (오버라이드)

     

    
    //각 메소드가 어떤형식의 데이터를 리턴하는가?
    //🔥인스턴스 메소드  실행으로 원래 문자열 객체의 상태가 바뀌지가 않는다(문자열 자체가 바뀌지 않는다)
    //          ㄴ리턴 타입이  String 경우 : 새로운 문자열이 만들어 집니다.

     System.out.println(message.length());//(공백도 문자열 길이로 취급)    int
     System.out.println(message.charAt(5));                      //?
     System.out.println(message.toUpperCase());//                      //String (문자열 소문자를 대문자로 바뀌어줌 )
     System.out.println(message.indexOf("java"));                  //int *
     System.out.println(message.startsWith("hell"));          //boolean // * 문자열 비교 끝나는 지점이 맞는지 확인 (false)
     System.out.println(message.endsWith("java!!"));             // boolean * => 문자열 비교 끝나는 지점이 맞는지 확인 (ture)
     System.out.println(message.replace(" ", "+")); //String (교체)
     System.out.println(message.substring(1, 3));//String
     System.out.println(message.substring(4));    
     System.out.println(message.indexOf("* "));            //String 없는 문자열이면-1
     System.out.println(message.lastIndexOf(" "));            //int
     System.out.println(message.concat("??"));                   // String
     System.out.println(message.equals("helo~java"));        // boolean
     //                       주의 : 자바는 문자열 같은지 비교할떄 == 안된다. (참조값비교)
     //                              ㄴ꼭 equals 를 쓰세요 

     //
      String test = "   ";
      System.out.println(test.isBlank());// test.length() > 0 , 공백만 있으면 true
      System.out.println(test.isEmpty()); // 문자열의 길이가 0일떄 true
      //정규식 패턴 검사 : 예시)핸드폰 번호010-숫자 네자리-숫자 네자리
      String regex = "^010-\\d{4}-\\d{4}$"; // d
      String hpnum = "010-3456-9999";
      System.out.println(hpnum.matches(regex));  // ture
      System.out.println("010-5489-555" .matches(regex)); //false
      // - 기호를 선택적.없거나 한번나오기
      System.out.println("01054895555" .matches("^010-?\\d{4}-?\\d{4}$"));//false

      String name ="김떙떙";  //이름은 한글만 허용한다.
      //순서는 없고, 가능한 문자셋을 [] 기호안에 나열 , 범위는 a~z 또는 A~Z
      //+기호는 반드시 한글자 이상 뜻하는 기호 
      regex="^[가-힣]{2,5}$"; // 이름이 1개문자일떄도 허용
      System.out.println(name.matches((regex)));
      System.out.println("jone".matches((regex)));
      //영문자 검사 
      System.out.println("jone".matches("^[A-Z][a-zA-Z\\s]+$"));

     
    }

}
