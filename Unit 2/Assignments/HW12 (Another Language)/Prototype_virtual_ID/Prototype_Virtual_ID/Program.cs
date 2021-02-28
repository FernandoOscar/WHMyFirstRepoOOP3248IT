using System;

namespace Prototype_Virtual_ID
{
    class Program
    {       

        static void Main(string[] args)
        {

            Boolean exit = false;
            int option;

            Console.WriteLine("=================================");
            Console.WriteLine("Welcome to the Virtual ID System");
            Console.WriteLine("=================================");

            while (!exit)
            {

                Console.WriteLine("1) Login as Student");
                Console.WriteLine("2) Login as Director");
                option = Convert.ToInt32(Console.ReadLine());

                switch (option)
                {

                    case 1:
                        menu();
                        break;

                    case 2:
                        Director dir = new Director();
                        dir.addStudent();
                        break;

                    default:
                        Console.WriteLine("Only numbers between 1-3\n");
                        break;

                }

            }

        }

        public static void menu()
        {
            int option1;

            Console.WriteLine("\t1) Request Id");
            Console.WriteLine("\t2) Request Attention at Polyclinic");
            Console.WriteLine("\t3) Exit");
            option1 = Convert.ToInt32(Console.ReadLine());

            switch (option1)
            {
                case 1:
                    Student stu = new Student();
                    stu.enterData();
                    menu();
                    break;

                case 2:
                    attendeStudent();
                    menu();
                    break;

                case 3:

                    break;

            }
        }

        public static void attendeStudent()
        {
            int option2;

            Console.WriteLine("\n\t==============================");
            Console.WriteLine("\tWELCOME AT POLICLYNIC");
            Console.WriteLine("\t==============================");

            Console.WriteLine("1. Add Appoinment");
            Console.WriteLine("2. Attend Student");
            Console.WriteLine("3. Exit");
            option2 = Convert.ToInt32(Console.ReadLine());

            switch (option2)
            {
                case 1:
                    MedicalCheck appo = new MedicalCheck();
                    appo.addAppointment();
                    attendeStudent();
                    break;

                case 2:
                    Console.WriteLine(" What are should it be understood?");
                    Console.WriteLine("1. General Medicine");

                    option2 = Convert.ToInt32(Console.ReadLine());

                    switch (option2)
                    {
                        case 1:
                            String reason;
                            
                            Console.WriteLine("");
                            Console.WriteLine("What is the reason for you visit?");
                            reason = Console.ReadLine();

                            Console.WriteLine("Prescribe a medicine for the patient");
                            Console.WriteLine("\n");
                            Console.WriteLine("----Available Medicines");
                            Console.WriteLine("======================================");
                            Console.WriteLine("Paracetamol \nOmeprazole \nSimvastatina \nAspirin");
                            Console.WriteLine("");
                            Polyclinic pol = new Polyclinic();
                            pol.attendStudent();
                            Console.WriteLine("\n\n");
                            break;

                    }
                    attendeStudent();


                            break;
                case 3:
                    Console.WriteLine("Thanks for coming\n");
                    break;
            }

        }
























    }

}
