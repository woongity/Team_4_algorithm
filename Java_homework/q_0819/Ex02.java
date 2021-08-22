package q_0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] step = input.toCharArray();
		// ���� Į�θ�
		int totalKcal = 0;
		// ���� ��� Į�θ�
		int currKcal = 0;
		// ��絵
		int add = 1;
		// ������ �ö󰡰� �־����� �������� �־����� ���� ����
		int direction = 1;
		
		for (int i = 0; i < step.length; i++) {
			
			// 1. ��絵 
			// �⺻ ��絵 1�� �� #�� ������ ��絵�� 2�� �ٲٰ� ���� index�� �����Ѵ�.
			if (step[i] == '#' && add == 1) {
				add *= 2;
				continue;
			// �⺻ ��絵 2�� �� #�� ������ ��絵�� 1�� �ǵ����� ���� index�� �����Ѵ�.
			} else if (step[i] == '#' && add == 2) {
				add /= 2;
				continue;
			}
			
			// 2. ���� Į�θ� ���
			// ���� ��簡 ( �� �� ������ �������� ���̾��ٸ�, �Ҹ� Į�θ� ����
			// �ö󰡴� ���̾��ٸ�, �Ҹ� Į�θ��� +1�Ѵ�.
			if (step[i] == '(') {
				if (direction == 1) currKcal++;
				totalKcal += currKcal * add;
				direction = 1;
			// ���� ��簡 ) �� �� ������ �ö󰡴� ���̾��ٸ�, �Ҹ� Į�θ� ����
			// �������� ���̾��ٸ�, �Ҹ� Į�θ��� -1�Ѵ�.
			} else if (step[i] == ')') {
				if (direction == -1) currKcal--;
				direction = -1;
				totalKcal += currKcal * add;
			} 
			
		}
		
		System.out.println(totalKcal);
	}
	
}
