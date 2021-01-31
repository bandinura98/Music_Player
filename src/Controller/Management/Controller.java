package Controller.Management;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller{

    public MediaView mediaView;
    public Button openFile;
    public Button playButton;
    public Button pauseButton;
    public Button stopButton;
    public Slider slider;

    private void handleButtonAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a File ", "*.mp4", "*.mp3");

        fileChooser.getExtensionFilters().add(filter);
        File file = fileChooser.showOpenDialog(null);
  /*
        filePath = file.toURI().toString();

        if(filePath != null){
            if(mediaPlayer!=null)
            {
                mediaPlayer.stop();
            }
            Media media = new Media(filePath);
            mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);

            DoubleProperty width = mediaView.fitWidthProperty();
            DoubleProperty height = mediaView.fitHeightProperty();
            width.bind(Bindings.selectDouble(mediaView.sceneProperty(),"width"));
            height.bind(Bindings.selectDouble(mediaView.sceneProperty(),"height"));


            slider.setValue(mediaPlayer.getVolume() * 100);

            slider.valueProperty().addListener(new InvalidationListener() {
                @Override
                public void invalidated(Observable observable) {
                    mediaPlayer.setVolume(slider.getValue()/100);
                }
            });
            mediaPlayer.totalDurationProperty().addListener((obs, oldDuration, newDuration) -> seeSlider.setMax(newDuration.toSeconds()));
            seeSlider.valueChangingProperty().addListener((obs, wasChanging, isChanging) -> {
                if(!isChanging)   {
                    mediaPlayer.seek(Duration.seconds(seeSlider.getValue()));
                }
            });
            seeSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
                if (! seeSlider.isValueChanging()) {
                    double currentTime = mediaPlayer.getCurrentTime().toSeconds();
                    if (Math.abs(currentTime - newValue.doubleValue()) > MIN_CHANGE) {
                        mediaPlayer.seek(Duration.seconds(newValue.doubleValue()));
                    }
                }
            });
            mediaPlayer.currentTimeProperty().addListener((obs, oldTime, newTime) -> {
                if (! seeSlider.isValueChanging()) {
                    seeSlider.setValue(newTime.toSeconds());
                }
            });

            mediaPlayer.play();
        }
    }
    @FXML
    private void pauseVideo(ActionEvent event ){
        mediaPlayer.pause();
    }
    @FXML
    private void playVideo(ActionEvent event ){
        mediaPlayer.play();
        mediaPlayer.setRate(1);
    }
    @FXML
    private void stopVideo(ActionEvent event ){
        mediaPlayer.stop();
    }
    @FXML
    private void fastVideo(ActionEvent event ){
        mediaPlayer.setRate(1.5);
    }
    @FXML
    private void fasterVideo(ActionEvent event ){
        mediaPlayer.setRate(2);
    }
    @FXML
    private void slowVideo(ActionEvent event ){
        mediaPlayer.setRate(.75);
    }
    @FXML
    private void slowerVideo(ActionEvent event ){
        mediaPlayer.setRate(.5);
    }
    @FXML
    private void exitVideo(ActionEvent event ){
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
   */

    }
}
