package org.usfirst.frc.team1939.robot.commands.autonomous;

import org.usfirst.frc.team1939.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoMove extends Command {
	double move;
	double rotate;
	double strafe;
    public AutoMove(double m, double r, double s) {
    	move = m;
    	rotate = r;
    	strafe = s;
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(move, rotate, strafe);
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
