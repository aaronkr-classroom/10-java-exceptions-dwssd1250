class MyException extends Exception{
	String str1;
	
	MyException(String str2){
		str1 = str2;
	}
	
	public String toString() {
		return("MyException 발생! " + str1);
	}
}
public class Ex1103 {

	public static void main(String[] args) {
		try {
			System.out.println("try 블록입니다.");
			throw new MyException("MyException 클래스 호출!");
		}
		catch(MyException e) {
			System.out.println("Catch 블록입니다.");
			System.out.println(e);
		}

	}

}
