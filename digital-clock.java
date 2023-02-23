import javax.swing.*;
import java.awt.*;
import java.text.SimpleDataFormat;
import java.util.Calendar;

public class Clock extends JFrame {

    Calendar calendar;
    SimpleDataFormat timeFormat;
    SimpleDataFormat dayFormat;
    SimpleDataFormat dataFormat;

    JLavel timeLabel;
    JLabel dayLabel;
    JLabel dataLabel;
    String time;
    String data;
    Clock() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 220);
        this.setResizeable(false);

        timeFormat = new SimpleDataFormat("hh:mm:ss a");
        dayFormat=new SimpleDataFormat("EEE");
        dataFormat=new SimpleDataFormat("dd MMMMM, yyyy");
        timeLabel  = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 59));
        timeLabel.setBackground(Color.GREEN);
        timeLabel.setBackground(Color.BLUE);
        timeLabel.setOpaque(true);
        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.BOLD,34));

        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.BOLD,30));
        

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTimer();
    }

    public void setTimer() {
        while (true) {
            time = timeFormat.format(Calender.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date - dateFormat.format(calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.getStackTrace();
            }

        }
    }
    public static void main(string[] args) {
        new Clock();
    }

    }
}