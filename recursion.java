//For each method, you will also be required to create docstring as follows:
/**Method Detailed Description
* @param String as args
* @return Termination code as int, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/ 


class Recursion {
    /**Method recursively counts number of occurences of char in string.
    * @param String as args
    * @return Termination code as int, 0 for normal, anything else is error condition
    * @throws Nothing is implemented
    */ 
    public static int count(char[] chars, char ch){                 
        int high = chars.length-1;
        // checks if no string
        if(chars.length == 0){
            return 0;
        }
        //checks last character
        //runs recursion methods again and moves down to next char, adds one to total
        if(chars[high] == ch){
            high--;
            return 1 + count(chars, ch, high);
        }
        //if char is not equal runs again without counting
        high--;
        return count(chars, ch, high);
    }
    //helper method
    public static int count(char[] chars, char ch, int high) {
        if (high > -1){
            if(chars[high] == ch){
                high--;
                return 1 + count(chars, ch, high);
            }
            high--;
            return count(chars, ch, high);
        }
        return 0; 
    }
}


