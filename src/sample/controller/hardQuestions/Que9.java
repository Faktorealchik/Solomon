package controller.hardQuestions;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Que9 implements Initializable{
    public ImageView image;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image img = new Image("/controller/hardQuestions/pic2.png");
        image.setImage(img);
    }
}
