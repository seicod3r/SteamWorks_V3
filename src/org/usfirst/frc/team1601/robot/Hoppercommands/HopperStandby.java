package org.usfirst.frc.team1601.robot.Hoppercommands;

import org.usfirst.frc.team1601.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class HopperStandby extends Command {

    public HopperStandby() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.claw.stop();
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
