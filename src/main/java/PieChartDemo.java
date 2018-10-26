import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;

/**
 * PieChartDemo class
 *
 * @author Administrator
 * @date 2018/10/26
 */
public class PieChartDemo {

    private static  void createPieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("苹果", 250);
        dataset.setValue("桔子", 350);
        dataset.setValue("梨子", 200);
        dataset.setValue("香蕉", 50);
        dataset.setValue("荔枝", 150);
        JFreeChart chart = ChartFactory.createPieChart("水果产量比率图", dataset,
                true, true, true);

        Plot cp = chart.getPlot();
        // 背景色设置
        cp.setBackgroundPaint(ChartColor.WHITE);

        try {
            ChartUtilities.saveChartAsPNG(new File("PieChart.png"),
                    chart, 800, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        createPieChart();
    }
}
