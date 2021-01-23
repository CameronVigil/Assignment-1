class Recursion {
    public static int count(char[] chars, char ch){
        int high = chars.length-1;
        
        if(chars.length == 0){                                      // checks if no string
            return 0;
        }

        if(chars[high] == ch){                                      //checks first character
            high--;
            return 1 + count(chars, ch, high);                      //runs recursion methods again and removes first char
        }

        high--;
        return count(chars, ch, high);                              //if first char is not equal runs again without counting
    }

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


