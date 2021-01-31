package adaptor_pattern;


import Controller.Management.FXMLDocumentController;
import Controller.Management.LoginProccess;
import chain.AbstractLogger;
import chain.ConsoleLogger;
import chain.ErrorLogger;
import chain.FileLogger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

import java.util.EventObject;

public class MP4Player implements AdvancedMediaPlayer {

	private static AbstractLogger getChainOfLoggers(){

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	@Override
	public void playMp3(String fileName) {
		//-- this function of this class of java does nothing... --//
		}

	@Override
	public void playMp4(String fileName) {
		AbstractLogger loggerChain = getChainOfLoggers();

		try {
			loggerChain.logMessage(AbstractLogger.INFO,"Mp4 Player is playing " + fileName + " song ");

			loggerChain.logMessage(AbstractLogger.ERROR,"erör");
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("/View/GUI/FXMLDocument.fxml"));//kilic_karsilama
			Stage stage = new Stage();
			Scene root = new Scene(fxmlLoader.load(), 1200, 700);
			stage.setTitle("Plakka");
			stage.setScene(root);
			stage.show();
/*
			EventObject e = new EventObject(new FXMLDocumentController());
			final Node source = (Node) e.getSource();
			final Stage seagreen =stage;// (Stage) source.getScene().getWindow();
			seagreen.close();*/
		}catch (Exception e){
			loggerChain.logMessage(AbstractLogger.ERROR, "ERROR:: During the runtime MP4 folder cannot be opened could it be break down. ERROR NO 107");
		}
		//TODO it will run mp4 BatuKhan will look at it // it has been fixed :D mal hilmi fx bilmiyoruz çğrenip yaptık  biliyorum diye gezinme ortalıkta gözümede görünme
	}
}