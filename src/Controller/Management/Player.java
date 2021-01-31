package Controller.Management;



import com.sun.glass.ui.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javafx.scene.control.*;
import javafx.stage.Stage;

import javafx.stage.FileChooser;

public abstract class Player extends Application {


    public Button md_prev_btn;
    public Button md_start_btn;
    public Slider md_duration_slider;
    public Slider md_volume_slider;
    public Button md_mute_btn;
    public Button md_file_btn;
    public Button md_view_btn;
    public Button md_settings_btn;
    public Button md_logout_btn;
    public Label md_username_label;
    public Label md_mediatitle_label;
    public MediaView md_main_mv;
    public Button md_next_btn;




    public void start(final Stage stage,String fileName) {
        FileChooser f=new FileChooser();
        String source=f.getInitialFileName();
        Media md=new Media(source);
        MediaPlayer mp=new MediaPlayer(md);
        md_main_mv.setMediaPlayer(mp);
    }
    public abstract void mediaplayer_previous_btn(MouseEvent mouseEvent,String fileName);
    public abstract void mediaplayer_start_btn(MouseEvent mouseEvent,String fileName);
    public abstract void mediaplayer_mute_btn(MouseEvent mouseEvent,String fileName);
    public abstract void mediaplayer_file_btn(MouseEvent mouseEvent,String fileName);
    public abstract void mediaplayer_view_btn(MouseEvent mouseEvent,String fileName);
    public abstract void mediaplayer_settings_btn(MouseEvent mouseEvent,String fileName);
    public abstract void mediaplayer_logout_btn(MouseEvent mouseEvent,String fileName);
    public abstract void mediaplayer_next_btn(MouseEvent mouseEvent,String fileName);
}