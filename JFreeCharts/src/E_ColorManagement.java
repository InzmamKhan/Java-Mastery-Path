import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Color; // Standard Java colors

public class E_ColorManagement {
    public static void main(String[] args) {
        // 1. Setup Data
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(3, "Coffee", "Mon");
        dataset.addValue(8, "Water", "Mon");
        dataset.addValue(5, "Coffee", "Tue");
        dataset.addValue(7, "Water", "Tue");

        // 2. Create Chart
        JFreeChart chart = ChartFactory.createBarChart("Drink Tracker", "Day", "Cups", dataset);

        // 3. COLOR MANAGEMENT (The Phase 2 Part)
        CategoryPlot plot = chart.getCategoryPlot();
        
        // Get the Renderer (The Artist) and Attch it to Specified Plot
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Change Series Colors
        // Series index 0 is "Coffee" (added first), Series 1 is "Water"
        renderer.setSeriesPaint(0, new Color(139, 69, 19)); // Brown
        renderer.setSeriesPaint(1, new Color(30, 144, 255)); // Dodger Blue

        // Bonus: Add a small shadow effect
        renderer.setShadowVisible(true);
        renderer.setShadowPaint(Color.LIGHT_GRAY);

        // 4. Show it
        ChartFrame frame = new ChartFrame("Color Theory", chart);
        frame.pack();
        frame.setVisible(true);
    }
}