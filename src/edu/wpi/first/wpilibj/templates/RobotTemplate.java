package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RobotTemplate extends SimpleRobot {
    Victor vr;
    Victor vl;
    public void robotInit(){
        vr = new Victor(4);
        vl = new Victor(2);
    }
    public void autonomous() {
        
    }
    public void operatorControl() {
        while(isEnabled()){
            if(SmartDashboard.getBoolean("Checkbox 1", true)) {
               vl.set(SmartDashboard.getNumber("Slider 1")/100);
            }
            else if(!SmartDashboard.getBoolean("Checkbox 1", true)) {
                vl.set(-(SmartDashboard.getNumber("Slider 1")/100));
            }
            
            if(SmartDashboard.getBoolean("Checkbox 2", true)) {
               vr.set(SmartDashboard.getNumber("Slider 1")/100);
            }
            else if(!SmartDashboard.getBoolean("Checkbox 2", true)) {
                vr.set(-(SmartDashboard.getNumber("Slider 1")/100));
            }
        }
        
    }
    public void test() {
    
    }
    public void disabled() {
        SmartDashboard.putBoolean("Checkbox 1", false);
        SmartDashboard.putBoolean("Checkbox 2", false);
    }
}
