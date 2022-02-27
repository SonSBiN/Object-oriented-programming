import java.util.ArrayList;
import java.util.Map;

public class WordsMap {
    static final int WORD_BEGINNING = -1;
    static final int WORD_END = -2;
    Map<Character,Integer> charMap = new Map<>();
    WordsMap(){}
    void createWordsMapFromList(ArrayList<String> list,int idx){
        for(int i = 0; i < list.size(); i++){
            if (charMap.get(list.get(i)) == 0)
            charMap.put(list.get(i).charAt(0),1);
            else{
                charMap.put(list.get(i).charAt(0),charMap.get(list.get(i).charAt(0)+1));
            }
        }

    }
    void printMap(){

    }
}
