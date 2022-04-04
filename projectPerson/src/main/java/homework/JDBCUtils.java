package homework;

import java.util.ResourceBundle;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 14:09
 */
public class JDBCUtils {

    public static final String DATABASE_RESOURCE = "lesson_8";
    public static final String URL_KEY = "url";
    public static final String USER_KEY = "username";
    public static final String PASSWORD_KEY = "password";

    private static final ResourceBundle RESOURCE = ResourceBundle.getBundle(DATABASE_RESOURCE);

    public static String getValue(String key) {
        return RESOURCE.getString(key);
    }
}
