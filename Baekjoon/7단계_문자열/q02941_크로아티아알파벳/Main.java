package q2941_ũ�ξ�Ƽ�ƾ��ĺ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] charArr = input.toCharArray();
		int count = 0;
		
		// �⺻������ ���ĺ��� ������ count +1�� ���ش�. �� �� ���� index�� ���ڸ� �������� �� ũ�ξ�Ƽ�� �����̸�,
		// count�� ������Ű�� ���̿� ���� �׸�ŭ�� index�� �����ְ� �����Ų��.
		int i = 0;
		while (i < charArr.length) {
			
			// ������ ���� �Ѱ��� ���������� ������ �⺻ ���ĺ��̹Ƿ� count +1�� �ϰ� �ݺ����� ������.
			if (i == charArr.length - 1) {
				count++;
				break;
			}
			
			if (charArr[i] == 'c' && (charArr[i + 1] == '=' || charArr[i + 1] == '-')) i++;
			else if (charArr[i] == 'd') {
				
				if (charArr[i + 1] == '-') i++;
				else if ( i + 2 < charArr.length && charArr[i + 1] == 'z' && charArr[i + 2] == '=') i += 2;
				
			} else if (charArr[i] == 'l' && charArr[i + 1] == 'j') i++;
			else if (charArr[i] == 'n' && charArr[i + 1] == 'j') i++;
			else if (charArr[i] == 's' && charArr[i + 1] == '=') i++;
			else if (charArr[i] == 'z' && charArr[i + 1] == '=') i++;
			
			count++;
			i++;
		}
		
		System.out.println(count);
	}

}
