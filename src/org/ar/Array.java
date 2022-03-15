package org.ar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Array {
	
//Sample
	
//a[0] = 10;
//a[1] = 20;
//a[2] = 30;
//a[3] = 40;
//a[4] = 10;
//a[5] = 90;
//		
//System.out.println(a[5]);		
//
//int len = a.length;
//System.out.println(len);
//	

	//for (int i =0; i<a.length; i++) {
		
		//System.out.println(a[i]);
	//}

//for (int i : a) {
	//System.out.println(i);
	
//}

//Question : 1
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//int a[] = {1 ,2, 3, 4, 5,6,7,8,9,10} ;
//
//int sum =0;
//
//for (int i = 0; i < a.length; i++) {
// sum=sum +a[i];
// 		 
//}
//System.out.println(""+sum);

//Question 2:

	// TODO Auto-generated method stub
//int a[] = {1 ,2, 3, 4, 5,6,7,8,9,10} ;
//
//float sum =0F;
//
//for (int i = 0; i <= a.length; i++) {
//	sum+=i;
//	
//}
////for (int i : a) {
//	//sum += i;
//	
////}
//
//float avg = (sum/a.length);
//	
//System.out.println(""+avg);
//}


//Question 3: find the duplicate values
	
//	public static void main(String[] args) {
//	int a[] = {10,10,20,50,60,80,60,50};
//	
//	int len = a.length;
//	for (int i = 0; i < a.length; i++) {
//		
//		for (int j = i+1; j < a.length; j++) {
//		if (a[i]==a[j]) {
//			System.out.println("duplicate element is" +a[j]);
//		}
//		}
//	}
	
//	// Question 3 (I): Remove the duplicate values
//	   public static void main(String[] args) {
//		
//		   int a[] = {10,10,20,50,60,80,60,50};
//		 int len= 0;
//		 
//		 
//		   
//		  for (int i = 0; i < a.length-1; i++) {
//			 
//			
//				  if(a[i]!=a[i+1]){
//					  
//					  a[j]= a[i];
//					  j++;
//			}
			
	//Question 4.1 
	
//	public static void main(String[] args) {
//	ArrayList<Integer>
//	 a = new ArrayList<Integer>();
//	a.add(10);
//	a.add(20);
//	a.add(30);
//	a.add(90);
//	a.add(10);
//	a.add(10);
//	a.add(40);
//	a.add(50);
//	
//	
//	a.set(4, 80);
//	
//	System.out.println(a);
//	int size = a.size();
//	System.out.println(size);
//	
//	
//	}   

//Question4.2 Linked list
	
//	public static void main(String[] args) {
//		
//	
//List<Integer>li = new LinkedList<>();
//
//li.add(100);
//li.add(200);
//li.add(300);
//li.add(400);
//li.add(500);
//li.add(600);
//li.add(700);
//
//int size = li.size();
//
//System.out.println(size);
//
//
//	}

//Question 4.3
	
//	public static void main(String[] args) {
//		
//	Vector<Integer> a = new Vector<>();
//	a.add(105);
//	a.add(205);
//	a.add(305);
//	a.add(405);
//	a.add(505);
//	a.add(605);
//	a.add(705);
//	a.add(805);
//	
//	Integer element= a.remove(4);
//	a.add(4, 507);
//	//a.clear();
//	
//	
//	System.out.println(a);
//	
//	}
	
	//Question No 4.5
//	public static void main(String[] args) {
//		LinkedList<Integer> li = new LinkedList<>();
//		
//		li.add(100);
//		li.add(200);
//		li.add(300);
//		li.add(400);
//		li.add(500);
//		li.add(600);
//		li.add(700);
//		
//	int size = li.size();
//	System.out.println(size);
//	}
	
	//Question No 5.1
	
//	public static void main(String[] args) {
//	
//		LinkedList <Integer> li = new LinkedList<>();
//		
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(90);
//		
//int ind = li.indexOf(10);
//		
//		
//		System.out.println(ind);
//		
//	}
	
// Question No:5.2 find the particualr last index value
	
	
//	public static void main(String[] args) {
//		
//		LinkedList <Integer> li = new LinkedList<> ();
//		
//		
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(10);
//		li.add(40);
//		li.add(50);
//	
//	int las = li.lastIndexOf(10);
//	System.out.println(las);
//		
	//}
	
//Question No: 5.3	Get the index value of 50 
	
//	public static void main(String[] args) {
//		
//		
//		LinkedList <Integer> li = new LinkedList<>  ();
//		
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(10);
//		li.add(40);
//		li.add(50);
//		
//	int ind = li.indexOf(50);
//	System.out.println(ind);
//		
//		
//	}

	//QUESTION 5.4: Description : Get the index value of 90 
		
//	public static void main(String[] args) {
//	LinkedList <Integer> li = new LinkedList<> ();
//	
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(10);
//		li.add(40);
//		li.add(50);
//		
//int ind = li.indexOf(90);
//System.out.println(ind);
//		
//	}	
//	

	//QUESTION 5.5: Description : Get the each index value of 10 present in below list 	
		
//public static void main(String[] args) {
	
//	LinkedList <Integer> li = new LinkedList<>();
//	li.add(10);
//	li.add(20);
//	li.add(30);
//	li.add(90);
//	li.add(10);
//    li.add(10);
//	li.add(40);
//	li.add(50);
//
//int ind = li.indexOf(10);
//System.out.println(ind);
//
//int las = li.lastIndexOf(10);
//System.out.println(las);
//
//boolean con = li.contains(70);
//System.out.println(con);
//}

////Question No 6.1 Get the value present at 2nd index
//
//
//public static void main(String[] args) {
//	
//
//LinkedList <Integer> li = new LinkedList<> ();
//
//li.add(10);
//li.add(20);
//li.add(30);
//li.add(40);
//li.add(50);
//
//Integer get = li.get(2);
//System.out.println(get);
//
//}

	// Qus 6.2 Get the value present at 4th index

//	public static void main(String[] args) {
//		
//	
//	LinkedList <Integer> li = new LinkedList<> ();
//	li.add(100);
//	li.add(200);
//	li.add(300);
//	li.add(400);
//	li.add(500);
//	li.add(600);
//	li.add(700);
//	li.add(800);
//	
//	Integer get = li.get(4);
//	
//	System.out.println(get);
//	}
	
	
//Question No; 6.4 	Get the each value of list by using normal for loop
	
//	public static void main(String[] args) {
//		LinkedList <Integer> li = new LinkedList<> ();
//		li.add(101);
//		li.add(202);
//		li.add(300);
//		li.add(400);
//		li.add(500);
//		li.add(600);
//		li.add(700);
//		li.add(800);
//
//		for (int i = 0; i < li.size(); i++) {
//			
//			System.out.println(li.get(i));
//		}
	
	// Ques: 6.5 Get the each value of list by using enhanced for loop
	
//	public static void main(String[] args) {
//		
//		LinkedList <Integer> li = new LinkedList<> ();
//		
//		li.add(101);
//		li.add(202);
//		li.add(300);
//		li.add(400);
//		li.add(500);
//		li.add(600);
//		li.add(700);
//		li.add(800);
//		
//		for (Integer integer : li) {
//			System.out.println(integer);
//		}
//		
//	}
	
	//Ques: 7.1 Remove the value present at 2nd index
	
//	public static void main(String[] args) {
//		LinkedList <Float> li = new LinkedList<> ();
//		
//		li.add(10.98F);
//		li.add(11.98F);
//		li.add(12.44F);
//		li.add(90.56F);
//		
//li.remove(2);
//System.out.println(li);
//		}
	
	
	//Ques: 7.2  Remove the value present at 10th index
	
//	public static void main(String[] args) {
//		
//		LinkedList <Double> li = new LinkedList<> ();
//	li.add(1000.20);
//	li.add(1001.30);
//	li.add(1002.40);
//	li.add(1003.50);
//	li.add(1004.60);
//	li.add(1005.70);
//	li.add(1006.80);
//	li.add(1007.90);
//	li.add(1008.91);
//	li.add(1009.92);
//	li.add(1010.93);
//	
//	li.remove(10);
//	System.out.println(li);
//	
//		
//	}
	
	// Ques:7.3 Remove the last value of 1000000 & 23455 present in the list  
	
//	public static void main(String[] args) {
//		
//		List <Long> li = new LinkedList<> ();
//		li.add(23455L);
//		li.add(3455879L);
//		li.add(1000000L);
//		li.add(1120000L);
//		li.add(1000000L);
//		li.add(23455L);
//		
//li.remove(5);
//
//	System.out.println(li);
//	}
	
//Ques: 8.1 Add a value 50 in the 2nd index and display the list after adding.	
	
//public static void main(String[] args) {
//
//	List <Integer> li = new LinkedList<>();
//	
//	li.add(10);
//	li.add(20);
//	li.add(30);
//	li.add(90);
//	li.add(10);
//	li.add(10);
//	li.add(40);
//	li.add(50);
//	
//	li.add(2,50);
//	
//	System.out.println(li);
//	
//}	
//	
	
//Ques: 8.2 	Add a value 70 at the end of the list
	
//	public static void main(String[] args) {
//		
//	
//	List <Integer> li = new LinkedList <> ();
//	
//	li.add(10);
//	li.add(20);
//	li.add(30);
//	li.add(90);
//	li.add(10);
//	li.add(10);
//	li.add(40);
//	li.add(50);
//	li.add(70);
//	System.out.println(li);
//	}
	
//Qus 8.3 	 Add a value 80 at the 8th index of list
	
//	public static void main(String[] args) {
//	
//		List<Integer> li = new LinkedList<> ();
//		
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(10);
//		li.add(40);
//		li.add(50);
//		li.add(80);
//	System.out.println(li);	
//	}
	
	
	//Ques: 8.4 Add a value 100 at the last index of 10 in the list
	
//	public static void main(String[] args) {
//	List<Integer> li = new LinkedList<> ();
//	li.add(10);
//	li.add(20);
//	li.add(30);
//	li.add(90);
//	li.add(10);
//	li.add(10);
//	li.add(40);
//	li.add(50);
	
//	li.set(5,100);
//System.out.println(li);
//	}

	// Ques: 9.1Replace the value 300 into 350 in the list
	
//	public static void main(String[] args) {
//		List<Integer> li = new LinkedList<> ();
//		li.add(100);
//		li.add(200);
//		li.add(300);
//		li.add(400);
//		li.add(500);
//		li.add(600);
//		li.add(700);
//		
//		li.set(2,350);
//		
//	System.out.println(li);
	
	
//Ques:n9.2 Replace the value present in 7th index as 90 
	
//	public static void main(String[] args) {
//		List<Integer> li = new LinkedList<> ();
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(100);
//		li.add(40);
//		li.add(50);
//		
//		li.set(7,90);
//	System.out.println(li);
//	
//		}

//Ques: 9.3 Replace the 10 into 100 in List	
	
//	public static void main(String[] args) {
//		
//		List<Integer> li = new LinkedList<> ();
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(10);
//		li.add(40);
//		li.add(50);
//		
//		li.set(0,100);
//		li.set(4, 100);
//		li.set(5, 100);
//	System.out.println(li);
//	
//		}	
	
	
//Ques: 10.1 	Create a new ArrayListlists with values and return the common values
	
	
//public static void main(String[] args) {
//	
//	int a[] = new int[8];
//	
//	a[0] = 10;
//	a[1] = 20;
//	a[2] = 30;
//	a[3] = 90;
//	a[4] = 10;
//	a[5] = 10;
//	a[6] = 40;
//	a[7] = 50;
//	
//	int a1[] = new int[5];
//	
//	a1[0] = 10;
//	a1[1] = 20;
//	a1[2] = 30;
//	a1[3] = 90;
//	a1[4] = 10;
//	
//	a.retainall(a1);
	
	
//}
	


}	

	
	


	
	
	
	
	

	

