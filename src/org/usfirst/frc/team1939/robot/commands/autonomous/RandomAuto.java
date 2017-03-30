package org.usfirst.frc.team1939.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RandomAuto extends CommandGroup {

    public RandomAuto() {
        addSequential(new AutoDrive(0, 1,0, 2));
        addSequential(new AutoDrive(0, -1,0, 2));
        addSequential(new AutoDrive(0, 1,0, 2));
        addSequential(new AutoDrive(0, -1,0, 2));
        addSequential(new AutoDrive(0, 1,0, 2));
        addSequential(new AutoDrive(0, -1,0, 2));
        addSequential(new AutoDrive(0, 1,0, 2));
        addSequential(new AutoDrive(0, -1,0, 1));
    }
}
