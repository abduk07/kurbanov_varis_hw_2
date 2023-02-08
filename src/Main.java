

public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(7, 30));
        System.out.println(ageAndTemperature(12, 21));
        System.out.println(ageAndTemperature(getRAndomage(), 15));
        System.out.println(ageAndTemperature(getRAndomage(), 0));
        System.out.println(ageAndTemperature(getRAndomage(), -25));
    }

    public static String ageAndTemperature(int age, double temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age > 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }

    public static int getRAndomage() {

        int age = 1 + ((int) (Math.random() * 100));
        return age;
    }


}

