package Array;

import java.awt.List;
import java.util.ArrayList;

/*
* @author:soleil
* @version 2018年1月13日 下午1:59:39
* 解释：Given numRows, generate the first numRows of Pascal's triangle.
For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
public class _118PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
    	ArrayList<Integer>  list1 = new ArrayList<Integer>();
    	ArrayList<Integer>  list2 = new ArrayList<Integer>();
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	
    	list1.add(1);
    	list2.add(1);
    	list2.add(1);
    	
    	if(numRows == 0){
    		return result;
    	}else if(numRows == 1 ){
    		result .add(list1);
    		return result;
    	}
    	result.add(list1);
    	result .add(list2);
	
    	for(int i = 3;i <= numRows; i++){
    		ArrayList<Integer> temp = new ArrayList<Integer>(100);
    		temp.add(1);//第一位
    		for(int j=1;j<i-1;j++){
    			int append = 0;
    			append += result.get(i-2).get(j-1);
    			append += result.get(i-2).get(j);
    			temp.add(append);
    		}
    		temp.add(1);//最后一位
    		result.add(temp);
    	}
    	
    	return result;
    }
    
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
//        if (numRows <=0){
//            return triangle;
//        }
//        for (int i=0; i<numRows; i++){
//            List<Integer> row =  new ArrayList<Integer>();
//            for (int j=0; j<i+1; j++){
//                if (j==0 || j==i){
//                    row.add(1);
//                } else {
//                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
//                }
//            }
//            triangle.add(row);
//        }
//        return triangle;
//    }
    
	public static void main(String[] args){
		
		_118PascalTriangle test = new _118PascalTriangle();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = test.generate(5);
		
		for(int i=0;i<result.size();i++){
			for(int j=0;j<result.get(i).size();j++){
				System.out.print(result.get(i).get(j));
			}
			System.out.println();		
		}
		
 	}

}
