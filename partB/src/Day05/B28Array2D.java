package Day05;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

public class B28Array2D {

    public static void main(String[] args) {

       
        int[][] matrix = {{1, 2, 3, 4}, {4, 5, 6 }, {7, 8, 9, 10}};
         //2(N)차원 배열은 1차원의 배열의 배열
         //2차원 배열의 요소인 배열들은 크기가 각각 다를수 있습니다.
        System.out.println(matrix.length);
        
        System.out.println(matrix[0] + " ," 
        + Arrays.toString(matrix[0]) + "," + matrix[0].length);
       //[I@4517d9a3 는 matrix[0] 배열의 참조값
       //[1, 2, 3, 4] 는 matrix[0] 배열의 데이터
       //4 matrix[0] 배열의 크기

       System.out.println(" 인덱스2번 배열의 1번 값을 출력: " 
                           + matrix[2][1]);
for (int i = 0; i < matrix.length; i++) {  //배열의 위치(인덱스) 0,1,2
    for (int j = 0; j < matrix[i].length; j++) { //j배열 안에서의 인덱스 0.1.2.3
        // System.out.print(matrix[i][j] + " "); // 줄바꿈 없음
       System.out.println(String.format("matrix[%d][%d]=%d", 
                                                i,j,matrix[i][j]));
     

    }
    for(int i =0; i < matrix.length; i++) {
        for(int j=0; j<matrix[i].length; j++);
        System.out.println(matrix[i][j]);
     }


    
    // System.out.println();
}
        






    }

}
