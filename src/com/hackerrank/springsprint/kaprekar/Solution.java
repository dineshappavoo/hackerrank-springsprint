package com.hackerrank.springsprint.kaprekar;

import java.util.Scanner;
/**
 * 
 */

/**
 * @author Dany
 *
 *
 *Input:
 *	
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Solution().getInput();
	}

	public void getInput()
	{
		Scanner scanner=new Scanner(System.in);
		int begin = 0, end =0;
		begin = scanner.nextInt();
		end = scanner.nextInt();
		boolean isKaprekarAvailable = false;
		for(int i=begin;i<=end;i++)
		{
			if(isAKaprekarNumber(i))
			{
				if(!isKaprekarAvailable)
					isKaprekarAvailable = true;
				System.out.print(i);
				System.out.print(" ");
			}			
		}
		return;
	}

	public boolean isAKaprekarNumber(int num)
	{
		long square =0;
		square = ((long)num * (long)num);
		String sSqureNum ="", sNum = "";

		sNum = String.valueOf(num);
		sSqureNum = String.valueOf(square);

		int d = sNum.length();
		int squareLen = sSqureNum.length();
		int rLen = squareLen - d;

		String r = sSqureNum.substring(rLen, sSqureNum.length());
		String l = sSqureNum.substring(0, rLen);

		int rNum = 0, lNum = 0, sumLR = 0;
		if (r.equals(""))
		{
			rNum = 0;
		} else {
			rNum = Integer.parseInt(r);
		}

		if (l.equals(""))
		{
			lNum = 0;
		} else {
			lNum = Integer.parseInt(l);
		}

		sumLR = lNum + rNum;

		if(num == sumLR)
			return true;	
		return false;
	}
}
