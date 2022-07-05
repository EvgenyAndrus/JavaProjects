public class Main {
    public static void main(String[] args) {
        Day today=Day.SATURDAY;
        System.out.println("Today is "+today);
        System.out.println("-----------------------");
        switch (today){
            case SATURDAY:
                System.out.println("First day of the weekend - SATURDAY");
                break;
            case SUNDAY:
                System.out.println("The last day of the weekend - SUNDAY");
                break;
            default:
                System.out.println("The weekday - "+ today);
        }
        if (today==Day.SATURDAY){
            System.out.println("Finally weekend!");
        }
        System.out.println("--------------------------");
        Company myCompany=Company.SCYNET;
        System.out.println("I work in "+myCompany+" и зарабатываю "+myCompany.getValue()+ "$ в месяц");
        System.out.println("--------------------------");

        Company myCo=Company.GOOGLE;
        System.out.println(myCo);
        int salary=myCo.getValue();
        String currency=myCo.getCurrency();
        System.out.println("я зарабатываю "+salary+" "+currency+" в месяц");
    }
}