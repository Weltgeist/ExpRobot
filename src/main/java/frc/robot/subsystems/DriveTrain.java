// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  // Declare all of our variables

  // Motors
  WPI_TalonFX leftFront;
  WPI_TalonFX rightFront;
  WPI_TalonFX leftRear;
  WPI_TalonFX rightRear;

  // Controllers
  SpeedControllerGroup rightSide;
  SpeedControllerGroup leftSide;

  // Drives
  DifferentialDrive drive;
  
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    // Setup each of the motors for use later
    leftFront = new WPI_TalonFX(Constants.leftFrontCANID);
    rightFront = new WPI_TalonFX(Constants.rightFrontCANID);
    leftRear = new WPI_TalonFX(Constants.leftRearCANID);
    rightRear = new WPI_TalonFX(Constants.rightRearCANID);
    // To reverse motor more easier
    leftFront.setInverted(true);
    rightFront.setInverted(true);
    leftRear.setInverted(true);
    rightRear.setInverted(true);

    // Set-up Controllers for drive modes, group motors for drive

    rightSide = new SpeedControllerGroup(rightFront,rightRear);
    leftSide = new SpeedControllerGroup(leftFront, leftRear);

    // Set Up drives, will control sets of motors.
    drive = new DifferentialDrive(leftSide, rightSide);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

    // Method to control the drive with the controller
  // controller = Input controller
  // speedLimiter = value to limit the speed of the motors
  // if else statement to swap between arcade and tank
  public void driveWithController(XboxController controller, double speedLimiter) {
    if (true) {
      drive.arcadeDrive(controller.getRawAxis(Constants.leftTankAxis) * speedLimiter,
          controller.getRawAxis(Constants.rightArcadeAxis) * speedLimiter);
    } else {
      drive.tankDrive(controller.getRawAxis(Constants.leftTankAxis) * speedLimiter,
          controller.getRawAxis(Constants.rightTankAxis) * speedLimiter);
    }

  }
}
