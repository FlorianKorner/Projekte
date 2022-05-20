public class Strings{
    public boolean equals(String s, String t){
        if(s== null && t== null)return true;
        else if(s == null && t!= null)return false;
        else if(s!= null && t==null)return false;
        else{
            if(s.length()!= t.length())return false;
            for(int i=0; i<=t.length(); i++){
                if(s.charAt(i) != t.charAt(i))return false;
            }
            return true;
        }
    }
    public String subStringMe(String s,int beginIndex,int endIndex){
        String res="";
        if(s!=null || s.length()>beginIndex || s.length()>endIndex)
        {
            for(int counter = beginIndex;counter <= endIndex;counter++)
            {
                res +=s.charAt(counter);
            }
            return res;
        }
        return null;
    }
    public int indexOf(String s, String t){
        if(s!=null&&t==null)return -1;
        else if(s==null&&t==null)return -1;
        else if(s==null&&t!=null)return -1;
        for(int i=0;i<s.length();i++){
            if(subStringMe(s, i, i+(t.length()))==t)return i;
        }
        return -1;
    }
    public boolean contanis(String s, String t){
        if(s!=null&&t==null)return false;
        else if(s==null&&t==null)return false;
        else if(s==null&&t!=null)return false;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(b))return true;
            b++;
        }
        return false;
    }
}