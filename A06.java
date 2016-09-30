import java.util.*;

class A06 {
	void input() {

		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = s.nextLine();
		
		System.out.print("국어점수 입력 : ");
		int kor = s.nextInt();
		
		System.out.print("수학점수 입력 : ");
		int math = s.nextInt();

		System.out.print("영어점수 입력 : ");
		int eng = s.nextInt();

		int total = cal(kor, math, eng);
		double avg = cal(total);

		print(avg);

	}

	int cal(int kor, int math, int eng) {

		int total = 0;
		total = kor + math + eng;
		return total;
	
	}

	double cal(int total){

		double avg = 0;
		avg = total / 3;
		return avg;

	}


	void print(double avg) {

		String num = "";
		if(avg >= 95 && avg <= 100) num = "A+";		
		else if(avg >= 90 && avg < 95) num = "A0";
		else if(avg >= 85 && avg < 90) num = "B+";
		else if(avg >= 80 && avg < 85) num = "B0";
		else if(avg >= 75 && avg < 80) num = "C+";
		else if(avg >= 70 && avg < 75) num = "C0";
		else
			num = "F";

		System.out.print("학점은 " + num + " 입니다.");

	}


	public static void main(String[] arg){

		new A06().input();

	}
	
}
