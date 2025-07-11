package day02;

public class B02StringTest {
    //String 클래스 타입의 객체의 특징
    public static void main(String[] args) {
        String n1 ="모모";
        String n2 ="사나";

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1.hashCode());// 앞에 B01 모모의 참조값 16진수 .hashCode() 메소드는 10진수 
        System.out.println(n2.hashCode());// n1 참조값1529088 n2 참조값1574252
        

        n1="momo";
        n2="sana";
        System.out.println(n1.hashCode() + "," + n2.hashCode()); // n1 3357380, n2 3522689
        //🔥문자열은 : immutable(불변)객체
        //              특정 문자열이 메모리에 저장 되었어요. 그주소가 100이라면 
        //              다른 주소 100에는 다른 문자열로 바뀌어서 저장될수 없어요.
        // 결론: 변수 n1 과 같은 변수가 참조하는 문자열이 바뀌면 참조값도 변경된다.*객체가 새로 생성된다


        String n3="모모";
        String n4="sana";
        System.out.println(n3.hashCode() + "," + n4.hashCode()); //n3은?   1529088               n4은? 3522689
     }

}
