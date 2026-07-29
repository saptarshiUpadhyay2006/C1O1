//Find closest Palindrome(LC 564)
//use gen palindrome fn

package GoldmanSachs.Med;

class p139{
    public String nearestPalindromic(String numberStr) {
        long num=Long.parseLong(numberStr);
        if(num<=10) 
        return String.valueOf(num - 1);
        
        if(num==11) 
        return "9";
        int len=numberStr.length();
        long lh=Long.parseLong(numberStr.substring(0,(len+1)/2));
        long arr[]=new long[5];
        arr[0]=generatePalindromeFromLeft(lh-1,len%2==0);
        arr[1]=generatePalindromeFromLeft(lh,len%2 == 0);
        arr[2]=generatePalindromeFromLeft(lh+1,len%2==0);
        arr[3]=(long)Math.pow(10,len-1)-1;
        arr[4]=(long)Math.pow(10,len)+1;

        long np=0;
        long mini=Long.MAX_VALUE;

        for (long candidate:arr){
            if(candidate==num) 
            continue;
            long difference=Math.abs(candidate-num);
            if(difference<mini||(difference==mini && candidate < np)){
                mini=difference;
                np=candidate;
            }
        }
        return String.valueOf(np);
    }

    private long generatePalindromeFromLeft(long lh, boolean isEvenLength) {
        long palindrome=lh;
        if(!isEvenLength) 
        lh /= 10;
        while(lh>0){
            palindrome=palindrome*10+lh%10;
            lh/=10;
        }
        return palindrome;
    }
}