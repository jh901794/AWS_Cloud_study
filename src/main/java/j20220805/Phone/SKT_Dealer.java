package j20220805.Phone;

public abstract class SKT_Dealer extends NewsAgenct_Factory {
    @Override
    public void NewsAgency(String newsagency) {
        System.out.println("SKTDeal : " + newsagency);
    }
}
