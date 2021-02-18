// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Drivetrain motors
    public static final int leftFrontCANID = 11;
	public static final int rightFrontCANID = 12;
	public static final int leftRearCANID = 13;
    public static final int rightRearCANID = 14;
    
    //Controller Drive Axis
	public static final int leftTankAxis = 1;
	public static final int rightArcadeAxis = 5;
    public static final int rightTankAxis = 4;
    
    //Xbox USB Port
	public static final int xboxControllerPort = 0;
}
