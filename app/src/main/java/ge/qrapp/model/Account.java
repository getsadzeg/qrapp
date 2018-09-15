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
