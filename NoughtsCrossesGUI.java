import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NoughtsCrossesGUI extends Application {
	private GraphicsContext gc;
	private String player = "X";
	private NoughtsCrossesObject ttt;
	private boolean started = false;
	private boolean gameOver = false;
	private boolean drawLabels = false;
}
