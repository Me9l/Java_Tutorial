package chapter11.ex06;

class E{
	int a;
}
class F extends E{
	int a;
}
class G extends E{
	int a;
}

public class EX02 {
	public static void main(String[] args) {
		E ee = new F();		
		String[] arr = new String[] {"안녕","오늘","날씨","맑음"};
		String str = null;
		
		// 1. 각각처리
		try {
			G g = (G)ee;	// 예외 발생
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			arr[4] = "";	// 예외 발생			
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(str.charAt(0));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// 2. 여러 catch 로 처리. 
		try {
			G g = (G)ee;	// 예외 발생			
			arr[4] = "";	// 예외 발생			
		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		// 3. 한번에 처리
		try {
			G g = (G)ee;	// 예외 발생			
			arr[4] = "";	// 예외 발생			
		} catch (ClassCastException | IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		// 4. 복합처리
		try {
			G g = (G)ee;	// 예외 발생			
			arr[4] = "";	// 예외 발생			
		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
