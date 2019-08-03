package sec04_throw;

public class ThrowExample03 {

	public static void main(String[] args) {
		
		String file1 = createFile("test.txt");
		String file2 = createFile("");
		
		System.out.println(file1 + "파일이 성공적으로 생성되었습니다.");
		System.out.println(file2 + "파일이 성공적으로 생성되었습니다.");
	}
	
	public static String createFile(String filename) {
		
		try {
			if(filename == null || filename.equals("")) {
				throw new Exception("파일이름이 유효하지 않습니다.");
			}
		}
		catch (Exception e) {
			//filename이 부적절한 경우, 파일이름을 제목없음.txt로 한다.
			filename = "제목없음.txt";
		}
		return filename;
	}
}
