import java.util.*;

class A04 {
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = s.nextInt();

		System.out.print("영어 점수를 입력하세요 : ");
		int eng = s.nextInt();

		System.out.print("수학 점수를 입력하세요 : ");
		int math = s.nextInt();

		int total = cal(kor, eng, math);
		System.out.println("입력하신 점수의 총점은 " + total + " 이고,");

		double avg = cal2(total);
		System.out.println("평균은 " + avg + " 입니다.");

		print(kor);
		print2(eng);
		print3(math);

	}

	int cal(int kor, int eng, int math){

		int total = 0;
		total = kor + eng + math;
		return total;
	
	}

	double cal2(int total){

		double avg = 0;
		avg = total / 3;
		return avg;
	
	}

	void print(int kor){
		if(kor >= 90)
			System.out.println("국어점수가 우수합니다.");		
	}

	void print2(int eng){
		if(eng >= 90)
			System.out.println("영어점수가 우수합니다.");
	}

	void print3(int math){
		if(math >= 90)
			System.out.println("수학점수가 우수합니다.");
	}
	
	public static void main(String[] arg){

		new A04().input();

	}

}
