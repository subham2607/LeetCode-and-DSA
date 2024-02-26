package Playground;

import java.util.HashMap;

public class RomanToNumber {
	public int romanToNumber(String s) {
		HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            int cval = hm.get(s.charAt(i));
            if(i>0 && (cval > hm.get(s.charAt(i-1)))){
                sum =   sum + (cval - hm.get(s.charAt(i-1)));
                System.out.println(sum);
                i--;
            }else{
                sum +=  hm.get(s.charAt(i));
                //System.out.println(sum);
            }        
        }
        return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCMXCIV";
		RomanToNumber RN = new RomanToNumber();
		RN.romanToNumber(s);
	}
}