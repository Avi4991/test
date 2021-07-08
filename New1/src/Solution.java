/*
1. only one method should be there
2. i can pass n number data
3. i required sum of all number

*/
//this is solution.java

class Solution{
public static void main(String[] args) {
System.out.println(add(39));//39
System.out.println(add(39,300));//339
System.out.println(add(39,300,300));//639
}

public static int add(int a){
  return a;
}
public static int add(int a,int b){
	  return (a+b);
	}public static int add(int a,int b,int c){
		  return (a+b+c);
	}
}