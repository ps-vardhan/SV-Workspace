public class v9{
    public boolean palchecker(int n){
        int orginal=n,reversed=0;
        while(n>0){
            reversed=reversed*10+(n%10);
            n/=10;
        }
        return orginal==reversed;
    }
}