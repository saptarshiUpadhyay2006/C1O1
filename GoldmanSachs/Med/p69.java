//Check if the Sentence is Pangram(LC 1832)
//Using a hash Table

package GoldmanSachs.Med;

class p69{
    public boolean checkIfPangram(String sentence) {
        int arr[]=new int[26];
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
            return false;
        }
        return true;

    }
}