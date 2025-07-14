package Day04;

public class B20PeopleTest {
    
    public static void main(String[] args) {
        People[] members = new People[4];
        members[0] = new People("모모", 18, false);
        members[1] = new People("나연", 27, true);
        members[2] = new People("다현", 24, true);
        members[3] = new People("지현", 228, true);

        //1.members[] 배열이 참조하는 People 객체중 이름을 모두 출력하세요 
        //예시 : members[0].getName()
        System.out.println("====apaqj dlfma cnffurgkrl=====");
        for(int i = 0; i < members.length; i++){
            System.out.println("\t" + members[i].getName());
        }
        //2번 인덱스의 객체를 변경하기 : "사나",19,false
        members[2] = new People("사나", 19, false);



        //ㄴ 성인이 아닌 멤버 출력(toString() 리턴값)하기 
        System.out.println("~~~~~청소년 멤버 출력하기~~~~~`");
        for(int i=0;i<members.length;i++){
            if(!members[i].isAdult());
            System.out.println(members[i]);
        }

        System.out.println("====apaqj dlfma cnffurgkrl=====");
        int total = 0;
        for(People p : members){
        // p = members[i] 과 동일함. i값 순서대로 자동증가 
        System.out.println("\t" + p.getName());
        //멤버들 평균 나이를 구하기 위히 나이의 합계를 연산하세요
        total += p.getAge();
        }
        System.out.println("평균나이 :" + (double) total / members.length);
        
    }
       
}
