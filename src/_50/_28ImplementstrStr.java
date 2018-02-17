package _50;
/*
* @author:soleil
* @version 2018年2月17日 下午9:01:02
* 解释： Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 
*/
public class _28ImplementstrStr {
	//自己写的方法
//	public int strStr(String haystack, String needle) {
//		int l1 = haystack.length(), l2 =  needle.length();
//		
//		if(haystack.equals(needle) || l2 == 0)return 0;
//		if(l1 ==0 || l2 > l1)return -1;
//		
//		for(int i=0;i<l1-l2+1;i++){
//			if(haystack.charAt(i) == needle.charAt(0)){
//				int j = 1;
//				boolean exist = true;
//				while(j < l2){
//					if(haystack.charAt(i+j) == needle.charAt(j))j++;
//					else{
//						exist = false;
//						break;
//					}
//				}				
//				if(exist)return i;			
//			}
//		}
//		
//		return -1;
//	}
	//比较beautiful的方法
	public int strStr(String haystack, String needle){
		int l1 = haystack.length(), l2 =  needle.length();
		if(l1 < l2)return -1;
		if(l2 == 0)return 0;
		
		for(int i=0;i<l1-l2+1;i++){
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }			
		}
		
		return -1;
	}
		
		
	
	public static void main(String[] args){
		 _28ImplementstrStr test = new  _28ImplementstrStr();
		 System.out.println(test.strStr("mississippi", "pi"));
	}
}
