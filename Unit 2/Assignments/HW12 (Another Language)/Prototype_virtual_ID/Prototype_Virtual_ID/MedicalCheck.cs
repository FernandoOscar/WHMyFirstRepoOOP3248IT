using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace Prototype_Virtual_ID
{
    class MedicalCheck
    {
        String date, time, appo;

        public void addAppointment()
        {
            StreamWriter fichero;
            fichero = File.AppendText("Appoinment.csv");

            Console.WriteLine("For what day do you need the appointment? ");
            Console.WriteLine("Enter date in format dd/mm/yyyy: ");
            date = Console.ReadLine();
            Console.WriteLine("What time do you need the appointment? ");
            Console.WriteLine("Enter time in format hh:mm: ");
            time = Console.ReadLine();

            Console.WriteLine("Appointment scheduled for " + date + " at " + time + " hours");

            appo = (date + "," + time);
            fichero.WriteLine(appo);
            fichero.Close();

        }
    }
}




