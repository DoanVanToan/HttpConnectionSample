package todo.toandoan.com.httpconnectionsample.data.source;

import todo.toandoan.com.httpconnectionsample.data.model.User;

public interface UserDataSource {
    interface Callback<T> {
        void onStartLoading();
        void onGetSuccess(T data);
        void onGetFailure(String message);
        void onComplete();
    }

    void getUser(String userName, Callback<User> callback);
}
