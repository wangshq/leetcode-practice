package wangshq.a2017_5;

import java.util.ArrayList;

public class HuiwenString {
    public static ArrayList<ArrayList<String>> partition(String s) {
    	ArrayList<ArrayList<String>> result= new ArrayList<ArrayList<String>>();
    	char[] ss = s.toCharArray();
        for (int length = 1; length < ss.length+1; length++) {
        	ArrayList<String> arrayList = new ArrayList<String>();
			for (int i = 0; i < ss.length-length+1; i++) {
				int ssindex = (length>>1)+i;
				boolean tag = true;
				for (int j = i; j < ssindex; j++) {
					if(ss[j] != ss[2*i+length-j-1]){
						tag = false;
						break;
					}
				}
				if(tag){
					arrayList.add(String.valueOf(ss, i, length));
				}
			}
			if(arrayList.size() != 0 ){
				result.add(arrayList);
			}
		}
        return result;
    }
    
    public static void main(String[] args) {
    	System.out.println(partition("aabaabbassda"));
	}
}
