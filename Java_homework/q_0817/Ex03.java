package q_0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(",");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		// 0 ~ 9��° index�� �ִ� �迭�� �ʱ�ȭ�Ѵ�.
		int[] arr = new int[10];
		// A * B * C�� int������ �ٲپ� ����� �ϰ� �ٽ� string���� ��ȯ�Ѵ�.
		int intNumber = A * B * C;
		String strNumber = Integer.toString(intNumber);

		// ���ڹ��ڿ��� �տ������� �ϳ��� ���� ���ڿ� �ش��ϴ� index��ȣ�� +1 ���ش�.
		for (int i = 0; i < strNumber.length(); i++) {
			int index = strNumber.charAt(i) - '0';
			arr[index]++;
		}
		
		// ������ �迭�� ����Ѵ�.
		for (int i = 0; i < 10; i++) System.out.println(arr[i]);
	}

}
