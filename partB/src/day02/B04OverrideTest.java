package day02;
/*
 * 
 * '오버라이드' 클래스는 '상속' 관련 개념입니다.
 * 자바의 모든 클래스는 Object 라는 이름의 최상위 클래스를 자동 상속받습니다.
 * Object 는 몇가지 기본 메소드를 갖고있어요. 이것을 새로운 클래스를 만들면서 변경할수 있으며
 * 그것이 '오버라이드' 입니다.
 * 
 * 
 */
public class B04OverrideTest {
    public static void main(String[] args) {
 Score2 momo = new Score2();

        momo.name="모모";
        momo.kor=99;
        momo.eng=89;
        momo.math=88;
        
        System.out.println("momo 의 정보" + momo); 
        System.out.println("---------- " + momo.name + "," + momo.kor + "," + momo.eng + "," + momo.math);
    }

}
//Score 클래스는 B01 파일에 이미 정의된 같은 패키지에서 같은 이름의 클래스 사용 못함
class Score2{ // 시작
    String name;
    int kor;
    int eng;
    int math;
    //Object 는 부모 클래스의 메소드 : clone(), hashcode(), equals(), toString()
    //toS) @Override 는tring() 은 오버라이드(재정의 실행코드가 아니라 개발관련 주석(Annotation)
    @Override
    public String toString() {
        
        return "---------- " + name + "," + kor + "," + eng + "," + math;
    } 
}//Score 끝 (Scope-범위)
/**
 * 정리:
 * Score2 momo =new Score2();
 * String sana = "sana"
 * 
 * //아래의 2줄은 모두 momo.toString(),sana.toString() 을 실행합니다.
 * //기본적으로 '객체참조변수.toString() 은 참조값 출력'
 * //toString( 을 재정의 (오버라이드) 하면 출력 문자열을 바꿀수 있다.
 * // 🔥 String 클래스는 이미 toString() 메소드가 재정의 되어서 문자열이 출력합니다.
 * // 🔥개발자가 만든 클래스는 개발자가 재정의 합니다.
 * System.out.println(momo);
 * System.out.println(sana);
 */
