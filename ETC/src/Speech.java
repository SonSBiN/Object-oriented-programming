public class Speech {
    int len;
    char[] speech;

    Speech(String[] arr) {
        len = speech.length;
        speech = new Speech[len];
        this.speech = arr;
    }

    char getFirstCharOfWord(int idx) {
        if (idx >= len){
            return null;
        } else {
            return speech[idx].[0];
        }
    }

    int getNumOfWords() {
        return speech.length;
    }
}
