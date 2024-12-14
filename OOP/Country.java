class Country {
    String name;
    String capital;
    String population;
    String language;
    String currency;

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
        System.out.println("Name:"+pakistan.name);
        System.out.println("Capital:"+pakistan.capital);
        System.out.println("Population:"+pakistan.population);
        System.out.println("Language:"+pakistan.language);
        System.out.println("Currency:"+pakistan.currency);

        System.out.println("");
        System.out.println("Name:"+india.name);
        System.out.println("Capital:"+india.capital);
        System.out.println("Population:"+india.population);
        System.out.println("Language:"+india.language);
        System.out.println("Currency:"+india.currency);

        System.out.println("");
        System.out.println("Name:"+afghanistan.name);
        System.out.println("Capital:"+afghanistan.capital);
        System.out.println("Population:"+afghanistan.population);
        System.out.println("Language:"+afghanistan.language);
        System.out.println("Currency:"+afghanistan.currency);

        System.out.println("");
        System.out.println("Name:"+bangladesh.name);
        System.out.println("Capital:"+bangladesh.capital);
        System.out.println("Population:"+bangladesh.population);
        System.out.println("Language:"+bangladesh.language);
        System.out.println("Currency:"+bangladesh.currency);

        System.out.println("");
        System.out.println("Name:"+china.name);
        System.out.println("Capital:"+china.capital);
        System.out.println("Population:"+china.population);
        System.out.println("Language:"+china.language);
        System.out.println("Currency:"+china.currency);




    }
}