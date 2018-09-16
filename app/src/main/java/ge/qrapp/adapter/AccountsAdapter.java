package ge.qrapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ge.qrapp.R;

import static ge.qrapp.activity.AccountsActivity.accounts;

public class AccountsAdapter extends RecyclerView.Adapter<AccountsAdapter.AccountsViewHolder> {

    @NonNull
    @Override
    public AccountsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdforItem = R.layout.accounts_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdforItem, parent, false);
        return new AccountsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountsViewHolder holder, int position) {
        String acctName = accounts.get(position).getAcctName();
        String acctNo = accounts.get(position).getPrintAcctNo();
        String availableAmounts = accounts.get(position).getAvailableAmounts().toString();
        String ccy = accounts.get(position).getCcy();
        holder.account.setText(acctName + ", " + acctNo);
        holder.availableAmounts.append(availableAmounts);
        holder.ccy.setText(ccy);
    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }

    public class AccountsViewHolder extends RecyclerView.ViewHolder {

        TextView account;
        TextView availableAmounts;
        TextView ccy;

        public AccountsViewHolder(@NonNull View itemView) {
            super(itemView);
            account = itemView.findViewById(R.id.accnameplusno);
            availableAmounts = itemView.findViewById(R.id.availableamounts);
            ccy = itemView.findViewById(R.id.ccy);
        }
    }
}
