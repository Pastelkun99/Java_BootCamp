package sec_verify08;

import java.util.Arrays;

public class DeepCloneDriveExample {

	public static void main(String[] args) {

		Drive original = new Drive("C드라이브", 500, new String[] {"윈도우 폴더", "시스템 폴더"}, new Folder("야시꾸리한거", 15));
		Drive cloned = original.getDrive();
		
		System.out.println("[원본 드라이브의 필드 값]");
		System.out.println("이름 : " + original.name);
		System.out.println("크기 : " + original.size);
		System.out.println("폴더 목록 : " + Arrays.toString(original.driverList));
		System.out.println("새 폴더 명 : " + original.folder.name);
		System.out.println("크기 : " + original.folder.size);
		
		System.out.println();
		System.out.println("[복제된 드라이브의 필드 값]");
		System.out.println("이름 : " + cloned.name);
		System.out.println("크기 : " + cloned.size);
		System.out.println("폴더 목록 : " + Arrays.toString(cloned.driverList));
		System.out.println("새 폴더 명 : " + cloned.folder.name);
		System.out.println("크기 : " + cloned.folder.size);
	}

}
