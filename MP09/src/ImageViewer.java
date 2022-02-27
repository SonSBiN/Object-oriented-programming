import java.util.Arrays;

public class ImageViewer {
    int count = 0;
    ImageViewerInterface[] ArrayList;
    ImageViewer(){
        ArrayList = new ImageViewerInterface[2];
    }
    void addPlugIn(ImageViewerInterface ivi){
        ArrayList[count] = ivi;
        count++;
    }
    void show(String fileName, String ext){
        for(int i = 0; i < count; i++){
            if(ArrayList[i].getExtension().equals(ext)){
                System.out.println("Using "+ext+" Module");
                ArrayList[i].show(fileName);
                return;
            }
        }
        System.out.println("Image viewer plugin for the extension, "+ext+", is not registered");
    }

}
