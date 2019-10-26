package here.com;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends ListActivity {

    final String[] catNamesArray = new String[] { "Eat", "Sport", "Art", "Music/Films", "Science", "Education", ""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
