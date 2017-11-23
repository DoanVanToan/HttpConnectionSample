package todo.toandoan.com.httpconnectionsample.data.source;

import todo.toandoan.com.httpconnectionsample.data.model.User;

public class UserRepository implements UserDataSource {
    private UserDataSource mLocalDataSource;

    public UserRepository(UserDataSource localDataSource) {
        mLocalDataSource = localDataSource;
    }

    @Override
    public void getUser(String userName, Callback<User> callback) {
        mLocalDataSource.getUser(userName, callback);
    }
}
