// // The project is solved in the Intellij

// import javafx.animation.AnimationTimer;
// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.layout.*;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Circle;
// import javafx.scene.text.Font;
// import javafx.stage.Stage;
// import java.util.ArrayList;
// import java.util.Random;
// import java.util.Collections;

// public class Project extends Application {
//     // Define some constants for the number of circles, speed range, and value range.
//     private static final int NUM_CIRCLES = 20;
//     private static final int MAX_SPEED = 6;
//     private static final int MIN_SPEED = 1;
//     private static final int MAX_VALUE = 10;
//     private static final int MIN_VALUE = 1;

//     // Create a pane to hold the circles and a label to show the score.
//     private final Pane myPane = new Pane();
//     private final Label scoreLabel = new Label("Score: 0");

//     // Initialize the score and the number of circles left.
//     private int score = 0;
//     private int circlesLeft = NUM_CIRCLES;

//     // Create a list to store the top five scores.
//     private ArrayList<Integer> topScores = new ArrayList<>(Collections.nCopies(5, 0));

//     // Create a random object to generate random numbers.
//     private final Random random = new Random();

//     @Override
//     public void start(Stage primaryStage) {

//         // Set the layout and style of the score label and add it to the pane.
//         scoreLabel.setTranslateX(15);
//         scoreLabel.setTranslateY(15);
//         scoreLabel.setBorder(Border.stroke(Color.DARKGRAY));
//         scoreLabel.setFont(Font.font("Times New Roman", 25));
//         myPane.getChildren().add(scoreLabel);

//         // Create an animation timer to add circles randomly.
//         AnimationTimer timer = new AnimationTimer() {
//             @Override
//             public void handle(long now) {
//                 // Check if there are circles left and generate a random number.
//                 if (circlesLeft > 0 && Math.random() < 0.02) {
//                     // Add a circle to the pane.
//                     addCircle();
//                     // Decrease the number of circles left.
//                     circlesLeft--;
//                 }
//             }
//         };
//         // Start the animation timer.
//         timer.start();

//         // Create a scene with the pane and set it to the stage.
//         Scene scene = new Scene(myPane, 650, 600);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     // Define a method to add a circle to the pane
//     private void addCircle() {
//         // Create a circle with a color, random position, and random value
//         Circle circle = new Circle(30);
//         circle.setFill(Color.GOLD);
//         circle.setStroke(Color.BLACK);
//         circle.setCenterX(random.nextInt(580) + 10);
//         circle.setCenterY(20);

//         int value = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
//         Label valueLabel = new Label(String.valueOf(value));
//         valueLabel.setFont(Font.font("Times New Roman", 20));
//         valueLabel.setTranslateX(circle.getCenterX() - 6);
//         valueLabel.setTranslateY(circle.getCenterY() - 10);

//         // Add the circle and the value label to the pane
//         myPane.getChildren().addAll(circle, valueLabel);

//         // Create an animation timer to move the circle with the label down
//         AnimationTimer timer = new AnimationTimer() {
//             // Generate a random speed for the circle
//             final double speed = random.nextDouble() * (MAX_SPEED - MIN_SPEED) + MIN_SPEED;

//             @Override
//             public void handle(long now) {
//                 // Update the position of the circle and the label
//                 circle.setCenterY(circle.getCenterY() + speed);
//                 valueLabel.setTranslateY(valueLabel.getTranslateY() + speed);

//                 // Check if the circle reaches the bottom of the pane
//                 if (circle.getCenterY() > 600) {
//                     // Remove the circle and the label from the pane
//                     myPane.getChildren().removeAll(circle, valueLabel);
//                     // Stop the animation timer
//                     stop();

//                     // Check if there are no more circles left and end the game
//                     if (circlesLeft == 0 && myPane.getChildren().size() == 1) {
//                         endGame();
//                     }
//                 }
//             }
//         };
//         // Start the animation timer
//         timer.start();

//         // Add a mouse click event handler to the circle
//         circle.setOnMouseClicked(event -> {
//             // Increase the score by the value of the circle
//             score += value;
//             scoreLabel.setText("Score: " + score);
//             // Remove the circle and the label from the pane
//             myPane.getChildren().removeAll(circle, valueLabel);
//             // Stop the animation timer
//             timer.stop();

//             // Check if there are no more circles left and end the game
//             if (circlesLeft == 0 && myPane.getChildren().size() == 1) {
//                 endGame();
//             }
//         });
//     }

