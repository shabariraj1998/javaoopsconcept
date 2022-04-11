package OOPsConcepts;

class calcoverload{
	void add(int i, int j) {
		int sum = i+j;
		System.out.println("normal addition: "+ sum);
	}
	void add(float f, float f1) {
		float sum = f+f1;
		System.out.println("float addition is:"+sum);
	}
	void add(double d, double d1) {
		double sum = d+d1;
		System.out.println("double addition is :"+sum);
	}
	void add(short s, short s1) {
		short sum = (short)(s+s1);
		System.out.println("short addition is:"+sum);
	}
	void add(byte i, byte j) {
		byte sum = (byte)(i+j);
		System.out.println("byte addition is:"+sum);
	}
}

public class Calculateoverloading {

	public static void main(String[] args) {
		calcoverload ad = new calcoverload();
		ad.add(2, 4);
		ad.add(3.2f, 2.4f);
		ad.add(32.6, 234);
		ad.add((short)1, (short)2);
		ad.add((byte)8,(byte)7);
	}

}
