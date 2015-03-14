package com.hackerrank.springsprint.songofpi;

import java.util.Scanner;
/**
 * 
 */

/**
 * @author Dany
 *
 *
 *Input:
 *	"Now, I wish I could recollect pi.
	'Eureka,' cried the great inventor.
	Christmas Pudding, Christmas Pie
	Is the problem's very center."
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Solution().getInput();
	}

	public void getInput()
	{
		Scanner scanner=new Scanner(System.in);
		int noOfTestCases = 0;
		String song= "";
		while(scanner.hasNextInt())
		{
			noOfTestCases = scanner.nextInt();
			scanner.nextLine();
			for(int i=0;i<noOfTestCases;i++)
			{
				song = scanner.nextLine();
				if(isPiSong(song))
				{
					System.out.println("It's a pi song.");
				}else
				{
					System.out.println("It's not a pi song.");
				}
			}
			break;
		}
		return;
	}

	public boolean isPiSong(String song)
	{
		//System.out.println("Song : "+song);
		String piValueOfSong = getPiValueOfSong(song);
		if(isPiValueMatching(piValueOfSong))
		{
			return true;
		}
		return false;
	}

	public String getPiValueOfSong(String song)
	{
		int asciiA = 65, asciiZ = 90, aASCII = 97, zASCII = 122;
		char c;
		int charASCII=0, count=0;
		boolean isLastCharASCII = false;
		StringBuffer sBuffer = new StringBuffer();

		for(int i=0;i<song.length();i++)
		{
			c = song.charAt(i);
			charASCII = c;
			if((charASCII>=asciiA && charASCII<=asciiZ)  || (charASCII >=aASCII && charASCII <= zASCII))
			{
				if(isLastCharASCII)
				{
					count++;
					isLastCharASCII = true;
				}else
				{
					if(count>0)
						sBuffer.append(count);
					count =1;
					isLastCharASCII = true;

				}
			}else
			{
				if(isLastCharASCII)
				{
					if(count>0)
						sBuffer.append(count);
					count =0;
					isLastCharASCII = false;
				}
			}

		}
		if(count>0)
			sBuffer.append(count);
		return sBuffer.toString();
	}
	
	public boolean isPiValueMatching(String songPiValue)
	{
		String piValue = "31415926535897932384626433833";
		for(int i=0;i<songPiValue.length();i++)
		{
			if(songPiValue.charAt(i) != piValue.charAt(i))
				return false;
		}
		return true;
	}

}
