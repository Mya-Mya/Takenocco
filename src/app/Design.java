package app;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Design {
    static private Font loadedFont = null;
    static private Font normalFont=null;

    static private Font getLoadedFont(){
        if (loadedFont == null) {
            try {
                loadedFont = Font.createFont(Font.TRUETYPE_FONT,
                        new FileInputStream("mitimasu.ttf"));
            } catch (FontFormatException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return loadedFont;
    }

    static public Font getNormalFont() {
        if(normalFont==null){
            normalFont=getLoadedFont().deriveFont(20f);
        }
        return normalFont;
    }

    static public JLabel createLabel(){
        JLabel out=new JLabel();
        out.setFont(getNormalFont());
        return out;
    }
    static public JButton createButton(){
        JButton out=new JButton();
        out.setFont(getNormalFont());
        return out;
    }
}
