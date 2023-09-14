import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecodingStrings {

	public static void main(String[] args) 
	{
		
		String str="test123";
		byte[] encodeString=Base64.encodeBase64(str.getBytes()); //base64 returns byte value
		System.out.println("encoded string: "+new String(encodeString));
		
		byte[] decodeString=Base64.decodeBase64(encodeString);
		System.out.println("encoded string: "+new String(decodeString));

		
		
		
		
		
	}

}
