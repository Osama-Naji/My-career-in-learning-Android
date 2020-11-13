package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.books.Info;
import com.app.books.R;

import java.util.List;

import Model.ListItem;

public class Books_Adapter extends RecyclerView.Adapter<Books_Adapter.viewHolder> {

    private Context contexts;
    List<ListItem> listItems;
    public Books_Adapter(Context context, List listItem) {
        this.contexts = context;
        this.listItems = listItem;
    }

    @NonNull
    @Override
    public Books_Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_books_rows,parent,false);

        return new viewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ListItem item = listItems.get(position);
        holder.Title.setText(item.getTitle());
        holder.Gerne.setText(item.getGerne());
        holder.Year.setText(item.getYear());
holder.imageView.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Title;
        TextView Gerne;
        TextView Year;
        ImageView imageView;
LinearLayout linearLayout_hore;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.TiltleID);
            Gerne = itemView.findViewById(R.id.GerneID);
            Year  = itemView.findViewById(R.id.YearID);
            imageView = itemView.findViewById(R.id.imageView2);
            linearLayout_hore = itemView.findViewById(R.id.LinerLayoutID);

linearLayout_hore.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            ListItem item = listItems.get(position);

            Intent Trans = new Intent(contexts, Info.class);
            Trans.putExtra("title",item.getTitle());
            Trans.putExtra("year",item.getYear());
            Trans.putExtra("gerne",item.getGerne());
            Trans.putExtra("image",item.getImage());

            contexts.startActivity(Trans);

        }
    }
}
