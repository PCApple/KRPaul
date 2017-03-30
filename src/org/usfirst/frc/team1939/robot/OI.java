package org.usfirst.frc.team1939.robot;

import org.usfirst.frc.team1939.robot.commands.light.TurnOff;
import org.usfirst.frc.team1939.robot.commands.light.TurnOn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick left = new Joystick(0);
	public Joystick right = new Joystick(1);
	{
		JoystickButton lightOn = new JoystickButton(left, 6);
		lightOn.whenPressed(new TurnOn());
		JoystickButton lightOff = new JoystickButton(left, 7);
		lightOff.whenPressed(new TurnOff());
	}
	
}
