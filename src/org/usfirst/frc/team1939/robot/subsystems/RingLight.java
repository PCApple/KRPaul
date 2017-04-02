package org.usfirst.frc.team1939.robot.subsystems;

import org.usfirst.frc.team1939.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RingLight extends Subsystem {

    public Relay ringLight = new Relay(RobotMap.ringLight);

    public void initDefaultCommand() {
    }
    public void turnOn(){
    	ringLight.set(Relay.Value.kReverse);
    }
    public void turnOff(){
    	ringLight.set(Relay.Value.kForward);
    }
    public boolean isOn(){
    	if(ringLight.get() == Relay.Value.kReverse){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
}