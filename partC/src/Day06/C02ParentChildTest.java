package Day06;

public class C02ParentChildTest {
    public static void main(String[] args) {
        YourParent yp = new YourParent();
        yp.setMessage("Wellcome!!1");
        System.out.println("부모의 메세지:" + yp.getMessage());
        
        YourChild yc = new YourChild();
       yc.setMessage("Wellcome!!");
      System.out.println("자식의 메세지" + yc.getMessage());
      yc.setName("모모");
      System.out.println("자식이름 :" + yc.getName());
     //chcp 65001 -> 이모지 출력하려면 설정 해야함
     //이모지 3byte 이상 차지함 

     yp.setNum(1000);
     yp.setName("김떙떙");
     yp.setNum(999);

     System.out.println("====부모와 자식의 객체=======");
     System.out.println(yp);
     System.out.println(yc);//부모가 재정의한 toString()을 자식이 상속 받음 

    }
}
    

    

    class YourChild extends YourParent {// 부모가 물려준 메소드를 재정의하는 자식 클래스
        //부모가 정의한 setMessage() 재정의 가능함 -->기능 수행을 변경.
        //🔥주의)부모가 public -> 자식도 public 사용 해야함 
        @Override
       public void setMessage(String message) {
            // this.message = message; // private 접근 오류 
            String imoji = "👨";//vs code 에서 이모지 출력하려면 터미널 명령어 chcp 65001 실행하기
            super.setMessage(message.concat(imoji));
            
            //super 키워드 : 부모객체
            //super 를 안쓰면 자식의 setMessage()를 실행하면서 무한으로 'self 호출' (재귀)

        }

        @Override
        public void setName(String name) {
            this.name ="👨" + name;
        }
    }



class YourParent{
    private String message;
    private int num;
    protected String name; //🔥 protected 자식만 접근 할수 있도록 합니다.

    YourParent(){
        this.message="unknown";

    }

    //Object 자바 클래스를 상속.toString() 재정의 
    @Override
    public String toString() {
        
        return String.format("%s %s (%d)", name, message,num);
    }




    //getter and settter 주의)) class 가 default 일떄 메소드 public 의미없음.default 로 동작
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
