package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ConcatanatedSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        int right=0;
        int left=0;
        int word_size = words[0].length();
        //int window_size = 0;
        //"dddddddddddd";
        List<Integer> ls = new ArrayList<>();
//        HashMap<String,Integer> hm = new HashMap<>();
//        
//        for(String word : words){
//        	window_size+=word.length();
//            hm.put(word,hm.getOrDefault(word,0)+1);
//        }
        
        //HashMap<String,Integer> hm1 = copy_map(hm) ;
        //int count= hm.size();
        for(int j=0; j<word_size;j++){
        	
        	HashMap<String,Integer> hm = new HashMap<>();
        	int window_size = 0;
            for(String word : words){
            	window_size+=word.length();
                hm.put(word,hm.getOrDefault(word,0)+1);
            }

            System.out.println(window_size);
        	right=j;
        	left=j;
        	//hm=hm1;
        	System.out.println("here"+j);
        	
        	int count= hm.size();
        	
            while(right+word_size-1<s.length()){
            	
            	String str = s.substring(right,right+word_size);
            	//String s = "bcabbcaabbccacacbabccacaababcbb";
        		//String[] words = {"c","b","a","c","a","a","a","b","c"};
                if(hm.containsKey(str)){
                    hm.put(str,hm.get(str)-1);
                    System.out.println("str" +hm.get(str));
                    System.out.println(str);
                    if(hm.get(str)==0) {
                    	count--;
                    	System.out.println("count"+count);
                    }
                }
                System.out.println("windowsize "+(right+word_size-left));
                
                if(right+word_size-left==window_size) {
                	
                	
                	System.out.println("here inside 1st left"+count);
                	if(count==0) {
                		System.out.println("startindex"+left);
                		ls.add(left);
                	}
                	String str1 = s.substring(left,left+word_size);
                	if(hm.containsKey(str1)){
                        hm.put(str1,hm.get(str1)+1);
                        if(hm.get(str1)>0) {
                        	count++;
                        }
                    }
                	left+=word_size;
                }
                right+=word_size;
            }
        }
        return ls;
    }
    private HashMap<String, Integer> copy_map(HashMap<String, Integer> hm) {
		// TODO Auto-generated method stub
		return new HashMap<>(hm);
	}
	// Wrong 
//    public List<Integer> findSubstring(String s, String[] words) {
//        int right=0;
//        int left=0;
//        int l = words[0].length();
//        List<Integer> ls = new ArrayList<Integer>();
//        HashMap<String,Integer> hm = new HashMap<>();
//        for(int i=0;i<words.length;i++){
//            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
//        }
//        int count= hm.size();
//        while(right<s.length()-l){
//            String str = s.substring(right,right+l);
//            if(hm.containsKey(str)){
//                hm.put(str,hm.get(str)-1);
//                if(hm.get(str)==0) count--;
//            }
//            right+=1;
//            while(count==0){
//                String str1 = s.substring(left,left+l);
//                if(right-left==l*words.length) ls.add(left);
//                if(hm.containsKey(str1)){
//                    hm.put(str1,hm.get(str1)+1);
//                    if(hm.get(str1)==1) count++;
//                }
//                left+=1;
//            }
//        }
//        return ls;
//    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bcabbcaabbccacacbabccacaababcbb";
		String[] words = {"c","b","a","c","a","a","a","b","c"};
		ConcatanatedSubstring  CS= new ConcatanatedSubstring();
		System.out.println(CS.findSubstring(s, words));
	}

}
