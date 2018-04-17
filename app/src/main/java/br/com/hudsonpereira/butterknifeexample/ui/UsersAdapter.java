package br.com.hudsonpereira.butterknifeexample.ui;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.hudsonpereira.butterknifeexample.R;
import br.com.hudsonpereira.butterknifeexample.pojo.User;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hudson on 17/04/18.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewHolder> {

    private Context context;
    private List<User> users;

    public UsersAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    @Override
    public UsersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UsersViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(UsersViewHolder holder, int position) {
        User user = users.get(position);

        holder.listTextView.setText(user.getName());

        Picasso.get().load(user.getImageUrl()).into(holder.listImageView);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UsersViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.list_text)
        TextView listTextView;

        @BindView(R.id.list_image)
        ImageView listImageView;

        UsersViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
