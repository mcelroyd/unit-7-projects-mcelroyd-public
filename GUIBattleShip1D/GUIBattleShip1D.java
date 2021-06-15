import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 *
 * @Daniel McElroy
 * @6/14/21
 */
public class GUIBattleShip1D implements ActionListener
{
    private boolean[] spaces = new boolean[7];
    private boolean[] beenHit = new boolean[7];
    private int numHits = 0;
    private int numMisses = 0;
    private int shipLength;
    
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel text = new JLabel();
    JButton[] buttons = new JButton[7];
    public GUIBattleShip1D(){
        for(int i = 0; i < 7; i++){
            spaces[i] = false;
        }
        randomShip();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);
        frame.getContentPane().setBackground(new Color(80, 80, 80));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        text.setBackground(new Color(25, 25, 25));
        text.setForeground(new Color(225, 25, 0));
        text.setFont(new Font("Times New Roman", Font.BOLD, 75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Battleship");
        text.setOpaque(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 1000, 100);
        
        button_panel.setLayout(new GridLayout());
        button_panel.setBackground(new Color(0,0,225));
        
        for(int i=0;i<7;i++){
            buttons[i]=new JButton();
            buttons[i].setBackground(new Color(200, 200, 200));
            button_panel.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        
        title_panel.add(text);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<7;i++){
            if(e.getSource()==buttons[i]){
                if(!beenHit[i]){
                    if(spaces[i]){
                        buttons[i].setBackground(Color.red);
                        numHits++;
                        System.out.println("hit");
                    }
                    else if(!spaces[i]){
                        buttons[i].setBackground(Color.blue);
                    }
                    numMisses++;
                    buttons[i].setEnabled(false);
                }
            }
        }
        for(int i = 0; i < 7; i++){
            if(numHits == shipLength){
                buttons[i].setEnabled(false);
                if(spaces[i]){
                    buttons[i].setBackground(Color.black);
                }
                else{
                    buttons[i].setBackground(Color.blue);
                }
            }
        }
        if(numHits == shipLength){
            win();
        }
    }
    public void randomShip(){
        shipLength = (int)(Math.random()*3)+2; //makes the ship a random length between 2 and 4
        int placement = (int)(Math.random()*(7-shipLength));
        for(int i = 0; i < shipLength; i++){
            spaces[placement + i] = true;
        }
    }
    public boolean[] getspaces(){
        return spaces;
    }
    public void win(){
        text.setText("YOU WON!");
        System.out.println("It took you " + numMisses + " misses and " + numHits + " hits to sink the ship.");
        int score = ((int)(((numHits/(double)numMisses)*100)+.5));
        System.out.println("Your score is  " + score + "/100.");
    }
}