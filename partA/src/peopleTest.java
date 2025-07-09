public class peopleTest {
    public static void main(String[] args) {
        //People 클래스를 이용하여 객체를 만듭니다.
        //-> 객체를 만드는 연산은 new 입니다.
        //변수는 참조형 타입으로 객체의 주소를 저장합니다.
        people sana = new people();  //  클래스 타입 변수명 = new 클래스이름()
        people momo = new people();  // java 객체를 만들때 사용되는 기본형식 
       //앞 타입          뒤 클래스이름  통일 시켜야 객체 만들떄 사용되는 기본형식 
       System.out.println("sana people 객체 정보(속성의 기본값 확인)---------");
       System.out.println("name :" + sana.name);   //null(참조형 기본값)값이 없다 
       System.out.println("name :" + sana.age);   //0 
       System.out.println("name :" + sana.isAdult); //false
       System.out.println("name :" + sana.gender);//''

       // momo 객체에 속성값을 저장하기 (하나의 대상으로 다른 데이터 저장할떄 객체명을 쓰면된다)
       //(Object)는 데이터의 대상이 여러값(또는 기능/메소드 ) 표현될떄사용

       momo.name = "김모모";
       momo.age =23;
       momo.isAdult=true;
       momo.gender='F';
       System.out.println("momo people 객체 정보 (속성 저장값 확인)---------");
       System.out.println("name:" + momo.name);
       System.out.println("age:" + momo.age);
       System.out.println("isAdult:" + momo.isAdult);
       System.out.println("gender:" + momo.gender);

    //    System.out.println("weight:" + momo.weight);//오류 : People 클래스에 없는 속성 (resolved)
        

       //참고: 문자열 객체 생성
        String test = new String();
        String test2 = "트와이스";
    }

}
