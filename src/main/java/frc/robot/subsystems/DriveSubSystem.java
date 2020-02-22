/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveSystemConstants;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
public class DriveSubSystem extends SubsystemBase {
  /**
   * Creates a new DriveSubSystem.
   */

  private final SpeedController leftTalon = new WPI_TalonSRX(DriveSystemConstants.LEFTMOTORID);
  private final SpeedController rightTalon =  new WPI_TalonSRX(DriveSystemConstants.RIGHTMOTORID);

  private final DifferentialDrive m_drive = new DifferentialDrive(leftTalon, rightTalon);

  public DriveSubSystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

 /**
   * Drives the robot using arcade controls.
   *
   * @param fwd the commanded forward movement
   * @param rot the commanded rotation
   */
  public void arcadeDrive(double fwd, double rot) {
    m_drive.arcadeDrive(fwd, rot);
  }
}
