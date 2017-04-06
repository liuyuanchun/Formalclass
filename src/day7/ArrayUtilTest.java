package day7;

public class ArrayUtilTest {
	public static void main(String[] args) {
		int[] array = new int[] {10,20,45,4};
		System.out.println(ArrayUtil.max(array));
		System.out.println(ArrayUtil.min(array));
		ArrayUtil.bubbleSort(array);
		System.out.println("排序后的数组是:");
		ArrayUtil.print(array);
	}
}
