import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 * Write a description of class BattleShip2D here.
 *
 * Daniel McElroy
 * 6/16/21
 */
public class BattleShip2D implements ActionListener
{
    private boolean[][] space = new boolean[9][9];
    
    int[] ship1 = new int[2];
    int[] ship2 = new int[2];
    int[] ship3 = new int[2];
    int[] ship4 = new int[2];
    int[] ship5 = new int[2];
    
    boolean vert1;
    boolean vert2;
    boolean vert3;
    boolean vert4;
    boolean vert5;
    
    boolean sink1 = false;
    boolean sink2 = false;
    boolean sink3 = false;
    boolean sink4 = false;
    boolean sink5 = false;
    int shipCount = 1;
    
    private int numHits = 0;
    private int numMisses = 0;
    private int run = 0;
    private int ng = 1;
    
    public boolean[][] shot = new boolean[9][9];
    
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel text = new JLabel();
    JButton[][] buttons = new JButton[9][9];
    JButton reset = new JButton();
    JPanel resetPanel = new JPanel();
    public BattleShip2D(){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                space[row][col] = false;
                shot[row][col] = false;
            }
        }
        randShip(5);
        randShip(4);
        randShip(4);
        randShip(3);
        randShip(3);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 745);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        text.setBackground(new Color(25, 25, 25));
        text.setForeground(new Color(225, 25, 0));
        text.setFont(new Font("Times New Roman", Font.BOLD, 75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Battleship");
        text.setOpaque(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 700, 100);
        
        button_panel.setLayout(new GridLayout(9, 9));
        button_panel.setBackground(new Color(0,0,225));
        
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                buttons[row][col]=new JButton();
                buttons[row][col].setBackground(new Color(200, 200, 200));
                button_panel.add(buttons[row][col]);
                buttons[row][col].setFocusable(false);
                buttons[row][col].addActionListener(this);
            }
        }
        
        title_panel.add(text);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(e.getSource()==buttons[row][col]){
                    shot[row][col] = true;
                    if(space[row][col]){
                        buttons[row][col].setBackground(Color.red);
                        numHits++;
                        System.out.println("hit");
                        int hit = 0;
                        if(vert1){
                            for(int i = 0; i < 5; i++){
                                if(shot[ship1[0] + i][ship1[1]]){
                                    hit++;
                                }
                                if(hit == 5 && !sink1){
                                    System.out.println("sink");
                                    for(int j = 0; j < 5; j++){
                                        buttons[ship1[0] + j][ship1[1]].setBackground(Color.black);
                                    }
                                    sink1 = true;
                                }
                            }
                        }
                        else if(!vert1){
                            for(int i = 0; i < 5; i++){
                                if(shot[ship1[0]][ship1[1] + i]){
                                    hit++;
                                }
                                if(hit == 5 && !sink1){
                                    System.out.println("sink");
                                    for(int j = 0; j < 5; j++){
                                        buttons[ship1[0]][ship1[1] + j].setBackground(Color.black);
                                    }
                                    sink1 = true;
                                }
                            }
                        }
                        hit = 0;
                        if(vert2){
                            for(int i = 0; i < 4; i++){
                                if(shot[ship2[0] + i][ship2[1]]){
                                    hit++;
                                }
                                if(hit == 4 && !sink2){
                                    System.out.println("sink");
                                    for(int j = 0; j < 4; j++){
                                        buttons[ship2[0] + j][ship2[1]].setBackground(Color.black);
                                    }
                                    sink2 = true;
                                }
                            }
                        }
                        else if(!vert2){
                            for(int i = 0; i < 4; i++){
                                if(shot[ship2[0]][ship2[1] + i]){
                                    hit++;
                                }
                                if(hit == 4 && !sink2){
                                    System.out.println("sink");
                                    for(int j = 0; j < 4; j++){
                                        buttons[ship2[0]][ship2[1] + j].setBackground(Color.black);
                                    }
                                    sink2 = true;
                                }
                            }
                        }
                        hit = 0;
                        if(vert3){
                            for(int i = 0; i < 4; i++){
                                if(shot[ship3[0] + i][ship3[1]]){
                                    hit++;
                                }
                                if(hit == 4 && !sink3){
                                    System.out.println("sink");
                                    for(int j = 0; j < 4; j++){
                                        buttons[ship3[0] + j][ship3[1]].setBackground(Color.black);
                                    }
                                    sink3 = true;
                                }
                            }
                        }
                        else if(!vert3){
                            for(int i = 0; i < 4; i++){
                                if(shot[ship3[0]][ship3[1] + i]){
                                    hit++;
                                }
                                if(hit == 4 && !sink3){
                                    System.out.println("sink");
                                    for(int j = 0; j < 4; j++){
                                        buttons[ship3[0]][ship3[1] + j].setBackground(Color.black);
                                    }
                                    sink3 = true;
                                }
                            }
                        }
                        hit = 0;
                        if(vert4){
                            for(int i = 0; i < 3; i++){
                                if(shot[ship4[0] + i][ship4[1]]){
                                    hit++;
                                }
                                if(hit == 3 && !sink4){
                                    System.out.println("sink");
                                    for(int j = 0; j < 3; j++){
                                        buttons[ship4[0] + j][ship4[1]].setBackground(Color.black);
                                    }
                                    sink4 = true;
                                }
                            }
                        }
                        else if(!vert4){
                            for(int i = 0; i < 3; i++){
                                if(shot[ship4[0]][ship4[1] + i]){
                                    hit++;
                                }
                                if(hit == 3 && !sink4){
                                    System.out.println("sink");
                                    for(int j = 0; j < 3; j++){
                                        buttons[ship4[0]][ship4[1] + j].setBackground(Color.black);
                                    }
                                    sink4 = true;
                                }
                            }
                        }
                        hit = 0;
                        if(vert5){
                            for(int i = 0; i < 3; i++){
                                if(shot[ship5[0] + i][ship5[1]]){
                                    hit++;
                                }
                                if(hit == 3 && !sink5){
                                    System.out.println("sink");
                                    for(int j = 0; j < 3; j++){
                                        buttons[ship5[0] + j][ship5[1]].setBackground(Color.black);
                                    }
                                    sink5 = true;
                                }
                            }
                        }
                        else if(!vert5){
                            for(int i = 0; i < 3; i++){
                                if(shot[ship5[0]][ship5[1] + i]){
                                    hit++;
                                }
                                if(hit == 3 && !sink5){
                                    System.out.println("sink");
                                    for(int j = 0; j < 3; j++){
                                        buttons[ship5[0]][ship5[1] + j].setBackground(Color.black);
                                    }
                                    sink5 = true;
                                }
                            }
                        }
                        hit = 0;
                    }
                    else if(!space[row][col]){
                        buttons[row][col].setBackground(Color.blue);
                    }
                    numMisses++;
                    buttons[row][col].setEnabled(false);
                }
            }
        }      
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(numHits == 19){
                    buttons[row][col].setEnabled(false);
                    if(space[row][col]){
                        buttons[row][col].setBackground(Color.black);
                    }
                    else{
                        buttons[row][col].setBackground(Color.blue);
                    }
                }
            }
        }
        if(numHits == 19){
            win();
            reset();
            numHits = 0;
            numMisses = 0;
            run++;
            ng = 1;
            shipCount = 1;
            sink1 = false;
            sink2 = false;
            sink3 = false;
            sink4 = false;
            sink5 = false;
        }
        if(e.getSource()==reset && ng == 1){
            frame.remove(title_panel);
            frame.remove(button_panel);
            frame.remove(resetPanel);
            frame.setSize(800, 745);
            for(int row = 0; row < 9; row++){
                for(int col = 0; col < 9; col++){
                    space[row][col] = false;
                    shot[row][col] = false;
                }
            }
            randShip(5);
            randShip(4);
            randShip(4);
            randShip(3);
            randShip(3);
            
            System.out.println();
            System.out.println();
            
            button_panel.setLayout(new GridLayout(9, 9));
            for(int row = 0; row < 9; row++){
                for(int col = 0; col < 9; col++){
                    button_panel.remove(buttons[row][col]);
                }
            }
            for(int row = 0; row < 9; row++){
                for(int col = 0; col < 9; col++){
                    buttons[row][col] = new JButton();
                    buttons[row][col].setBackground(new Color(200, 200, 200));
                    button_panel.add(buttons[row][col]);
                    buttons[row][col].setFocusable(false);
                    buttons[row][col].addActionListener(this);
                }
            }
            text.setText("Battleship");
            frame.add(title_panel,BorderLayout.NORTH);
            frame.add(button_panel);
            ng++;
        }
    }
    public void randShip(int length){
        boolean direction; //true is vertical, false is horizontal
        if((int)(Math.random()*2) == 0){
            direction = true;
        }
        else{
            direction = false;
        }
        int[] firstPoint = new int[2]; //the first is row, then column
        if(direction){
            firstPoint[0] = (int)(Math.random()*(9 - length));
            firstPoint[1] = (int)(Math.random()*9);
        }
        else{
            firstPoint[0] = (int)(Math.random()*9);
            firstPoint[1] = (int)(Math.random()*(9 - length));
        }
        boolean pass = false;
        int overlaps = 0;
        while(!pass){
            if(direction){
                for(int i = 0; i < length; i++){
                    if(space[firstPoint[0] + i][firstPoint[1]]){
                        overlaps++;
                    }
                }
                if(overlaps == 0){
                    pass = true;
                }
                else{
                    firstPoint[0] = (int)(Math.random()*(9 - length));
                    firstPoint[1] = (int)(Math.random()*9);
                }
            }
            else{
                for(int i = 0; i < length; i++){
                    if(space[firstPoint[0]][firstPoint[1] + i]){
                        overlaps++;
                    }
                }
                if(overlaps == 0){
                    pass = true;
                }
                else{
                    firstPoint[0] = (int)(Math.random()*9);
                    firstPoint[1] = (int)(Math.random()*(9 - length));
                }
            }
            overlaps = 0;
        }
        for(int i = 0; i < length; i++){
            if(direction){
                space[firstPoint[0] + i][firstPoint[1]] = true;
            }
            else{
                space[firstPoint[0]][firstPoint[1] + i] = true;
            }
        }
        if(shipCount == 1){
            ship1 = firstPoint;
            vert1 = direction;
        }
        else if(shipCount == 2){
            ship2 = firstPoint;
            vert2 = direction;
        }
        else if(shipCount == 3){
            ship3 = firstPoint;
            vert3 = direction;
        }
        else if(shipCount == 4){
            ship4 = firstPoint;
            vert4 = direction;
        }
        else if(shipCount == 5){
            ship5 = firstPoint;
            vert5 = direction;
        }
        shipCount++;
    }
    public void win(){
        int score = ((int)(((numHits/(double)numMisses)*100)+.5));
        text.setText("YOU WON!");
        System.out.println("It took you " + numMisses + " misses and " + numHits + " hits.");
        System.out.println("Your score is " + score + "/100.");
    }
    public void reset(){
        frame.setSize(800, 800);
        button_panel.setLayout(new BorderLayout());
        resetPanel.setLayout(new BorderLayout());
        button_panel.setLocation(0, 100);
        resetPanel.setSize(700, 100);
        resetPanel.setLocation(0, 700);
        
        reset.setBackground(Color.white);
        reset.setForeground(new Color(25, 25, 25));
        reset.setFont(new Font("Times New Roman", Font.BOLD, 40));
        reset.setHorizontalAlignment(JLabel.CENTER);
        resetPanel.add(reset);
        reset.setFocusable(false);
        
        reset.addActionListener(this);
        reset.setText("RESET");
        frame.add(resetPanel, BorderLayout.SOUTH);
    }
}