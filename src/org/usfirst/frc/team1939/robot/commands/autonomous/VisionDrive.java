package org.usfirst.frc.team1939.robot.commands.autonomous;

import org.usfirst.frc.team1939.robot.Robot;
import org.usfirst.frc.team1939.robot.vision.Vision;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class VisionDrive extends Command {

    public VisionDrive() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (!Vision.isInitialized()){
    		 	Vision.init();
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(0.7,0.02 * Vision.getCenterX(), 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
