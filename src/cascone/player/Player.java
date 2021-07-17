/*
* Author: r0paire
* Date: TBF
* Description: Simple music player coded in Java.
*/
package cascone.player;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Player extends Application {
    public void start (Stage stage) throws IOException {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("music-player.fxml"));
            Parent root = loader.load();
            Cascone cc = loader.<Cascone>getController();
            cc.setData(stage);

            Scene scene = new Scene(root);
            stage.setTitle("Cascone Music Player");
            //stage.getIcons().add(new Image(Player.class.getResourceAsStream("lock.png"))); // needs changed
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main (String[] args) {
        launch(args);
    }
}
