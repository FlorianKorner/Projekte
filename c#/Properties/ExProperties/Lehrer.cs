using System;
using System.Collections.Generic;
using System.Text;

namespace ExProperties
{
    class Lehrer
    {
        
        private decimal? bruttogehalt;

        

        public string Vorname { get; set; } = "";
        public string Zuname { get; set; }

        public decimal? Bruttogehalt
        {
            get { return bruttogehalt; }
            set
            {
                bruttogehalt = Bruttogehalt.HasValue ? Bruttogehalt : value;
            }
        }

        public string Kuerzel
        {
            get
            {
                return Zuname == null ? "" : (Zuname.ToUpper()).Substring(0,3); 
            }
        }

        public decimal Nettogehalt
        {
            get
            {
                return 0.8M * (Bruttogehalt ?? 0);
            }
        }
    }
}
