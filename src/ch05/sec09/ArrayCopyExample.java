package ch05.sec09;

/*
 	배열 복사를 위한 좀 더 간단한 방법이 있다
 	System의 arrycopy() 메소드를 이용하면 한 줄만으로도 배열 복사를 할 수 있다
 	
 	- 메소드 : System.arrycopy(Object src, int srcPos, Object dest, int destPos, int length);
 	- 설명 : 						원본 배열		원본 배열		새 배열		 새 배열		복사 항목 수
 											복사 인덱스				 붙여넣기 시작 인덱스
 */
public class ArrayCopyExample {
	public static void main(String[] args) {
		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		// 길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		// 배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); // → java, array, copy 출력 4,5 인덱스는 null 출력
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0); → 5개 항목 모두 null로 출력
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, 1); → java 출력 그 외 null
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, 2); → java, array 출력 그 외 null
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, 3); → java, array, copy 출력 4,5 인덱스는 null

		// 배열 항목 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i]);
			if (i < newStrArray.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
