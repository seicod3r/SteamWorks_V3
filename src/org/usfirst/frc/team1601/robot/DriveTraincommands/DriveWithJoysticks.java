package org.usfirst.frc.team1601.robot.DriveTraincommands;

import org.usfirst.frc.team1601.robot.Robot;
import org.usfirst.frc.team1601.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoysticks extends Command {
	double speedLimit = RobotMap.speedLow;

	public DriveWithJoysticks() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		
		if (Robot.oi.driverL.getRawButton(1) && Robot.oi.driverR.getRawButton(1)) {
			speedLimit = RobotMap.speedHigh;
		} else if (Robot.driveTrain.getDriveTrainSpeed() == .3) {
			speedLimit = RobotMap.speedMed;
		} else {
			speedLimit = RobotMap.speedLow;
		}
		
		Robot.driveTrain.drive(Robot.oi.driverL.getRawAxis(2) * speedLimit,
				Robot.oi.driverR.getRawAxis(2) * speedLimit);
		
		Robot.driveTrain.collisionDetection();

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.driveTrain.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {

	}
}