public class SpeechHistogram {
    private int[] counts = new int[26];
    private int[] groupCounts = new int[6];
    private int num;
    char[] firstWord;

   public SpeechHistogram(Speech speech){
       num = speech.getNumOfWords();
       for(int i = 0; i < 26; i++){
           counts[i]=0;
       }
       for(int i = 0; i < 5; i++){
           groupCounts[i]=0;
       }
       firstWord = new char[num];
        for(int i = 0; i < num; i++){
            firstWord[i] = speech.getFirstCharOfWord(i);
        }
    }

    public void calculateHistogram(){
        for(int i = 0; i < num; i++) {
            counts[firstWord[i] - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            groupCounts[i/5] += counts[i];
        }
    }

    public void print(){
        int k = 0;
        int i = 0;
        for(char a = 'a'; a<= 'z'; a++,k++){
            System.out.printf("%c: (%d)\n",a,counts[k]);
        }
        for(char a = 'a'; a<= 'y'; a+=5,i++) {
            System.out.printf("'%c'-'%c': (%d)", a, a + 5,groupCounts[i]);
            for(int m = 0; m < groupCounts[i]; m++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
