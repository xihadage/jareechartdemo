import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;

/**
 * LineChartDemo class
 *
 * @author Administrator
 * @date 2018/10/26
 */
public class LineChartDemo {
    public static void main(String[] args){
        createLineChart();
    }
    public static void createLineChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100, "北京", "苹果");
        dataset.addValue(200, "上海", "苹果");
        dataset.addValue(300, "广州", "苹果");
        dataset.addValue(400, "北京", "梨子");
        dataset.addValue(500, "上海", "梨子");
        dataset.addValue(600, "广州", "梨子");
        dataset.addValue(700, "北京", "葡萄");
        dataset.addValue(800, "上海", "葡萄");
        dataset.addValue(900, "广州", "葡萄");
        dataset.addValue(800, "北京", "香蕉");
        dataset.addValue(700, "上海", "香蕉");
        dataset.addValue(600, "广州", "香蕉");
        dataset.addValue(500, "北京", "荔枝");
        dataset.addValue(400, "上海", "荔枝");
        dataset.addValue(300, "广州", "荔枝");
        JFreeChart chart = ChartFactory.createLineChart("水果产量图 ", "水果", "产量",
                dataset, PlotOrientation.VERTICAL, true, true, true);

        CategoryPlot cp = chart.getCategoryPlot();
        // 背景色设置
        cp.setBackgroundPaint(ChartColor.WHITE);
        // 网格线色设置
        cp.setRangeGridlinePaint(ChartColor.GRAY);

        // ChartFrame frame=new ChartFrame ("水果产量图 ",chart,true);
        // frame.pack();
        // frame.setVisible(true);

        try {
            ChartUtilities.saveChartAsPNG(new File("LineChart.png"),
                    chart, 800, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
