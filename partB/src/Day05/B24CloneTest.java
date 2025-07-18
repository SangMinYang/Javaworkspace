package Day05;

public class B24CloneTest {
    //Clone() 은  Object클래스 최상위 부모로부터 상속 받는 메소드 
    public static void main(String[] args) {
        try{Student sana = new Student("최사나", 29);
        Student sanaClone = sana.clone(); 
        // checked 예외 : 컴파일러가 메소드의 예외 가능성을 알고있어요.
        
        //----> 예외 처리가 필수.
        System.out.println("sanaClone:" +sanaClone.getName()+"," + 
        sanaClone.getAge());


        System.out.println("sana 주소 " + sana);

        System.out.println("sanaClone 주소 " + sanaClone);
    }catch(Exception e) {
    System.out.println("clone 예외 발생!!!");
    }
        
        
    }

}

class Student implements Cloneable{
   private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    protected Student clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return(Student) super.clone();// super 는 Object 부모 클래스
        //     ㄴ부모가 물러준 clone()메소드 실행 합니다.
        //리턴 타입이 Object 입니다. -> Student 로 캐스팅 

    }

}
