import java.util.StringTokenizer;

public class RUN {

	public static void main(String[] args) {
		// StringTokenizer
		// : String(문자열)을 어떤 특수 기호를 기준으로 Token 단위로 나눠서 처리할때 쓰임
		// split 메소드와 유사하나 split 메소드를 쓰면 String 배열로 처리

		String str = "유산슬, 유야호, 로운, 카놀라유, 하하";
		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreTokens()) { // 커서 다음에 토큰이 있는지 확인
			String nstr = st.nextToken(); // 문자열 하나씩 빼온다
			System.out.println(nstr);
		}
	}

}
