import java.util.*;

class A03 {
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("날 수를 입력하세요. : ");
		int days = s.nextInt();

		int seconds = cal(days);
		System.out.println("날 수에 해당되는 기간은 모두 " + seconds + "초입니다.");

		int m_count = cal2(seconds);
		
		print(seconds, m_count);

	}

	int cal(int days) {
		int seconds = 0;
		seconds = days * 24 * 60 * 60;
		return seconds;

	}

	int cal2(int seconds) {
		int m_count = 0;
		m_count = seconds / 1000000;
		return m_count;

	}

	void print(int seconds, int m_count) {
		if(seconds >= 1000000)
		{
			System.out.print("100만 초가 모두 " + m_count + "번이나 포함됩니다.");
		}

	}

	public static void main(String[] arg){

		new A03().input();

	}




























}
