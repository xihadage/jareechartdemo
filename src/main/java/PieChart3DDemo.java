import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

import java.io.File;
import java.io.IOException;

/**
 * PieChart3DDemo class
 *
 * @author Administrator
 * @date 2018/10/26
 */
public class PieChart3DDemo {
    private static void createPieChart3D() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("苹果", 250);
        dataset.setValue("桔子", 350);
        dataset.setValue("梨子", 200);
        dataset.setValue("香蕉", 50);
        dataset.setValue("荔枝", 150);
        JFreeChart chart = ChartFactory.createPieChart3D("水果产量比率图", dataset,
                true, true, true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        // 设置开始角度
        plot.setStartAngle(150D);
        // 设置方向为"顺时针方向"
        plot.setDirection(Rotation.CLOCKWISE);
        // 设置透明度，0.5F为半透明，1为不透明，0为全透明
        plot.setForegroundAlpha(1F);
        // 没有数据的时候显示的内容
        plot.setNoDataMessage("无数据显示");
        // 背景色设置
        plot.setBackgroundPaint(ChartColor.WHITE);
        // ChartFrame frame = new ChartFrame("水果产量比率图 ", chart, true);
        // frame.pack();
        // frame.setVisible(true);

        try {
            ChartUtilities.saveChartAsPNG(new File("PieChart3D.png"),
                    chart, 800, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        createPieChart3D();
    }
}
