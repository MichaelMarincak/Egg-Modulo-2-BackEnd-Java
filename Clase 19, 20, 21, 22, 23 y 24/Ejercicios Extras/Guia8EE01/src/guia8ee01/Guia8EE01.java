package guia8ee01;
import guia8ee01.Servicios.RaicesServicio;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class Guia8EE01 extends Application{
    public static void main(String[] args) {
        RaicesServicio R = new RaicesServicio();
        
        R.raiz();
        R.getDiscriminante();
        R.tieneRaices();
        R.tieneRaiz();
        R.obtenerRaices();
        R.obtenerRaiz();
        R.calcular();
        launch(args);
    }
    
     @Override
    public void start(Stage primaryStage) {
        // Definir los ejes X e Y
        NumberAxis xAxis = new NumberAxis(-5, 5, 1);
        NumberAxis yAxis = new NumberAxis(-5, 5, 1);

        // Crear el objeto de la gráfica de líneas
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        // Crear la serie de datos para la función cuadrática
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("f(x) = x^2 - 4x + 3");
        for (double x = -5; x <= 10; x += 0.1) {
            double y = x * x - 4 * x + 3;
            series.getData().add(new XYChart.Data<>(x, y));
        }

        // Agregar la serie de datos a la gráfica
        lineChart.getData().add(series);

        // Crear el objeto de la escena y agregar la gráfica
        Group root = new Group(lineChart);
        Scene scene = new Scene(root, 800, 600);

        // Mostrar la ventana
        primaryStage.setTitle("Gráfica de función cuadrática");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
