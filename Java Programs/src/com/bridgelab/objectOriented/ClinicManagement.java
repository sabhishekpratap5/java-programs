/******************************************************************************
 *  Purpose: Clinic Management program
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;

import java.util.Scanner;

import com.bridgelab.utility.Appointment;
import com.bridgelab.utility.ClinicUtility;
import com.bridgelab.utility.Utility;
public class ClinicManagement 
{
	public static void main(String[] args) 
	{
		try
		{
			Appointment a = new Appointment();
			ClinicUtility u = new ClinicUtility();
			Scanner scan = new Scanner(System.in);
			while(true)
			{	
				System.out.println("Enter your choice:");
				System.out.println("1. Add Doctor.");
				System.out.println("2. Add Patient.");
				System.out.println("3. Display Details.");
				System.out.println("4. Fix Appointments.");
				System.out.println("5. Appointment Details.");
				System.out.println("6. Exit");
				int choice = scan.nextInt();
				switch(choice)
				{
				case 1 :	 ClinicUtility.addDoctor();
				break;
				case 2 :	ClinicUtility.addPatient();
				break;
				case 3 :	 System.out.println("Enter whose details you want to see press D for doctor and P for Patient ");
				char ch = scan.next().charAt(0);
				if(ch=='D')
				{
					ClinicUtility.doctorsDetails();
				}
				if(ch=='P')
				{
					ClinicUtility.patientDetails();
				}
				break;
				case 5 	:	u.appointmentDetails();
				break;
				case 4: 	a.fixAppointment();
				break;
				default : return;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
