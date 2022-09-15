using System;
using System.Collections.Generic;
using System.Text;

namespace ExProperties
{
    class Rechteck
    {
        private int laenge;
        private int breite;
        public int Flaeche
        {
            get { return laenge * breite; }
        }

        public int Laenge
        {
            get { return laenge; }


            set { laenge = value < 0 ? throw new ArgumentException("Ungültige Länge") : value; }
        }

        public int Breite
        {
            get { return breite; }


            set { breite = value < 0 ? throw new ArgumentException("Ungültige Länge") : value; }
        }
    }
}
