package Day05;

import java.io.IOException;

public class B27CheckedException {


    public static void main(String[] args) {
        Score s1 =new Score();
        //s1.setScore(-9); //score 값 오류!! IOException 발생 시켯음 으로 예외 처리 필수
        try{
          s1.setScore(-9);
        } catch (Exception e) {
        System.out.println("예외발생 :" + e.getMessage() + "," + e.getClass());

        }

        
    }

}

class Score{
    private int score; //0~100
                   
    public int getScore(){
        return score;
    }            
                                
                                   // 여기서 직접 TRY -CATCH 안하면 사용하는  MAIN 으로 위임(떠넘기기)   throws IOException 
    public void setScore(int score) throws IOException{                                      
        if(score >=0 && score <= 100) {
            this.score = score;
        }else {
            //잘못된값 -> 예외 발생 처리 java.lang.IllegalArgumentException: score 갑오류!!!
            // throw new IllegalArgumentException("score 갑오류!!!"); //Checked 예외 x
            throw new IOException("score 갑오류!!!");// Checked 예외
          //
        }
    }
}
