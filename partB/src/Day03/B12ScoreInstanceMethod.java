package Day03;

public class B12ScoreInstanceMethod {

    public static void main(String[] args) {
        
       
        Score momo = new Score();
        momo.name = "김모모";
        momo.kor = 99;
        momo.eng = 123;
        momo.math = 50;
        System.out.println("저장돤 객체의 값 유효성 검사하기 ==========");
       System.out.println("name:" +momo.isNameValid());
       System.out.println("kor:" +momo.isKorValid());
       System.out.println("eng:" +momo.isEorValid());
       System.out.println("math:" +momo.isMathValid());
       System.out.println("모든 점수:" +momo.isScoresValid());
       System.out.println("점수 수정 중---------");
    //    momo.eng = 100;
       if (momo.isScoresValid()) {

        //접수 합계
       
        System.out.println("총점 :" + momo.sum());
        // System.out.println("학점 :" + momo.getGrade());
        System.out.println("평균 :" + momo.avg());
       }else {
                    //이스케이프 문자 : \\ , \"
        System.out.println("점수값 오류 (\"모든 과목의 점수는 \\0~100\\ 로 합니다\").");
        System.out.println("학점" + (momo.isScoresValid() ? momo.getGrade() : 'E'));// 'E'
       }
       
    
    }
              
}

class Score {

    String name;
    int kor;
    int eng;
    int math;


    //점수의 합계 구하기 -int 리턴
    int sum() {
        return kor + eng + math;
    }

    double avg() {
        //나눗셈 결과를 실수로 하고 싶다면 .... 2개의 정수중 하나를 실수로 변경
        //강제 형 변환.값 앞에 (double)변수명
        // ㄴ정수와 실수 둘다 수치 => 강제 캐스팅.Double.valueOf 모두가능
        // ㄴ문자열과 실수는 성격이 다름.-> 강제 캐스팅 x,Double.valueOf 만 가능 
        return (double) sum() /3;
    } 

     
    // 평균:90 점이상 a 80이상 b 70점이상 c 그외에는 F -char 리턴
    //정수 / 정수 = 정수(몫)
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
            garde='E'; //오류를 뜻하는 약속
                break;
        }
        return garde;
    }

      //이름 패턴 검사 - 정규식 결과는 참또는 거짓 리턴 메소드는 isXXXX
    boolean isScoresValid() {
        return isKorValid() && isEorValid() && isMathValid();
    }

   
    boolean isNameValid(){
        return name.matches("^[가-힣][2,5]$");
    }
      
    boolean isKorValid(){

            
        return kor >=0 && kor <=100;
    }
  
      
    boolean isEorValid(){

            
        return eng >=0 && eng <=100;
    }
    boolean isMathValid(){

            
        return math >=0 && math <=100;
    }


    
    
    // kor:0~100 isKorValid
    //eng:0~100 isEorValid
    //math:0~100 


    @Override
    public String toString() { //overriding 재정의 
        
        // return name  + " : " + kor + "," + eng + "," +math;

        return String.format("%s : %d, %d,%d" , name,kor,eng,math);
        // "출력" 포맷을 데이터 형식 기호로 작성, 순서대로 값을 나열 
    }
}
