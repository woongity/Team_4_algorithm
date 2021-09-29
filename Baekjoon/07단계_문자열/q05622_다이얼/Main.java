package q5622_���̾�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// ���� c�� ��� ���̾� �����ϴ� ���ĺ����� ���ϴ� �Լ��̴�.
	public static int getNumber(char c) {
		if (c <= 'C') return 2;
		else if (c <= 'F') return 3;
		else if (c <= 'I') return 4;
		else if (c <= 'L') return 5;
		else if (c <= 'O') return 6;
		else if (c <= 'S') return 7;
		else if (c <= 'V') return 8;
		else return 9;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] str = input.toCharArray();
		int total = 0;
		
		// �Է¹��� ���ĺ��� �ִ� ���̾󺸴� +1�ʾ� �� �ɸ��Ƿ� ������ ���̾� +1 �� ��� ���Ѵ�.
		for (int i = 0; i < input.length(); i++) {
			total += getNumber(str[i]) + 1;
		}
		
		System.out.println(total);
	}

}
