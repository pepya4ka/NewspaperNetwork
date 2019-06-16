import javax.swing.*;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private volatile int time = -1;

    private Runnable refresher = new Runnable() {
        @Override
        public void run() {
            int t = time;
            AppearanceMachine.jLabelForTime.setText(String.format("%02d:%02d", t / 60, t % 60));
        }
    };

    @Override
    public void run() {
        time += 1;
        SwingUtilities.invokeLater(refresher);
        if (time > 1440) {
            AppearanceMachine.dailyButtonFill = true;
            AppearanceMachine.jButtonFillDailyNewspaper.setEnabled(AppearanceMachine.dailyButtonFill);
            JOptionPane.showMessageDialog(null, "Ого, прошел один день, замените Ежедневные газеты:)");
            time = 0;
        }
    }
}