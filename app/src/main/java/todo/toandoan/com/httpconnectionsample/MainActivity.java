package todo.toandoan.com.httpconnectionsample;

import android.app.ProgressDialog;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import todo.toandoan.com.httpconnectionsample.data.model.User;
import todo.toandoan.com.httpconnectionsample.data.source.UserDataSource;
import todo.toandoan.com.httpconnectionsample.data.source.UserRepository;
import todo.toandoan.com.httpconnectionsample.data.source.remote.UserRemoteDataSource;
import todo.toandoan.com.httpconnectionsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
    implements SearchView.OnQueryTextListener, UserDataSource.Callback<User> {
    private UserRepository mRepository;
    private ProgressDialog mDialog;
    private ObservableField<User> mUser = new ObservableField<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
        mDialog = new ProgressDialog(this);
        mDialog.setMessage("Loading...");
        mRepository = new UserRepository(new UserRemoteDataSource());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem item = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        mRepository.getUser(query, this);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return true;
    }

    @Override
    public void onGetSuccess(User data) {
        mUser.set(data);
    }

    @Override
    public void onStartLoading() {
        mDialog.show();
    }

    @Override
    public void onGetFailure(String message) {
         Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onComplete() {
        mDialog.dismiss();
    }

    public ObservableField<User> getUser() {
        return mUser;
    }

    public void setUser(ObservableField<User> user) {
        mUser = user;
    }
}
