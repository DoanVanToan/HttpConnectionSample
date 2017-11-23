package todo.toandoan.com.httpconnectionsample.data.source.remote;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import todo.toandoan.com.httpconnectionsample.data.model.User;
import todo.toandoan.com.httpconnectionsample.data.source.UserDataSource;
import todo.toandoan.com.httpconnectionsample.utils.Constant;

public class UserRemoteDataSource implements UserDataSource {
    private static final String TAG = "UserRemoteDataSource";

    @Override
    public void getUser(String userName, final Callback<User> callback) {
        String url = Constant.END_POINT + userName;
        new LoadDataAsync(new Callback<String>() {
            @Override
            public void onStartLoading() {
                callback.onStartLoading();
            }

            @Override
            public void onGetSuccess(String data) {
                try {
                    Log.d(TAG, "onGetSuccess: " + data);
                    if (data == null) {
                        callback.onGetFailure("Cannot find user");
                        return;
                    }
                    JSONObject jsonObject = new JSONObject(data);
                    callback.onGetSuccess(new User(jsonObject));
                } catch (JSONException e) {
                    callback.onGetFailure(e.getMessage());
                }
            }

            @Override
            public void onGetFailure(String message) {
                callback.onGetFailure(message);
            }

            @Override
            public void onComplete() {
                callback.onComplete();
            }
        }).execute(url);
    }
}
