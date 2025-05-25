package crud;

import java.util.ArrayList;

public class UserDAO {
    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    public static boolean updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                return true;
            }
        }
        return false;
    }

    public static boolean deleteUser(int id) {
        return users.removeIf(u -> u.getId() == id);
    }

    public static ArrayList<User> getAllUsers() {
        return users;
    }
}

