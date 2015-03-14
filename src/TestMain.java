/**
 * 
 */

/**
 * @author Dany
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=65535;
		long square;
		square = ((long)num * (long)num);
		System.out.println("Num : "+num);
		System.out.println("Square :" +square);
		String sSqureNum ="", sNum = "";

		sNum = String.valueOf(num);
		sSqureNum = String.valueOf(square);
		int d = sNum.length();
		int squareLen = sSqureNum.length();
		int rLen = squareLen - d;
		String r = sSqureNum.substring(rLen, sSqureNum.length());
		String l = sSqureNum.substring(0, rLen);
		System.out.println(r);
		System.out.println(l);

		int rNum = 0, lNum = 0, sumLR = 0;
		rNum = Integer.parseInt(r);
		lNum = Integer.parseInt(l);
		System.out.println("RNum:"+rNum);
		System.out.println("LNum:"+lNum);

		sumLR = lNum + rNum;

		System.out.println("Sum LR "+sumLR);

		if(num == sumLR)
			System.out.println("Valid Kaprekar");
		else
			System.out.println("Not a Kaprekar");
		
		//System.out.println(Long.MAX_VALUE);
		//System.out.println(100000 * 100000);
	}

}
