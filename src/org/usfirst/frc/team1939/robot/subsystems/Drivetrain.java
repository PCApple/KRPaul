package org.usfirst.frc.team1939.robot.subsystems;

import org.usfirst.frc.team1939.robot.RobotMap;
import org.usfirst.frc.team1939.robot.commands.drivetrain.DriveByJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public static final double DEAD_BAND = 0.1;
    public Talon frontLeft = new Talon(RobotMap.frontLeftTalon);
    public Talon frontRight = new Talon(RobotMap.frontRightTalon);
    public Talon backRight = new Talon(RobotMap.backRightTalon);
    public Talon backLeft = new Talon(RobotMap.backLeftTalon);
    
    private RobotDrive drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
    private RobotDrive drive1 = new RobotDrive(backLeft, backLeft);
    public Drivetrain(){
    	drive.setInvertedMotor(MotorType.kFrontRight,true); 
    	drive.setInvertedMotor(MotorType.kRearRight, true);
    }
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveByJoystick());
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

