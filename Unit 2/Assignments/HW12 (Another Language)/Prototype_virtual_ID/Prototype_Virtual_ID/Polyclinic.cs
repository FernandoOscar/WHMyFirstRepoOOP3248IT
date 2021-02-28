using System;

namespace Prototype_Virtual_ID
{
    class Polyclinic
    {
        int virtualid, option, option2, n;
        Boolean qrcode;
        String general, reason, medicine, expiration;



        public void attendStudent()
        {
            do
                {
                    Console.WriteLine("How much medication do you need: ");
                    n = Convert.ToInt32(Console.ReadLine());


                    } while (n<0);

                    
                    for (int i=0; i<n; i++)
                    {
                        Console.WriteLine("Enter the medicine you need: ");
                        medicine = Console.ReadLine();

                        Console.WriteLine("Enter the expiration date: ");
                        expiration = Console.ReadLine();

                        Console.WriteLine("The medicine you admitted is: " + medicine +
                            " and should be taken before " + expiration);
                    }
                
            }

        }
    }

