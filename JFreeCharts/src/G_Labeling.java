import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.ui.RectangleEdge; // For positioning the legend
import org.jfree.data.category.DefaultCategoryDataset;

public class G_Labeling {
    public static void main(String[] args) {
        // 1. Data Setup
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(75, "Progress", "Phase 1");
        dataset.addValue(100, "Progress", "Phase 2");

        JFreeChart chart = ChartFactory.createBarChart("Syllabus Mastery", "Phase", "Score", dataset);

        // 2. LEGENDS & LABELS (The Phase 2 Finale)
        
        // A. Move the Legend to the RIGHT
        chart.getLegend().setPosition(RectangleEdge.RIGHT);

        // B. Get the Renderer to turn on the numbers
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // C. Enable Item Labels (The numbers on top of bars)
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setDefaultItemLabelsVisible(true);

        // 3. Show it
        ChartFrame frame = new ChartFrame("Final Aesthetics", chart);
        frame.pack();
        frame.setVisible(true);
    }
}