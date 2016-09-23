import java.util.*;

class A01 {
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		int birth_year = s.nextInt();
		int age = cal(birth_year);
	
	}

	int cal(int birth_year){
		int age = 0;
		age = 2014 - birth_year + 1;
		return age;
	}

	void print(){
		if(int age > 20){
			System.out.print("미성년자가 아닙니다.");
		}
		else {
			System.out.print("미성년자 입니다.");
		}
	}

	public static void main(String[] args){
		new A01().input();
	}


}
