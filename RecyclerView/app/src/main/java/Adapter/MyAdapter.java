package Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.recyclerview.Info;
import com.apps.recyclerview.MainActivity;
import com.apps.recyclerview.R;

import java.util.List;

import Model.listitem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {

    private Context contexts;
    List<listitem> listItems;
    public MyAdapter(Context context, List listItem) {
        this.contexts = context;
        this.listItems = listItem;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
listitem item = listItems.get(position);
        holder.name.setText(item.getName());
        holder.Description.setText(item.getDescription());
        holder.Age.setText(item.getAge());

    }

    @Override
    public int getItemCount()
    {

        return listItems.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        TextView Description;
        TextView Age;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.titles);
            Description = itemView.findViewById(R.id.Details);
            Age  = itemView.findViewById(R.id.AgeID);




        }

        @Override
        public void onClick(View v) {


int position = getAdapterPosition();
 listitem item = listItems.get(position);
            Toast.makeText(contexts,item.getName(),Toast.LENGTH_SHORT).show();

            Intent toDetails = new Intent(contexts,Info.class);
            toDetails.putExtra("name",item.getName());
            toDetails.putExtra("Description",item.getDescription());
            toDetails.putExtra("Age",item.getAge());

           contexts.startActivity(toDetails);

        }
    }
}
