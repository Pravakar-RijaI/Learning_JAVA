package LearningJAVA;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		func(1,2,4);
		func("Ram","Shyam","Hari");
		//func();

	}
	public static void func(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	
	public static void func(String ...v) {
		System.out.println(Arrays.toString(v));
	}
}
