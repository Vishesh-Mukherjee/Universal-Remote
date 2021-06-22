package com.gdgu.universal;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class Remote {
    
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;
    private Command[] partyMode;

    private JFrame frame;

    public Remote() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        for (int i = 0; i < 7; i ++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
        frame = new JFrame();
        setup();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void setPartyMode(Command[] partyMode) {
        this.partyMode = partyMode;
    }

    private void partyMode() {
        for (Command i: partyMode) {
            i.execute();
        }
    }

    public void setup() {
        frame.setTitle("Universal Remote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        frame.setLayout(new GridLayout(7, 2));
        for (int i = 0; i < 7; i ++) {
            Integer innerI  = Integer.valueOf(i);
            JButton b1 = new JButton();
            JButton b2 = new JButton();
            ActionListener a1;
            ActionListener a2;
            if (innerI < 6) {
                a1 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        undoCommand = onCommand[innerI]; 
                        onCommand[innerI].execute();   
                    }
                };  
                a2 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        undoCommand = offCommand[innerI]; 
                        offCommand[innerI].execute();   
                    }
                };  
            } else {    
                a1 = (ActionEvent e) -> undoCommand.undo();
                a2 = (ActionEvent e) -> partyMode();
            }
            b1.addActionListener(a1);
            b2.addActionListener(a2);
            frame.add(b1);
            frame.add(b2);
        }
        frame.setVisible(true);
    }
}
