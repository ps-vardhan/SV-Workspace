public class v3498 {
    public int reverseDegree(String s){
        int total=0;

        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));

            if(ch>='a' && ch<='z'){
                int reversal=26-(ch-'a');
                total+=reversal*(i+1);
            }
        }
        return total;
    }
}
