class Solution {
    public String processStr(String s) {
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                str.append(str.toString());
            }
            else if(s.charAt(i)=='%'){
                str.reverse();
            }
            else if(s.charAt(i)=='*'){
                if(str.length()>0) str.deleteCharAt(str.length() - 1); 
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
        // StringBuilder str = new StringBuilder(""); 
        
        // for (int i = 0; i < s.length(); i++) { 
        //     char ch = s.charAt(i);
            
        //     if (ch == '#') { 
        //         // Append the current accumulated sequence to itself
        //         str.append(str.toString()); 
        //     } 
        //     else if (ch == '%') { 
        //         // Reverse the sequence in place
        //         str.reverse(); 
        //     } 
        //     else if (ch == '*') { 
        //         // Delete the last character safely if the builder is not empty
        //         if (str.length() > 0) {
        //             str.deleteCharAt(str.length() - 1); 
        //         }
        //     } 
        //     else { 
        //         // Append standard characters
        //         str.append(ch); 
        //     } 
        // } 
        // return str.toString(); 
    } 
}

