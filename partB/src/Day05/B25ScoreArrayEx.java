package Day05;

import java.util.Arrays;

public class B25ScoreArrayEx {
    public static void main(String[] args) {
        
        StudentScore sana = new StudentScore();
        StudentScore momo = new StudentScore("김모모", 78, 100, 88);

        sana.updateScores()
        momo.setKor() 
        System.out.println();
        System.out.println("sana 성적 :" + Arrays.toString(sana.getScores()) + "avg:" + sana.getAverage() + ","
        + sana.getGrade()); //sana 성적 : [99,90,89] avg :92,66,A
        System.out.println("momo 성적 : " + Arrays.toString(momo.getScores()) + "avg:" + momo.getAverage() + ","
        + momo.getGrade());//momo 성적 : [92, 100, 88] avg :93,33,A

        //scores 배열테스트
        int[] temp = momo.getScores();  //참조값 전달 
        temp[2] = 11; ///MATH 인덱스2번
        System.out.println(momo.getMath); //객체의 배열요소 값이 수정 됩니다.
        // -> 배열을 리턴할떄 (getxxx 메소드) : 선택하기 참조값 vs 새로운 배열 
        System.out.println(Araays.toString(momo.getScores()));

        System.out.println("사나의 최대점수:" + sana.getMaxScore());
        System.out.println("사나의 최소점수:" + sana.minMaxScore());

    }

}

class StudentScore {
    private String name;
    private int [] scores; // 국어,영어,수학 점수를 저장하는 배열 

    // 상수 정의 (배열의 인덱스) :final 키워드는 변수의 값을 변경할수 없다.
    private static final int KOR=0;
    private static final int ENG=1;
    private static final int MATH=2;

    //기본 생성자 
    public StudentScore(){
        this.scores = new int[3]; // 3개 과목
    }

    //매개 변수 생성자
    public StudentScore(String name , int kor, int eng , int math) {
        this(); // 자신의 기본 생성자 호충 .this 가 생성된 객체 자신(첫줄에 작성)
        this.name = name;
        this.scores = new int[3];
        this.scores[KOR] = kor;
        this.scores[ENG] = eng;
        this.scores[MATH] = math;

    }
     // 이름 getter/setter
     public String getName() {
        return name;
     }
     public void setName(String name) {
        this.name =name;
     }
     //국어 점수 getter/setter
     public int getKor() {
        return scores[KOR];
     }
     public void setKor(int kor) {
        this.scores[KOR] =kor;
     }
     //영어 점수 getter/setter
     public int getEng() {

     }
     public void setEng(int eng) {

     }
     //수학점수 getter/setter
     public int getMath() {
        return scores[MATH];
     }
     public void setMath(int math) {
        this.scores[MATH] = math;
     }

     

    //점수 배열 전체 getter
    public int[] getScores() {
        return
    }

    //총점 계산 
    public int getTotal() {
        int total = 0;
        for (int score : scores) {
            
        }
    }


    //평균 계산 - 소수점이하 둘쨰자리 까지 리턴
    public double.getAverage() {
        return Math.floor() / 100;

    }
    //등급계산 (평균 기준)
    public String getGrade() {
        int avg = getAverage();
        return switch (avg / 10) {
            case 10,9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default ->"F";
            
        }
    }

    //모든점수 업데이트 
    public void updateScores(int kor, int eng, int math ){

    }




    //최고 점수 찾기 if scores[i] > max max = scores[i]
    public int getMaxScore() {
        int max = scores[0];
        for(int i = 1; i < socres.length; i++) {
            if(){
                max = scores[i];
            }
        }
        return max;
    }
    







  

}
