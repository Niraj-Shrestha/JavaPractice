import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ThreePlusOneChart extends ApplicationFrame {
    private DefaultCategoryDataset dataset;
    private ChartPanel chartPanel;
    public ThreePlusOneChart(String title,List<Integer> items ) {
        super(title);
        dataset = createDataset(items);
        JFreeChart chart = ChartFactory.createLineChart(
                "Three Plus One Chart",
                "Node",
                "Value",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(560, 370));

        setLayout(new BorderLayout());
        add(chartPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private DefaultCategoryDataset createDataset(List<Integer> items) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int item : items) {
            dataset.addValue(0, "Node", Integer.toString(item));
        }
        return dataset;
    }
    void input(List<Integer> items){
        for(int item : items){
            String point = String.valueOf(item);
            dataset.setValue(item, "Node", point);
            SwingUtilities.invokeLater(() -> chartPanel.repaint());
        }
    }
}