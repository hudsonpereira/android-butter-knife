package br.com.hudsonpereira.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.hudsonpereira.butterknifeexample.pojo.User;
import br.com.hudsonpereira.butterknifeexample.ui.UsersAdapter;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.hello_world)
    TextView helloWorldTextView;

    @BindView(R.id.users_recycler_view)
    RecyclerView usersRecyclerView;

    @BindString(R.string.new_string)
    String newString;

    private List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        helloWorldTextView.setText(newString);

        users = new ArrayList<>();

        users.add(new User("Hudson", "https://randomuser.me/api/portraits/men/31.jpg"));
        users.add(new User("Luan", "https://randomuser.me/api/portraits/men/10.jpg"));
        users.add(new User("Mateus", "https://randomuser.me/api/portraits/men/21.jpg"));
        users.add(new User("Lucas", "https://randomuser.me/api/portraits/men/32.jpg"));
        users.add(new User("Diego", "https://randomuser.me/api/portraits/men/41.jpg"));
        users.add(new User("Marcelo", "https://randomuser.me/api/portraits/men/22.jpg"));

        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        usersRecyclerView.setAdapter(new UsersAdapter(this, users));
    }
}
