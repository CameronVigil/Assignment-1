class Recursion {
    /**Count method recursively counts characters in given char array
     * @param chars
     * @param ch
     * @return Termination code as int
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
    
    /**
     * //helper method for the recursion
     * @param chars
     * @param ch
     * @param high
     * @return Termination code as int
     * @throws Nothing is implemented
     */
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
