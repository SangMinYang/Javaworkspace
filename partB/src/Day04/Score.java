package Day04;

public class Score {
    private String name;
    private int kor;
    private int eng;
    private int math;
   /// 커스텀 생성자만 만들기 : 4개의 변수를 초기화
    public Score(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    

    // 예시 한번 초기화ㅣ 된 값이 수정되지 않아야 한다면 setter 정의 안할수 있습니다 

    // 예시2 :커스텀 생성자 이름 name 초기화 , setter 가 3개의 정수를 저장 하도록 할수도 있습니다.

     
      public static void main(String[] args) {

        Score nayeon = new Score("최나연");
        nayeon.setScore(88, 99, 100);
        System.out.println("이름만 초기화 되는 최나연 " + nayeon.kor + ", " + nayeon.eng + ", " + nayeon.math);
        
        Score hoya  = new Score("이름:호야", 89, 90, 50);
        System.out.println("호야의 이임" + hoya);
       
      }
      //getter 만들기
      public String getName() {
      return this.name ;
      }
      public int getisKor() {
      return this.kor ;
      }
      public int getisEng() {
      return this.eng ;
      }
      public int getisMath() {
      return this.math ;
      }
       //toString 재정의하기
      @Override
      public String toString() {
          
          return String.format( "%s-%d %d %s",this.name,this.kor,this.eng,this.math );
      }
      

    

    

   

   // setter 가 3개의 정수를 저장 하도록
    public Score(String name) {
        this.name = name;
    }
    public void setScore(int kor ,int eng, int math) {
        this.kor =kor;
        this.eng =eng;
        this.math =math;
        

    }

   
    
 
}

