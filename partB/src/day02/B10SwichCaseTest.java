package day02;

public class B10SwichCaseTest {

    public static void main(String[] args) {
        
     String op ; // + - * / 값만 사용


     boolean status = true;

     
     while (true) {
        op = System.console().readLine("연산 선택하기 (+, -, *, / ) : 종료는 N입력 >>>>");

        
    
     switch (op) {
        case "+" :
            System.out.println("더하기기를 사용 하셧습니다");
            break;
                case "-" :
                System.out.println("뺴기를 사용 하셧습니다");
            
            break;  
            case "*":
            System.out.println("곱하기를 사용 하셧습니다");
            break;
            case "/":
            System.out.println("나누기를 사용 하셧습니다");
            break;
            case "N","n" : // while 종료 조건.
            status = false;
            break;
        default:
            System.out.println("잘못된 선택 입니다. +,-,*,/ 값만 사용합니다.");
            break;
        } }
}


    }


