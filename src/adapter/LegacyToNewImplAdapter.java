package adapter;

/**
 * It is our adapter which comes to rescue our case.
 * The class implements NewInterface, and store the adaptee - legacy implementation.
 */

public class LegacyToNewImplAdapter implements NewInterface {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    //it is our Adaptee - legacy code
    private final LegacyInterface legacyObject;

    public LegacyToNewImplAdapter(LegacyInterface legacyObject) {
        this.legacyObject = legacyObject;
        setProp();
    }

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setProp() {
        setCardOwnerName(this.legacyObject.getCustomerName());
        setCustCardNo(this.legacyObject.getCreditCardNo());
        setCardExpMonthDate(this.legacyObject.getCardExpMonth() + "/" + this.legacyObject.getCardExpYear());
        setCVVNo(this.legacyObject.getCardCVVNo().intValue());
        setTotalAmount(this.legacyObject.getAmount());
    }

}
