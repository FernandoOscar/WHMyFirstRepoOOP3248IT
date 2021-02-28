using System;
using System.Collections.Generic;
using System.Text;
using System.IO;


namespace Prototype_Virtual_ID
{
    class Director
    {
        String career, name, faculty, id, email, address;
        int password = 1234, option, age, phone;

        public void addStudent()
        {

            Console.WriteLine("Enter your password: ");
            password = Convert.ToInt32(Console.ReadLine());

            if (password == 1234)
            {
                Console.WriteLine(" ");
                Console.WriteLine("\t 1. Add Student ");
                Console.WriteLine("\t 2. Exit ");
                option = Convert.ToInt32(Console.ReadLine());

                switch (option)
                {
                    case 1:
                        StreamWriter fichero;
                        fichero = File.AppendText("Requests.csv");
                        Console.WriteLine("Enter the studen´s id: ");
                        id = Console.ReadLine();
                        Console.WriteLine("Enter the student´s name: ");
                        name = Console.ReadLine();
                        Console.WriteLine("Enter the student´s age: ");
                        age = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter the studen´s email: ");
                        email = Console.ReadLine();
                        Console.WriteLine("Enter the astudent´s address: ");
                        address = Console.ReadLine();
                        Console.WriteLine("Enter the student´s phone: ");
                        phone = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter the student´s career: ");
                        career = Console.ReadLine();

                        String information = (id + "," + name + "," + age + "," + email + "," + address + ","
                        + phone + "," + career);

                        fichero.WriteLine(information);
                        fichero.Close();

                        break;
                    case 2:
                        Console.WriteLine("Thanks\n");
                        break;


                }
            }
            else
            {
                Console.WriteLine("Password Incorrect!!");
            }
        }
    }
}