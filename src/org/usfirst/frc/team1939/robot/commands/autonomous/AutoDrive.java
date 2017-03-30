package org.usfirst.frc.team1939.robot.commands.autonomous;

import com.usfirst.frc.team1939.robot.util.Wait;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoDrive extends CommandGroup {

    public AutoDrive(double move, double rotate, double strafe, double time) {
        addParallel(new AutoMove(move, rotate,strafe));
        addSequential(new Wait(time));
    }
}
