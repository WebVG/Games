using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trix
{
    class Program  // this program should be like two calls.
    {
        static void Main(string[] args)  // call the snow, call the loop or the loop is snow.
        {
            String[] names = new String[6] 
            { "      ▲", "    ▲ ▲", "   ▲   ▲", "  ▲  ▲  ▲", " ▲ ▲   ▲ ▲", "▲ ▲ ▲ ▲ ▲ ▲ " };
            String p0 = names[0]; String p1 = names[1]; String p2 = names[2];
            String p3 = names[3]; String p4 = names[4];
           
            bool toggle = true;
            while (toggle)
            {
                Console.WriteLine(p0 + p1);
            }
            return;
        }
    }
}
   //use a single writeline to print pattern = done
    // make a class that calls a functions, that makes the pattern technicolored and printing discretely.
        // then there will be snow. This could be polymorphism.

        // figure out if you can print a 3d pattern without directX. = wtf is the point.
            // add the chili framwork to an already running project. = cancel
        // can this run with less code, it seems bulky for just printing. = yes it can
            // can i toggle the loop. = very much so
            // where is this program going. could i just print in reverse what i've just printed.
    // the pattern is gonna be broken into a few pieces as an array, it will become the snow.
//   the array i dont believe is just an array it might need to be jagged. 

