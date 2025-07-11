package Day03;
//자바에서 데이터를 저장 하는 목적 VO(Value Object) 클래스의 기본 형식입니다.
//클래스 접근 권한은  일반적으로 public
public class People { 
    //객체의 특징값을 저장하는 변수는 private
    //전역(scope)변수는 기본값이 있습니다.
    private String name;
    private int age;
    private boolean isAdult;  //setAdult,isAdult

    //값의 접근 : 메소드 구현 (public 권한)
    //값을 가져오기 getter(getxxx) , 값을 저장하기 setter(setxxxx)

    //getter
    
    //권한  타입   
    public String getName(){

   //name 값을 가져오게-this 키워드는 객체의 필드를 가리키는 단어.
    return this.name;//강조
    }

    public void setName( String name){
    this.name = name;//구별하기 위해 쓰는거
    //this 는 객체가 만들어 졌을땨 자기자신을 가리킵니다.
    //this.name 은 객체에 필드 name = 인자로 전달된 name

 };
 public int getAge(){
    return this.age;
 }

public boolean isAdult(){
    return this.isAdult;
}
public void setAge(int age){
    this.age = age;
}

public void setAdult(boolean isAdult){
    this.isAdult = isAdult;

}
 }

