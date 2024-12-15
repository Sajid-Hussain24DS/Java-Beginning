class CountryMethodCall {
    String name;
    String capital;
    String population;
    String language;
    String currency;

 public void printCountryDetails() {
        System.out.println("Name: " + name);
        System.out.println("Capital: " + capital);
        System.out.println("Population: " + population);
        System.out.println("Language: " + language);
        System.out.println("Currency: " + currency);
        System.out.println();
    }


    public static void main(String args[]){
        Country pakistan = new Country();
        pakistan.name = "Pakistan:";
        pakistan.capital = "Islamabad:";
        pakistan.population = "252,987,407";
        pakistan.language = "Urdu";
        pakistan.currency = "Pakistan rupee";

        Country india = new Country();
        india.name = "India";
        india.capital = "New Delhi";
        india.population = "1.384 Billion";
        india.language = "Hindi";
        india.currency = "Indian rupee";

        Country afghanistan = new Country();
        afghanistan.name = "Afghanistan";
        afghanistan.capital = "Kabul";
        afghanistan.population = "40.2 Million";
        afghanistan.language = "Pashto";
        afghanistan.currency = "Afghan Afghani";

        Country bangladesh = new Country();
        bangladesh.name = "Bangladesh";
        bangladesh.capital = "Dhaka";
        bangladesh.population = "20 Million";
        bangladesh.language = "Bangali";
        bangladesh.currency = "Bangladeshi taka";

      Country china = new Country();
      china.name = "China";
      china.capital = "Beijing";
      china.population = "1.439 Billion";
      china.language = "Mandarin Chinese";
      china.currency = "Renminbi";

        System.out.println("<<Country>>>");
        pakistan.printCountryDetails();
        india.printCountryDetails();
        afghanistan.printCountryDetails();
        bangladesh.printCountryDetails();
        china.printCountryDetails();
    }
}

       