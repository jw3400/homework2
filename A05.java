import java.util.*;

class A05 {
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요. : ");
		int birth_year = s.nextInt();

		int age = cal(birth_year);
		print(age);

	}

	int cal(int birth_year){
		int age = 0;
		age = 2016 - birth_year + 1;
		return age;
	}

	void print(int age){
		if(age >= 0 && age < 7)
			System.out.println("유아입니다.");
	
		else if(age >= 7 && age < 13)
			System.out.println("어린이입니다.");
		
		else if(age >= 13 && age < 20)
			System.out.println("청소년입니다.");
		
		else if(age >= 20 && age < 30)
			System.out.println("청년입니다.");

		else if(age >= 30 && age < 60)
			System.out.println("중년입니다.");
		
		else if(age >= 60)
			System.out.println("노년입니다.");
		
		else
			System.out.println("사람이 아닙니다.");

	}

	public static void main(String[] args){
	
		new A05().input();
	}




}
