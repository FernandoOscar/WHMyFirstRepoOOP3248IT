using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace Prototype_Virtual_ID
{

    class Student
    {
        String id, name, email, address, career;
        int age, phone;

        public void enterData()
        {
            StreamWriter fichero;
            fichero = File.AppendText("StudentInformation.csv");

            Console.WriteLine("Enter your ID: ");
            id = Console.ReadLine();
            Console.WriteLine("Enter your Name: ");
            name = Console.ReadLine();
            Console.WriteLine("Enter your Age: ");
            age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter your email: ");
            email = Console.ReadLine();
            Console.WriteLine("Enter your addrees");
            address = Console.ReadLine();
            Console.WriteLine("Enter your Phone");
            phone = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter your Career");
            career = Console.ReadLine();


            String information = (id + "," + name + "," + age + "," + email + "," + address + ","
                        + phone + "," + career+"\n\n");

            fichero.WriteLine(information);
            fichero.Close();

        }



    }
}
