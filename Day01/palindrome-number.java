class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
                  
        }
		
		String strNum = Integer.toString(x);
        int strLength = strNum.length();
		int indexI = 0;
        int indexF = strLength -1;
		System.out.println(x + "->" +strLength);
		
		while (indexI < indexF) {
			if(strNum.charAt(indexI) != strNum.charAt(indexF)) {
				return false;
			}
			indexI = indexI + 1; 
            indexF = indexF - 1; 
		}
		
		return true;
		
    }
}