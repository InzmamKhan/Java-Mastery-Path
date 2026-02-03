import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Color;
import java.awt.Font;

public class F_Styling {
    public static void main(String[] args) {
        // 1. Data Setup
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(150, "Sales", "Jan");
        dataset.addValue(210, "Sales", "Feb");
        dataset.addValue(180, "Sales", "Mar");

        JFreeChart chart = ChartFactory.createBarChart("Quarterly Sales", "Month", "Revenue", dataset);

        // 2. STYLING THE "ROOM" (The Phase 2 Part)
        
        // A. Change the outer background to White
        chart.setBackgroundPaint(Color.WHITE);

        // B. Get the Plot to change internal styles
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(245, 245, 245)); // Very light gray canvas
        
        // C. Style the Gridlines
        plot.setRangeGridlinePaint(Color.DARK_GRAY);
        plot.setRangeGridlinesVisible(true);
        plot.setDomainGridlinesVisible(false); // Hide vertical lines for a cleaner look

        // D. Style the Fonts
        Font titleFont = new Font("Arial", Font.BOLD, 22);
        chart.getTitle().setFont(titleFont);

        Font axisFont = new Font("Verdana", Font.PLAIN, 14);
        plot.getDomainAxis().setLabelFont(axisFont);
        plot.getRangeAxis().setLabelFont(axisFont);

        // 3. Show it
        ChartFrame frame = new ChartFrame("Modern Styling", chart);
        frame.pack();
        frame.setVisible(true);
    }
}