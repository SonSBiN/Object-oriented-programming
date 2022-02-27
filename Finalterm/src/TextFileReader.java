import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class TextFileReader {
    ArrayList<String> words;
    String filename;
    String temp = new String("");
    int data;
    int count = 0;
    TextFileReader(String filename){
        this.filename = filename;
    }
    String getFileName(){
        return filename;
    }
    ArrayList<String> getWords(){

    }
    void readWords(){
        try {
            FileInputStream f = new FileInputStream(filename);
            while ((data = f.read()) != -1) {
                while ("".equals((char)data) || "\n".equals((char)data)) {
                    temp += (char)data;
                }
                words.add(temp);
                temp = "";
            }
            f.close();
        }
        catch (Exception f){
            System.out.println(filename+" 파일이 존재하지 않습니다.");
        }
    }
    void printWords(){
        System.out.println("Total number of words: "+words.size());
        for(int i = 0; i < words.size(); i++){
            System.out.printf('"%s", ',words.get(i));
        }
    }
}
