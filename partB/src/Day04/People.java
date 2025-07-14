package Day04;

public class People {
    private String name;
    private int age;
    private boolean isAdult;

    //1)기본 생성자는 컴파일러가 자동으로 만들어 줍니다.
             //ㄴnew People() 로 객체 생성할때 People()가 기본생성자 메소드 입니다.
             public People() {
    System.out.println("People 기본 생성자 실행합니다."); // 테스트용 출력문
  }



  
  //2) 커스텀 생성자
    public People(String name, int age , boolean isAdult) {
    this.name = name;
    this.age = age;
    this.isAdult = isAdult;}


    //커슽컴 생성자는 필요한 변수만 초기화 하도록 많이 만들 수 있습니다.

   public People(String name) {
    this.name = name; }

     public People( int age) {
    this.age = age;}

    public People( boolean isAdult) {
    this.isAdult = isAdult;}

    //🔥오버로딩(overloding) : 메소드 이름은 같고, 메소드의 인자가 타입과 개수 다른 형태 
    //  ㄴ생성자를 포함해서 모든 메소드에 적용을 할수있다.
   

//*복습 기본 생성자를 사용할떄에는 setter 가 필수 
public void setName(String name) {
    this.name = name;
}

public void setAdult(boolean isAdult) {
    this.isAdult = isAdult;
}


public void setAge(int age) {
    this.age = age;

}

//값을 읽기 위해서 공통적으로 getter 필요

public String getName(){
    return this.name;
}
public int getAge(){
    return this.age;
}
public boolean getIsAdult(){
    return this.isAdult;
}

//toString() 재정의
@Override
public String toString() {
    
    return String.format(name,"%s - %d %s" , this.name, this.age, this.isAdult);
}




}
