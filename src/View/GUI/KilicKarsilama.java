package View.GUI;

import adaptor_pattern.AudioPlayer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javafx.stage.FileChooser;

import static javafx.application.Application.launch;

public class KilicKarsilama implements EventHandler<ActionEvent> {

    //InputEvent dd;
    private String filePath;// FIXME: 31.01.2021
    public void chooseFileBtn(InputEvent e) throws IOException{

        //dd = e;

        //Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a File ","*.mp4","*.mp3");
        fileChooser.setTitle("select mp3 or mp4 file for our magnificent program");

        fileChooser.getExtensionFilters().add(filter);
        File file = fileChooser.showOpenDialog(null);
        filePath = file.toURI().toString();

        if(filePath != null) {
            //ArrayList<>() chlist = new ArrayList<Char>();

            StringBuilder sb = new StringBuilder();

            char[] chs = filePath.toCharArray();

            sb.append(chs[chs.length - 3]);
            sb.append(chs[chs.length - 2]);
            sb.append(chs[chs.length - 1]);

            String uzanti = sb.toString();

            char[] chs2 = new char[chs.length - 6];

            for (int i = 6; i < chs.length; i++) {
                chs2[i - 6] = chs[i];
            }

            StringBuilder sb2 = new StringBuilder();
            sb2.append(chs2);

            System.out.println(sb2.toString());

            AudioPlayer audioPlayer = new AudioPlayer();
            audioPlayer.play(uzanti, sb2.toString());

            //String[] tarr = uzanti.split("file:/");
            //primaryStage.close();


            System.out.println(uzanti);
            //Platform.exit();

        }
        /*public InputEvent getevent(){
            return dd;
        }*/
/*
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/View/GUI/FXMLDocument.fxml"));//kilic_karsilama
        //Stage stage = new Stage();
        Scene root = new Scene(fxmlLoader.load(), 1200, 700);
        stage.setTitle("Plakka");
        stage.setScene(root);
        stage.show();
        final Node source = (Node) e.getSource();
        final Stage seagreen = (Stage) source.getScene().getWindow();
        */


    }
    @Override
    public void handle(ActionEvent arg0) {
        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
