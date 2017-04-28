package org.usfirst.frc.team1939.robot.commands.autonomous;

import org.usfirst.frc.team1939.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class TimedMove extends TimedCommand {
	double move;
	double rotate;
	double strafe;

    public TimedMove(double timeout, double m, double r, double s) {
        super(timeout);
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

    // Called once after timeout
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
