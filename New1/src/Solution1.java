/*
1.As user: input n1 , n2 => result sum of n1 & n2, eg: input 5 , 6 = 11 | 12 , 23 = 35
2.As System: system should add only single digit number
5
6
--
11

===
0
12
23
--
35
===
1
27
15
--------
43

*/
// some errors are there and trying to resolve them
import java.util.*;
public class Solution1{
public static void main(String[] args) {
System.out.println(addDigit(5,6));//11
System.out.println(addDigit(12,23));//135
System.out.println(addDigit(27,15));//43
}

public static int addDigit(int n1,int n2){
	try {
	if(n1>=0 && n1<10) {
		if(n2>=0 && n2<10) {
 int result = n1+n2;
 return result;

}}
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}









