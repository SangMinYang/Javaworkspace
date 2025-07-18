package Day03;

public class B13Casting {
    /**
     * 기본형 데이터 타입간의 현환 : casting
     * byte < short < int < long < float < double
     * 
     * 1.자동 캐스팅 :표현의 범위가 더 큰쪽으로 대입하는 경우 
     * 
     * 2.강제 캐스팅: 표현의 범위가 작은 쪽으로 강제 대입
     */
       public static void main(String[] args) {
        double test = 23; //double 변수에 = int 값


        int num = (int)2147483648L; //int 변수 = long 값; 은 값이 잘림 => 강제 변환

        System.out.println(test);
        System.out.println(num);

        //B12 번에서 변수를 사용 했다면  double temp = sum (); 변수를 선언 하지않고 바로 실수로 변환 하기 위해서 
        //(double)sum() /3;  
       }
}
