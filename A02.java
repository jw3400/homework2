import java.util.*;

class A02 {
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하세요. ");
		double input_degree = s.nextdouble();
		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요. ");
		String kind = s.nextString();
		double output_degree = cal(input_degree); 	//섭씨온도로 계산
		double output_degree2 = cal2(input_degree);	//화씨온도로 계산
		print(kind);

	}

	
	double cal(double input_degree){		
		double output_degree = 0;
		output_degree = (input_degree - 32) / 1.8;
		return output_degree;
	}

	double cal2(double input_degree){
		double output_degree2 = 0;
		output_degree2 = input_degree * 1.8 + 32;
		return output_degree2;
	}

	void print(String kind, double output_degree, double output_degree2){
		if(kind == "C" || kind == "c")	//입력된 온도가 섭씨온도로 지정하면 화씨온도로 변환
			System.out.print("변환된 온도는 " + output_degree2 + " 입니다.");		
		else if(kind == "F" || kind == "f")  //입력된 온도가 화씨온도로 지정하면 섭씨온도로 변환
			System.out.print("변환된 온도는 " + output_degree + " 입니다.");	
		else
			System.out.print("섭씨온도 또는 화씨온도 기호가 아닙니다.");
	}

	public static void main(String[] args){

		new A02().input();

	}


}



