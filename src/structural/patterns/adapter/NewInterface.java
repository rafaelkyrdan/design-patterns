package structural.patterns.adapter;

/**
 * It is a new interface which we should implement in our project, according to new requirements.
 */

public interface NewInterface {

    public String getCustCardNo();

    public String getCardOwnerName();

    public String getCardExpMonthDate();

    public Integer getCVVNo();

    public Double getTotalAmount();

    public void setCustCardNo(String custCardNo);

    public void setCardOwnerName(String cardOwnerName);

    public void setCardExpMonthDate(String cardExpMonthDate);

    public void setCVVNo(Integer cVVNo);

    public void setTotalAmount(Double totalAmount);

}
