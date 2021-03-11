package Test;

public class utilities {

	public static String toCamelCase(String s){
	    
		// to count spaces 
        int cnt= 0; 
        int n = s.length(); 
        char ch[] = s.toCharArray(); 
        int res_ind = 0; 
  
        for (int i = 0; i < n; i++)  
        { 
  
            // check for spaces in the sentence 
            if (ch[i] == ' ') 
            { 
                cnt++; 
                // conversion into upper case 
                ch[i + 1] = Character.toUpperCase(ch[i + 1]); 
                continue; 
            } 
  
            // If not space, copy character  
            else
                ch[res_ind++] = ch[i];  
        } 
  
        // new string will be resuced by the  
        // size of spaces in the original string 
        return String.valueOf(ch, 0, n - cnt); 
	  }
}
