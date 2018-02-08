package Array;
/*
* @author:soleil
* @version 2018年2月6日 上午11:24:45
* 解释：We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).
Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
*/
public class _717_1bitAnd2bitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
    	int length = bits.length;
    	if(length == 1) return true;
    	if(bits[length-2] == 0)return true; 
    	
    	for(int i=0;i<length;i++){
    		if(i == length-1){
    			return true;
    		}
    		if(bits[i] == 1){
    			i++;
    		}
    	}
    	
        return false;
    }
    
    public static void main(String[] args){
    	_717_1bitAnd2bitCharacters test = new _717_1bitAnd2bitCharacters();
    	int[] bits = {1,0,0};
    	System.out.println(test.isOneBitCharacter(bits));
    }
}