//     // Define a method to end the game and show the results
//     private void endGame() {
//         // Update the list of top scores with the current score
//         updateTopScores();
//         // Clear the pane of any objects
//         myPane.getChildren().clear();

//         // Create a label to show the game over message
//         Label gameOverLabel = new Label("GAME OVER");
//         // Set the font and layout of the label
//         gameOverLabel.setFont(Font.font("Times New Roman", 40));
//         gameOverLabel.setLayoutX(200);
//         gameOverLabel.setLayoutY(200);
//         // Add the label to the pane
//         myPane.getChildren().add(gameOverLabel);

//         // Create a label to show the top five scores
//         Label topScoresLabel = new Label("Top 5 Scores:");
//         // Set the font and layout of the label
//         topScoresLabel.setFont(Font.font("Times New Roman", 20));
//         topScoresLabel.setLayoutX(240);
//         topScoresLabel.setLayoutY(350);
//         // Add the label to the pane
//         myPane.getChildren().add(topScoresLabel);

//         // Create a label to show the current score
//         Label scoreLabel = new Label("Score: " + score);
//         // Set the font and layout of the label
//         scoreLabel.setFont(Font.font("Times New Roman", 25));
//         scoreLabel.setLayoutX(250);
//         scoreLabel.setLayoutY(300);
//         // Add the label to the pane
//         myPane.getChildren().add(scoreLabel);

//         // Create a button to restart the game
//         Button retryButton = new Button("Retry");
//         // Set the layout, size, and font of the button
//         retryButton.setLayoutX(300);
//         retryButton.setLayoutY(450);
//         retryButton.setPrefWidth(100);
//         retryButton.setPrefHeight(25);
//         retryButton.setFont(Font.font("Times New Roman", 20));

//         // Add an action event handler to the button
//         retryButton.setOnAction(event -> {
//             // Call the method to restart the game
//             restartGame();
//         });
//         // Add the button to the pane
//         myPane.getChildren().add(retryButton);

//         // Display top scores in a loop
//         for (int i = 0; i < topScores.size(); i++) {
//             // Create a label for each score
//             scoreLabel = new Label("(" + (i + 1) + ") " + topScores.get(i));
//             // Set the font and layout of the label
//             scoreLabel.setFont(Font.font("Times New Roman", 21));
//             scoreLabel.setLayoutX(240);
//             scoreLabel.setLayoutY(380 + i * 25);
//             // Add the label to the pane
//             myPane.getChildren().add(scoreLabel);
//         }
//     }

//     // Define a method to update the list of top scores with the current score
//     private void updateTopScores() {
//         // Loop through the list of top scores
//         for (int i = 0; i < topScores.size(); i++) {
//             // Check if the current score is greater than the score at the current index
//             if (score > topScores.get(i)) {
//                 // Insert the current score at the current index
//                 topScores.add(i, score);
//                 // Remove the last score from the list
//                 topScores.remove(topScores.size() - 1);
//                 // Break out of the loop
//                 break;
//             }
//         }
//     }
//     private void restartGame() {
//         myPane.getChildren().clear(); // Clear the pane
//         score = 0; // Reset score
//         circlesLeft = NUM_CIRCLES; // Reset circlesLeft
//         startGame(); // Start a new game
//     }



//     // Define a method to start the game and add circles to the pane
//     private void startGame() {
//         // Set the text of the score label to zero
//         scoreLabel.setText("Score: 0");
//         // Set the layout and style of the score label
//         scoreLabel.setLayoutX(15);
//         scoreLabel.setLayoutY(15);
//         scoreLabel.setBorder(Border.stroke(Color.DARKGRAY));
//         scoreLabel.setFont(Font.font("Times New Roman", 25));
//         // Add the score label to the pane
//         myPane.getChildren().add(scoreLabel);

//         // Create an animation timer to add circles randomly
//         AnimationTimer timer = new AnimationTimer() {
//             // Define a constant for the probability of adding a circle
//             private static final double PROBABILITY = 0.013;

//             @Override
//             public void handle(long now) {
//                 // Check if there are circles left and generate a random number
//                 if (circlesLeft > 0 && Math.random() < PROBABILITY) {
//                     // Call the method to add a circle to the pane
//                     addCircle();
//                     // Decrease the number of circles left
//                     circlesLeft--;
//                 }
//             }
//         };
//         // Start the animation timer
//         timer.start();
//     }


//     public static void main(String[] args) {
//         launch(args);
//     }
