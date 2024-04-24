package LEETCODE;

import java.util.LinkedList;

public class Two_Sum {

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		int res = 0;
		int carry = 0;
		int s  =  l1.size();
        int s1  =  l2.size();
        System.out.println(l1);
        System.out.println(l2);
        if(s>=s1)
        {
             for(int i = 0; i < s; i++)
            {
            	 if(i < s1)
            	 {
            		 res = (int) l2.get(i) + (int) l1.get(i) + carry;
                	 l3.add(res % 10);
                	 carry = res / 10;
            	 }
            	 else
            	 {
            		 res = (int) l1.get(i) + carry;
                	 l3.add(res % 10);
                	 carry = res / 10;
            	 }
            }
             if(carry != 0)
             {
            	 l3.add(carry); 
             }
             System.out.println(l3);
        }
        else
        {
        	for(int i = 0; i < s1; i++)
            {
            	 if(i != s)
            	 {
            		 res = (int) l2.get(i) + (int) l1.get(i) + carry;
                	 l3.add(res % 10);
                	 carry = res / 10;
            	 }
            	 else
            	 {
            		 res = (int) l2.get(i) + carry;
                	 l3.add(res % 10);
                	 carry = res / 10;
            	 }
            }
        	 if(carry != 0)
             {
            	 l3.add(carry); 
             }
        	 System.out.println(l3);
        	 
        }
	}
}
