package desirable.number;

public class DesirableNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int N=3;
        findAllPossibleNumbers(N);
    }
    
    public static void findAllPossibleNumbers(int N){
        for(int i=1;i<=9;i++){
            String str=new String();
            str+=i;
            findNextDights(str,N-1);
        }
    }
    
    public static void findNextDights(String str, int N){
        if(N==0){
            System.out.println(str);
            return;
        }
        int index=str.length()-1;
        int begin=Character.getNumericValue(str.charAt(index));
        for(int i=begin+1;i<=9;i++){
            findNextDights(str+i,N-1);
        }
        
    }
    
}
