package org.usfirst.frc.team1939.robot.subsystems;

import org.usfirst.frc.team1939.robot.RobotMap;
import org.usfirst.frc.team1939.robot.commands.drivetrain.DriveByJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public static final double DEAD_BAND = 0.1;
    public CANTalon frontLeft = new CANTalon(RobotMap.frontLeftTalon);
    public CANTalon frontRight = new CANTalon(RobotMap.frontRightTalon);
    public CANTalon backRight = new CANTalon(RobotMap.backRightTalon);
    public CANTalon backLeft = new CANTalon(RobotMap.backLeftTalon);
    
    private RobotDrive drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
    public Drivetrain(){
    	drive.setInvertedMotor(MotorType.kFrontRight,true); 
    	drive.setInvertedMotor(MotorType.kRearRight, true);
    }
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveByJoystick());
    }
    public void enableBraking(){
    	frontLeft.enableBrakeMode(true);
    	frontRight.enableBrakeMode(true);
    	backRight.enableBrakeMode(true);
    	backLeft.enableBrakeMode(true);
    }
    public void disableBraking(){
    	frontLeft.enableBrakeMode(false);
    	frontRight.enableBrakeMode(false);
    	backRight.enableBrakeMode(false);
    	backLeft.enableBrakeMode(false);
    }
    public void drive (double move, double rotate, double strafe){
    	if (move <DEAD_BAND){
    		move = 0;
    	}
    	if (rotate <DEAD_BAND){
    		rotate = 0;
    	}
    	if (strafe <DEAD_BAND){
    		strafe = 0;
    	}
    	drive.mecanumDrive_Cartesian(strafe, move, rotate, 0);
    }
}

