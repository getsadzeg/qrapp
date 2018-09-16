package ge.qrapp.model;

import java.util.List;

public class Account {
    long AcctKey;
    String AcctName;
    String PrintAcctNo;
    List<AvailableAmount> AvailableAmounts;
    String Ccy;
    int OrderNo;
    String ProductCode;
    String Product;
    long MainAcctKey;
    String ProductGroup;
    int ProductId;
    List<SubAccount> SubAccounts;

    public long getAcctKey() {
        return AcctKey;
    }

    public void setAcctKey(long acctKey) {
        AcctKey = acctKey;
    }

    public String getAcctName() {
        return AcctName;
    }

    public void setAcctName(String acctName) {
        AcctName = acctName;
    }

    public String getPrintAcctNo() {
        return PrintAcctNo;
    }

    public void setPrintAcctNo(String printAcctNo) {
        PrintAcctNo = printAcctNo;
    }

    public List<AvailableAmount> getAvailableAmounts() {
        return AvailableAmounts;
    }

    public void setAvailableAmounts(List<AvailableAmount> availableAmounts) {
        AvailableAmounts = availableAmounts;
    }

    public String getCcy() {
        return Ccy;
    }

    public void setCcy(String ccy) {
        Ccy = ccy;
    }

    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int orderNo) {
        OrderNo = orderNo;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public long getMainAcctKey() {
        return MainAcctKey;
    }

    public void setMainAcctKey(long mainAcctKey) {
        MainAcctKey = mainAcctKey;
    }

    public String getProductGroup() {
        return ProductGroup;
    }

    public void setProductGroup(String productGroup) {
        ProductGroup = productGroup;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public List<SubAccount> getSubAccounts() {
        return SubAccounts;
    }

    public void setSubAccounts(List<SubAccount> subAccounts) {
        SubAccounts = subAccounts;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AcctKey=" + AcctKey +
                ", AcctName='" + AcctName + '\'' +
                ", PrintAcctNo='" + PrintAcctNo + '\'' +
                ", AvailableAmounts=" + AvailableAmounts +
                ", Ccy='" + Ccy + '\'' +
                ", OrderNo=" + OrderNo +
                ", ProductCode='" + ProductCode + '\'' +
                ", Product='" + Product + '\'' +
                ", MainAcctKey=" + MainAcctKey +
                ", ProductGroup='" + ProductGroup + '\'' +
                ", ProductId=" + ProductId +
                ", SubAccounts=" + SubAccounts +
                '}';
    }
}
