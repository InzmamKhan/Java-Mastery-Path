import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class C_CategorialData {
    public static void main(String[] args) {
        // 1. Create the Dataset (The "Storage Box")
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Syntax: dataset.addValue(Number, "Series/Group", "Category/Label")
        
        // Series 1: Coffee
        dataset.addValue(3, "Coffee", "Monday");
        dataset.addValue(5, "Coffee", "Tuesday");
        dataset.addValue(2, "Coffee", "Wednesday");

        // Series 2: Water
        dataset.addValue(8, "Water", "Monday");
        dataset.addValue(7, "Water", "Tuesday");
        dataset.addValue(10, "Water", "Wednesday");

        // 2. Create the Chart using the Category Factory
        JFreeChart barChart = ChartFactory.createBarChart("Hydration Tracker", "Days of the Week","Cups Drunk", dataset);

        // 3. Show it (Same way as Phase 1)
        ChartFrame frame = new ChartFrame("Categorical Data", barChart);
        frame.pack();
        frame.setVisible(true);
    }
}