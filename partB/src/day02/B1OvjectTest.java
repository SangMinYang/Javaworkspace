package day02;
//Java. 소스파일에 클래스는 여러개 정의  가능합니다.
//Public 클래스는 1개 Public 클래스 이름= '파일명'
public class B1OvjectTest {

    public static void main(String[] args) {
        // Score 타입 객체 생성 => 변수로 객체의 주소 참조 
        Score momo = new Score();

        momo.name="모모";
        momo.kor=99;
        momo.eng=89;
        momo.math=88;
        //day02.Score@372f7a8d 는 패키지명.클래스명@객체의 참조값는 필드값 이용해서 만들고
        //객체의 주소 찾아갈때 사용.
        System.out.println("momo 의 정보" + momo); 
        
        System.out.println("---------- " + momo.name + "," + momo.kor + "," + momo.eng + "," + momo.math);

         Score momo2 = momo; //momo의 참조값(주소) momo2 변수에 저장 타입은 반드시  Score로 해야합니다.
         System.out.println("momo2 의 정보" + momo);
         System.out.println("---------- " + momo2.name + "," + momo2.kor + "," + momo2.eng + "," + momo2.math);
           //결론 : 여기까지 Score 객체는 몇개 인가? 1개 
           momo.name="momo"; momo.kor=100; momo.eng=100; momo.math=100;
           System.out.println("모모의정보:" + momo); //참조값(주소)은 변경이 안된다(같은객체)
    }
    //Score 와 관련된 특징값 또는 기능 정의
    static class Score {
        //필드 속성 프로퍼티
         String name; //학생이름
         int kor;
         int eng;
         int math;

     //메소드는 다음 진도에서
    }

}
