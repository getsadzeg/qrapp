package ge.qrapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ge.qrapp.R;
import ge.qrapp.activity.MainActivity;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIDforListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;
        View view = inflater.inflate(layoutIDforListItem, parent, shouldAttachToParentImmediately);
        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        double amount = MainActivity.transactionsSummary.MyOperations.get(position).getAmount();
        String currency = MainActivity.transactionsSummary.MyOperations.get(position).getCcy();
        String dstAcc = MainActivity.transactionsSummary.MyOperations.get(position).getDstAcc();
        String srcAcc = MainActivity.transactionsSummary.MyOperations.get(position).getSrcAcc();
        holder.amount.setText(Double.toString(amount) + " " + currency);
        holder.dstacc.setText(dstAcc);
        holder.srcacc.setText(srcAcc);
    }

    @Override
    public int getItemCount() {
        if(MainActivity.transactionsSummary == null) return 0;
        return MainActivity.transactionsSummary.MyOperations.size();
    }

    public class TransactionViewHolder extends RecyclerView.ViewHolder {
        TextView amount;
        TextView currency;
        TextView dstacc;
        TextView srcacc;

        public TransactionViewHolder(@NonNull View itemView) {
            super(itemView);
            amount = itemView.findViewById(R.id.amountplusccy);
            dstacc = itemView.findViewById(R.id.dstacc);
            srcacc = itemView.findViewById(R.id.srcacc);
        }
    }
}
