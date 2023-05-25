package chapter11.ex07;

//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchWithResource01 {
	public static void main(String[] args) {
		/*
		 * 객체 사용 후 RAM 에서 객체 제거. -finally {} 에서 사용한 객체 close(); - 일반 예외 ( Checked
		 * Exception ) -- throws -- try catch
		 */
		System.out.print("문자 입력 : ");

		// 1. 수동 리소스 해제 ( finally {} 에서 해제 )

		InputStreamReader isr = null;

		isr = new InputStreamReader(System.in); // console에서 한 글자 읽어옴.
		try {
			char inp = (char) isr.read();
			System.out.println(inp);
		} catch (IOException e) {
			System.out.println("IOException 발생.");
			e.printStackTrace();
		} finally {

			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			try {
//				System.out.println(br.readLine());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
	}
}
