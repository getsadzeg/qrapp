package ge.qrapp.model;

public class Transaction {
    long AcctKey;
    long EntryId;
    String Nomination;
    String EntryGroup;
    String MerchantId;
    long Date;
    double Amount;
    String Ccy;
    String DocNomination;
    String Beneficiary;
    String DstAcc;
    String SrcAcc;
    String MerchantName;
    String MerchantNameInt;
    double AmountBase;
    String EntryGroupName;
    int EntryGroupNameId;
    String ServiceId;

    public String getSrcAcc() {
        return SrcAcc;
    }

    public void setSrcAcc(String srcAcc) {
        SrcAcc = srcAcc;
    }

    public String getDstAcc() {

        return DstAcc;
    }

    public void setDstAcc(String dstAcc) {
        DstAcc = dstAcc;
    }

    public String getCcy() {

        return Ccy;
    }

    public void setCcy(String ccy) {
        Ccy = ccy;
    }

    public double getAmount() {

        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    long PostDate;

    @Override
    public String toString() {
        return "Transaction{" +
                "AcctKey=" + AcctKey +
                ", EntryId=" + EntryId +
                ", Nomination='" + Nomination + '\'' +
                ", EntryGroup='" + EntryGroup + '\'' +
                ", MerchantId='" + MerchantId + '\'' +
                ", Date=" + Date +
                ", Amount=" + Amount +
                ", Ccy='" + Ccy + '\'' +
                ", DocNomination='" + DocNomination + '\'' +
                ", Beneficiary='" + Beneficiary + '\'' +
                ", DstAcc='" + DstAcc + '\'' +
                ", SrcAcc='" + SrcAcc + '\'' +
                ", MerchantName='" + MerchantName + '\'' +
                ", MerchantNameInt='" + MerchantNameInt + '\'' +
                ", AmountBase=" + AmountBase +
                ", EntryGroupName='" + EntryGroupName + '\'' +
                ", EntryGroupNameId=" + EntryGroupNameId +
                ", ServiceId='" + ServiceId + '\'' +
                ", PostDate=" + PostDate +
                '}';
    }
}
