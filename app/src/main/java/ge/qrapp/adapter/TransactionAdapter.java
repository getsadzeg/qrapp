package ge.qrapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ge.qrapp.R;
import ge.qrapp.model.TransactionsSummary;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

    public void setTransactionsSummary(TransactionsSummary transactionsSummary) {
        this.transactionsSummary = transactionsSummary;
        notifyDataSetChanged();
    }

    public TransactionsSummary transactionsSummary;
    
    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIDforListItem = R.layout.transaction_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIDforListItem, parent, false);
        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        double amount = transactionsSummary.MyOperations.get(position).getAmount();
        String currency = transactionsSummary.MyOperations.get(position).getCcy();
        String dstAcc = transactionsSummary.MyOperations.get(position).getDstAcc();
        String srcAcc = transactionsSummary.MyOperations.get(position).getSrcAcc();
        holder.amount.setText(Double.toString(amount) + " " + currency);
        holder.dstacc.setText(dstAcc);
        holder.srcacc.setText(srcAcc);
    }

    @Override
    public int getItemCount() {
        if(transactionsSummary == null) return 0;
        return transactionsSummary.MyOperations.size();
    }

    public class TransactionViewHolder extends RecyclerView.ViewHolder {
        TextView amount;
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
