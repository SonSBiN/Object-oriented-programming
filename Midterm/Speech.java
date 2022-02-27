public class Speech {
    private String[] speech;

    public Speech(String[] arr){
        speech = arr;
    }

    public Character getFirstCharOfWord(int n){
        ConvertChar convert = new ConvertChar();
        if( speech[n].charAt(0) >= 'A' || speech[n].charAt(0) <= 'z'){
            return convert.toLowerCase(speech[n].charAt(0));
        }
            return speech[n].charAt(0);
    }

    public int getNumOfWords(){
        int count = 0;
        for(int i = 0; i<speech.length; i++){
            count ++;
        }
        return count;
    }
}
