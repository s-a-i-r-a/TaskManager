package StartingPage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TaskManagerController {

    @FXML
    private Button launchButton;


    @FXML
    private Button exitButton;

    @FXML
    private void launchButtonClicked() {
        try {
            System.out.println("Its atleast working");
            // Load the next FXML file (mainpage.fxml)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI/mainpage.fxml"));
            Parent root = loader.load();

            // Create a new stage for the next window
            Stage stage = new Stage();
            stage.setTitle("Task Manager Tabs");
            stage.setScene(new Scene(root, 631, 462));

            // Show the new stage
            stage.show();

            // Close the current stage (homepage.fxml)
            Stage currentStage = (Stage) launchButton.getScene().getWindow();
            currentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exitButtonClicked() {
        // Close the current stage (homepage.fxml)
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
