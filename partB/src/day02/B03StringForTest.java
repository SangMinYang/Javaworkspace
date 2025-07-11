package day02;

public class B03StringForTest {
    public static void main(String[] args) {
        //for(초기값; 조건식'증감식
        String test ="테스트";
        for(int i=0;i<5;i++) {
            test = test + " " + i; //기존 테스트 문자열에 공백과 i값을 연결해서 테스트 변수로 참조시켜라 
            System.out.println(test);
        }
        //테스트 초기값 이후 5번이 변경 됩니다. => 6개의 문자열 객체가 생성 
        //객체를 사용하는 관점에서 동일하게 유지하고 싶다면 StringBuffer, StringBuilder 클래스 사용 (불변객체는 아니다)
        

    }

}
