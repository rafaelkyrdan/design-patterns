package structural.patterns.adapter;

/**
 * It is working example.
 * In this example we successfully re-use legacy code and then proceed with new functionality.
 */

public class AdapterExample {

    public static void main(String[] args) {


        LegacyInterface legacyObject = new LegacyImpl();
        legacyObject.setCreditCardNo("47457421312356858");
        legacyObject.setCustomerName("Garry Potter");
        legacyObject.setCardExpMonth("06");
        legacyObject.setCardExpYear("18");
        legacyObject.setCardCVVNo((short) 132);
        legacyObject.setAmount(123456.23);

        NewInterface newObject = new LegacyToNewImplAdapter(legacyObject);
        testNewObject(newObject);
    }

    private static void testNewObject(NewInterface newObject) {

        System.out.println(newObject.getCardOwnerName());
        System.out.println(newObject.getCustCardNo());
        System.out.println(newObject.getCardExpMonthDate());
        System.out.println(newObject.getCVVNo());
        System.out.println(newObject.getTotalAmount());
    }
}
