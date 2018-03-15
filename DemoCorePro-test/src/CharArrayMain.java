import java.io.CharArrayReader;
import java.io.IOException;


public class CharArrayMain {

	public static void main(String[] args) throws IOException {
		String src = new String("this is javatutorial example");
		char [] charExmple =new  char[14];
		src.getChars(8, 22, charExmple, 0);
		System.out.println(charExmple);
		System.out.println("***************************");
		int offset = 2;
		int length = 6;
		char [] charArraySrc = src.toCharArray();
		//CharArrayReader objCharArray = new CharArrayReader(charArraySrc);
		CharArrayReader objCharArray = new CharArrayReader(charArraySrc,offset,length);
		int data = objCharArray.read();
		objCharArray.reset();
		while(data != -1){
			data = objCharArray.read();
		if(data != -1)	System.out.println((char)data);
		}
		objCharArray.close();

	}

}
