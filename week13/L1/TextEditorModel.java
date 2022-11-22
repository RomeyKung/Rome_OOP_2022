package L1;
import java.io.*;
public class TextEditorModel {
    private String text;
    public TextEditorModel(String text){
        this.text = text;
    }
    public void loadText(File f, TextEditorView view){
        try(FileInputStream fin = new FileInputStream(f)){
            int ch = fin.read();
            String Message = "";
            while(ch != -1){
               Message = Message+ (char)ch;
                ch = fin.read();
            }
            view.getTextArea().setText(Message);
        }
        catch(Exception e){
            System.out.println("Failed...");
        }
    }
    
    public void saveText(File f, String view){
        try(FileOutputStream fout = new FileOutputStream(f)){
            for(int i = 0 ;  i < view.length()  ; i ++){
                fout.write(view.charAt(i));
            }
        }
        catch(Exception e){
            System.out.println("Failed...");
        }
    }
}
