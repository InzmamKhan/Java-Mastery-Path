import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class A_ChartTypes {

    public static void main(String[] args) {
        showPieChart();
        showBarChart();
        showLineChart();
    }

    // 1. PIE CHART (Parts of a whole)
    public static void showPieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Java Knowledge", 25);
        dataset.setValue("Potential", 75);

        JFreeChart chart = ChartFactory.createPieChart("Phase 1: Progress", dataset, true, true, false);
        display(chart, "Pie Chart View");
    }

    // 2. BAR CHART (Comparing categories)
    public static void showBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Structure: (Value, "Series Name", "Category Name")
        dataset.addValue(80, "Score", "Monday");
        dataset.addValue(95, "Score", "Tuesday");
        dataset.addValue(70, "Score", "Wednesday");

        JFreeChart chart = ChartFactory.createBarChart("Weekly Performance", "Days", "Score", dataset);
        display(chart, "Bar Chart View");
    }

    // 3. LINE CHART (Trends over time/numbers)
    public static void showLineChart() {
        XYSeries series = new XYSeries("Learning Curve");
        series.add(1, 10); // (X, Y)
        series.add(2, 25);
        series.add(3, 55);
        series.add(5, 99);

        XYSeriesCollection dataset = new XYSeriesCollection(series);

        JFreeChart chart = ChartFactory.createXYLineChart("Growth Rate", "Weeks", "Skill Level", dataset);
        display(chart, "Line Chart View");
    }

    // Helper method to keep code clean
    private static void display(JFreeChart chart, String title) {
        ChartFrame frame = new ChartFrame(title, chart);
        frame.pack();
        frame.setVisible(true);
    }
}