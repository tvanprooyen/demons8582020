/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Sparks;


public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Joystfeick m_leftStick;
  private Joystick m_righftStick;
  private Spark m_leftMotor = new Spark(0);
  private Spark m_rightMotor = new Spark(1);
  

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    m_myRobot = new DifferentialDrive(m_leftMotor, m_rightMotor);
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);

  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPesriodic() {
    m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
  }
}
