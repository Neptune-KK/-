
package dyclock;
import java.awt.event.*;
import javax.swing.*;
 
public class DyClock extends StillClock{
	public DyClock()
	{
	       Timer time=new Timer(1000,new TimerListener());
	       time.start();
	}
    class TimerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			setCurrentTime();
			repaint();			
		}   	   
       }
    public static void main(String[] args) {
    	
    	JFrame f=new JFrame("钟");
    	DyClock clock=new DyClock();
    	f.add(clock);
    	f.setLocationRelativeTo(null);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setSize(200,200);
    	f.setVisible(true);
    }
}