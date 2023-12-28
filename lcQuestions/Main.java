package lcQuestions;

import java.util.ArrayList;
import java.util.List;

import lcQuestions.LinkedListCycle.ListNode;

//import lcQuestions.oddEvenList.ListNode;


public class Main {
	public static void main(String args[]) {
//		String s = "qw#d";
//		String t = "w#qd";
//		String[] ch ={"H","a","n","n","a","h"};
//		String palindrome = "A man, a plan, a canal: Panama";
//		BackspaceCompare BC = new BackspaceCompare();
//		reverseString344 RS = new reverseString344();
//		ValidPalindrome125 VP = new ValidPalindrome125();
//		System.out.println(BC.backspaceCompare(s,t));
//		String[] result =RS.reverseString(ch);
//		for( String i : result) {
//			System.out.println(i);
//		}
//		System.out.println(VP.validPalindrome(palindrome));
//		
//		//oddEvenList OEL = new oddEvenList();
//		LinkedListCycle OEL = new LinkedListCycle();
//		// Start with empty list
//		ListNode head = null;
//		
//	    // Using push() function to 
//	    // convert singly linked list
//	    // 17.22.13.14.15
//	    head = OEL.push(1, head);
//	    head = OEL.push(2, head);
//	    head = OEL.push(3, head);
//	    head = OEL.push(4, head);
//	    head = OEL.push(5, head);
//	    head = OEL.push(6, head);
//	    head = OEL.push(7, head);
//	    
//	    // k should be less than the numbers of nodes
//	    // to make a cyclic linked list at k position
//	    int k = 4;
//	    int count =7;
//
//	    
//		OEL.displayList(head);
//	    
//	    //OEL.displayList(OEL.OddEvenList(head));
//	    OEL.makeloop(head, k);
//	    OEL.cyclicprintList(head,count);
//	    System.out.println(OEL.hasCycle(head));
	    
//	    String moves ="RLUURDDDLU";
//	    Robot657 RO = new Robot657();
//	    System.out.println(RO.judgeCircle(moves));
	    
	    List<List<Integer>> rooms = new ArrayList<>();// since a list is an interface we cannot directly instantiate it we can 
	    //create an object of those class which have implemented this interface and instantiate them.
	    List<Integer> innerlist = new ArrayList<>();
	    List<Integer> innerlist1 = new ArrayList<>();
	    List<Integer> innerlist2 = new ArrayList<>();
	    List<Integer> innerlist3 = new ArrayList<>();//empty list
	    
	    innerlist.add(1);
	    innerlist1.add(2);
	    innerlist2.add(3);
	    
	    rooms.add(innerlist);
	    rooms.add(innerlist1);
	    rooms.add(innerlist2);
	    rooms.add(innerlist3);
	    
	    KeysAndRoom841 KR = new KeysAndRoom841();
	    
	    System.out.println(rooms);
	    System.out.println(KR.canVisitAllRooms(rooms));
	    
	    int[] straights = {1,2,3,6,2,3,4,7,8};
	    int group_size = 3;
	    HandOfStraights846 HS = new HandOfStraights846();
	    HS.isNStraightHand(straights,group_size);    
		
	}
}
