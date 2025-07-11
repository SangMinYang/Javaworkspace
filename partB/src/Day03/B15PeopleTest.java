package Day03;

public class B15PeopleTest {
    //People 클래스 활용
    public static void main(String[] args) {
        People momo = new People();
        String name = momo.getName();
        int age = momo.getAge();
        
        
        
       
       
        System.out.println("화원이름:" + momo); // 객체의 기본값 null 

        //momo 객체에게 name 필드를 "김모모" 하고싶은데...
        momo.setName("김모모"); //
        System.out.println("화원이름:" + momo.getName());

        People sana = new People();
        sana.setName("최사나");
        System.out.println("sana 회원 이름:" + sana.getName());

        momo.setAge(28);
        System.out.println("나이" + momo.getAge());

        momo.isAdult(){
            System.out.println("성인입니까?" + momo.isAdult());
        }
        
        
        //참고
        // int age; //오류 : 지역변수 기본값이 없습니다.
        // System.out.println(age);


        
    }

}
