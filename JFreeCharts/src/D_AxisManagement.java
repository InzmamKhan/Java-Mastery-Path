import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.category.DefaultCategoryDataset;

public class D_AxisManagement {
    public static void main(String[] args) {
        // 1. Basic Data
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(92, "Score", "Quiz 1");
        dataset.addValue(32, "Score", "Quiz 2");
        dataset.addValue(70, "Score", "Quiz 3");

        // 2. Create standard Bar Chart
        JFreeChart chart = ChartFactory.createBarChart("Exam Results", "Quiz Name", "Percentage", dataset);

        // 3. AXIS MANAGEMENT
        // We get the "Plot" (the canvas)
        CategoryPlot plot = chart.getCategoryPlot();
        
        // We get the "Range Axis" (The Y-Axis)
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();

        // FIX 1: Force the axis to start at 0 (Proportionality)
        rangeAxis.setAutoRangeIncludesZero(true);

        // FIX 2: Set a manual range from 0 to 100
        // This is helpful for percentages
        rangeAxis.setRange(0.0, 100.0);

        // 4. Show it
        ChartFrame frame = new ChartFrame("Axis Management", chart);
        frame.pack();
        frame.setVisible(true);
    }
}