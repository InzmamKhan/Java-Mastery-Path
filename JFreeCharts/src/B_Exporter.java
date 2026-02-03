import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import java.io.File;
import java.io.IOException;

public class B_Exporter {

    public static void main(String[] args) {
        
        // --- 1. DATASET SETUP ---
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Completed", 85);
        dataset.setValue("Remaining", 15);

        // --- 2. CHART CREATION ---
        JFreeChart myChart = ChartFactory.createPieChart(
            "Phase 1 Export Test", // Title
            dataset, // Data
            true, // Legend
            true, // Tooltips
            false // URLs
        );

        // --- 3. EXPORTING (The File Part) ---
        // Note: We use a try-catch because file operations can throw IOExceptions
        try {
            // Define the file paths
            File pngFile = new File("MyFirstChart.png");
            File jpgFile = new File("MyFirstChart.jpg");

            // Save as PNG
            ChartUtils.saveChartAsPNG(pngFile, myChart, 800, 600);
            System.out.println("PNG Exported to: " + pngFile.getAbsolutePath());

            // Save as JPEG
            ChartUtils.saveChartAsJPEG(jpgFile, myChart, 800, 600);
            System.out.println("JPG Exported to: " + jpgFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Problem occurred while saving the chart: " + e.getMessage());
        }
    }
}