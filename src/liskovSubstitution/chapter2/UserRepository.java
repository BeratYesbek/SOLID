package liskovSubstitution.chapter2;

import liskovSubstitution.chapter2.models.User;

public class UserRepository extends BaseRepository<User> {
    @Override
    protected User create(User entity) {
        return null;
    }

    @Override
    protected User update(User entity) {
        return null;
    }

    public User getByEmail(String email) {
        return new User();
    }
}
