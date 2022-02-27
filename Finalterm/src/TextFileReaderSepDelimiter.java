import java.io.FileInputStream;

public class TextFileReaderSepDelimiter extends TextFileReader{

    TextFileReaderSepDelimiter(String filename){
        super(filename);
    }
    void readWords(){
        try {
            FileInputStream f = new FileInputStream(filename);
            while ((data = f.read()) != -1) {
                while ("".equals((char)data) || "\n".equals((char)data) || ",".equals((char)data) || ".".equals((char)data)) {
                    temp += (char)data;
                }
                words.add(temp);
                temp = "";
                count++;
            }
            f.close();
        }
        catch (Exception f){
            System.out.println(filename+" 파일이 존재하지 않습니다.");
        }
    }
}
