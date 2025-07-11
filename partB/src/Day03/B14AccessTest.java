package Day03;

   /**
         * 접근권환 방식
         * 
         * 클래스 : public , default (기본)
         * 메소드 : public , default ,priavate
         * 전역변수 : public, default ,priavate
         * -공통적으로 protected 는 상속 (이후 진도
         * 
         * public 모든 클래스에서 사용 가능 
         * dufault 같은 패키지에서 사용가능 
         * priavate 현재클래스에서 사용가능 
         */
public class B14AccessTest {
   static void main(String[] args) {
    System.out.println("test");
     Score2 momo = new Score2(); 
     momo.name="김모모";
     momo.kor=99; momo.eng=99; momo.math=98;
    //  momo.grade  =3; //오류 private 
    //  System.out.println(momo.isKorValid()); //오류 PRIVATE 안에서 쓸수없다

    }

    /*//아래와 같이 test 패키지에서 public defaulf 차이를 비교함
     * package Test;

       import Day03.B14AccessTest;

     public class Score2Test {
    public static void main(String[] args) {
        // Score2 momo = new Score2(); // 오류: default 접근 클래스
      B14AccessTest test =new  B14AccessTest(); // public 접근 클래스
      //객체는 만들수는 있으나 인스턴트 요소 없어 test 풀력 안됨
      // 단,import 로 패키지 위치를 알려주려고 사용
        
    }
     * 
     */ 
}
class Score2 { //같은 패키지 안에 있는것들은 사용할수 있는 형태 

    String name;
    int kor;
    int eng;
    int math;
    private int garde;


    
    int sum() {
        return kor + eng + math;
    }

    double avg() {
       
        return (double) sum() /3;
    } 

    char getGrade() {

        int avg = sum() /3;
        char garde;
        switch (avg/10) {
            case 10,9:
                 garde='A' ;
                break;
            case 8:
                  garde='B' ;
                break;
            case 7:
                  garde='C' ;
                break;
                case 6,5,4,3,2,1,0:
                garde='F';
        
            default:
            garde='E';
                break;
        }
        return garde;
    }

     
    boolean isScoresValid() {
        return isKorValid() && isEorValid() && isMathValid();
    }

   
    boolean isNameValid(){
        return name.matches("^[가-힣][2,5]$");
    }
      
    private boolean isKorValid(){

            
        return kor >=0 && kor <=100;
    }
  
      
     private boolean isEorValid(){

            
        return eng >=0 && eng <=100;
    }
    private boolean isMathValid(){

            
        return math >=0 && math <=100;
    }




    @Override
    public String toString() { 
        
        return String.format("%s : %d, %d,%d" , name,kor,eng,math);
       
    }
}
