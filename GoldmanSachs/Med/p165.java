//Minm no. of moves to make palindrome(LC 2193)
//use swap fn in the while loop with the pointer approach

package GoldmanSachs.Med;

class p165{
    public int minMovesToMakePalindrome(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length,sm=0;
        int i=0,j=n-1;
        while(i<j)
        {
            int k=j;
            while(k>i && arr[k]!=arr[i])
            k--;

            if(k==i)
            {
                swap(arr,i,i+1);
                sm++;
            }
            else
            {
                while(k<j)
                {
                    swap(arr,k,k+1);
                    sm++;
                    k++;
                }
                i++;
                j--;
            }
        }
        return sm;
    }

    private void swap(char arr[],int i,int j)
    {
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}