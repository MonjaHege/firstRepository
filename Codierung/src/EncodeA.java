
public class EncodeA extends Encode{
	public String encode(String message) {
		String encodeMessage = message.toUpperCase(); 
		char[] c = encodeMessage.toCharArray();
		
		for(int i = 0; i < encodeMessage.length(); i++ )
		{
			if(65 > c[i] || c[i] > 90 )
			{
				c[i] = c[i];
			} else {
				c[i] = (char) (65 + (((c[i] - 65) + shift) % 26));
			}
		}
		encodeMessage = String.valueOf(c);
		return encodeMessage;
	}
}
