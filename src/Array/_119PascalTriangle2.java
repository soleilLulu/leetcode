package Array;

import java.util.ArrayList;
import java.util.List;

/*
* @author:soleil
* @version 2018年1月13日 下午9:37:51
* 解释：Given an index k, return the kth row of the Pascal's triangle.
For example, given k = 3,
Return [1,3,3,1].
Note:
Could you optimize your algorithm to use only O(k) extra space? 
*/
public class _119PascalTriangle2 {
	
	//代码超时！
//    public List<Integer> getRow(int rowIndex) {
//    	List<Integer> result = new ArrayList<Integer>();
//    	
//    	if(rowIndex ==0){
//    		result.add(1);
//    		return result;
//    	}
//    	
//    	for(int i=0;i <= rowIndex;i++){
//    		if(i==0 || i == rowIndex){
//    			result.add(1);
//    		}else{
//    	    	List<Integer> tempList = getRow(rowIndex-1);
//    			int temp = tempList.get(i-1)+tempList.get(i);
//    			result.add(temp);
//    		}  		
//    		
//    	}
//    	
//        return result;
//    }
	
	public List<Integer> getRow(int rowIndex){
		List<Integer> list = new ArrayList<Integer>();
		
		if(rowIndex < 0 ){
			return list;
		}
		
		for(int i=0;i < rowIndex+1;i++){
			list.add(0,1);
			
			for(int j=1;j<list.size()-1;j++){
				list.set(j, list.get(j)+list.get(j+1));
			}
		}
		return list;
	}
    
//    public List<Integer> getRow(int rowIndex) {
//    	List<Integer> list = new ArrayList<Integer>();
//    	if (rowIndex < 0)
//    		return list;
//
//    	for (int i = 0; i < rowIndex + 1; i++) {
//    		list.add(0, 1);
//    		for (int j = 1; j < list.size() - 1; j++) {
//    			list.set(j, list.get(j) + list.get(j + 1));
//    		}
//    	}
//    	return list;
//    }
    
    public static void main(String[] args){
    	_119PascalTriangle2 test = new _119PascalTriangle2();
    	List<Integer> result = test.getRow(11);
    	
    	for(int i=0;i<result.size();i++){
    		System.out.print(result.get(i));
    	}
    }
    
}
