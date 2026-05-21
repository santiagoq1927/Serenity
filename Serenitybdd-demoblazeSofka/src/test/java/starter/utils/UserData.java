package starter.utils;

import net.datafaker.Faker;

public class UserData {

    private static final Faker faker = new Faker();
    
    public static String getName() {
        return faker.name().fullName();
    }

    public static String getCountry() {
        return faker.country().name();
    }

    public static String getCity() {
        return faker.address().city();
    }
    
    public static String getCardNumber() {
        return faker.finance().creditCard();
    }
    
    public static String getMonth() {
        return String.format("%02d", faker.number().numberBetween(1, 12));
    }

    public static String getYear() {
        return String.valueOf(faker.number().numberBetween(2024, 2031));
    }

}
