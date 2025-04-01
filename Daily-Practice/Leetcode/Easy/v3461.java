public class v3461 {
    public boolean hasSameDigits(String s){
        while(s.length()>2){
            StringBuilder str=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int sum=(Character.getNumericValue(s.charAt(i)))+(Character.getNumericValue(s.charAt(i+1)))%10;
                str.append(sum);
            }
            s=str.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}
