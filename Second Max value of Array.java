public class SecondMax{
    public static int FindSecondMax(int[] array){
        if(array==null || array.length<2){
            throw new IllegalArgumentException("The array must have atleast 2 elements:");
        }
        int max=Integer.MIN_VALUE;
        int secondMax=Interger.MIN_VALUE;
        for(int num : array){
            if(num>max){
                secondMax=max;
                max=num;
            }
        else if(num>secondMax && num!=max){
            secondMax=num;
        }
    }
        return secondMax;
    }
    public static void main(String[] args){
        int[] array={22,33,5,11,56,33};
        System.out.println("The second max value is:"+secondMax(array));
        }
    }
    
    
    
    
    
    
    
    
    
