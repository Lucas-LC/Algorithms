package well.ordered.string;

public class WellOrderedString {
    
    
    public static long sum=0;

    public static void main(String[] args) {
        // TODO code application logic here
        findAllPossiblePasswords(6);
        System.out.println(sum);
    }
    
    public static void findAllPossiblePasswords(int N){
        for(char c='a';c<='z'-N+1;c++){
            String str=new String();
            str+=c;
            append(str,N-1);
        }
    }
    public static void append(String str, int N){
        if(N==0){
            System.out.println(str);
            sum++;
            return;
        }
        int index=str.length()-1;
        char l=str.charAt(index);
        for(char c=(char)(l+1);c<='z'-N+1;c++){
            append(str+c,N-1);
        }
    }
}
