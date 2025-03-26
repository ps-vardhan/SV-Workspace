public class v242 {
    public static void main(String []args){
        String str1="racecar";
        String str2="racecar";
        v242 gram=new v242();
        if(gram.anagram(str1,str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    /*
    public boolean anagram(String str1,String str2){
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    */

    /*
    public boolean anagram(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1); 
        }
        return map1.equals(map2);
    }
    */

    public boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        int arr[]=new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']++;
            arr[str2.charAt(i)-'a']--;
        }
        for(int num:arr){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
    
}