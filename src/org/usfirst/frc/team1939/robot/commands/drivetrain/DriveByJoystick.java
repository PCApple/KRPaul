package org.usfirst.frc.team1939.robot.commands.drivetrain;

import org.usfirst.frc.team1939.robot.OI;
import org.usfirst.frc.team1939.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveByJoystick extends Command {

    public DriveByJoystick() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(Robot.oi.left.getY(), Robot.oi.right.getX(), Robot.oi.left.getX());
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
