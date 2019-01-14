
public class EncodeDecode {

	public static void main (String[] args) {
		EncodeA e = new EncodeA();
		DecodeA d = new DecodeA(); 
		System.out.println(e.encode("Hallo ich bin Monjaz")); 
		System.out.println(d.decode(e.encode("Hallo ich bin Monjaz"))); 
	} 
}
