package kr.acw.examples.mydb;

import android.os.Bundle;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BottomAppBar appBar = findViewById(R.id.bottom_app_bar);
//        appBar.replaceMenu(R.menu.bottom_nav_drawer_menu);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (appBar.getFabAlignmentMode() == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER) {
                    appBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
                } else {
                    appBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
                }
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        setSupportActionBar(appBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bottom_nav_drawer_menu, menu);
        return true;
    }
//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.app_bar_fav) {
            Toast.makeText(getApplicationContext(), "Fav menu item is clicked!", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.app_bar_search) {
            Toast.makeText(getApplicationContext(), "Search menu item is clicked!", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.app_bar_settings) {
            Toast.makeText(getApplicationContext(), "Settings menu item is clicked!", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == android.R.id.home) {
            Toast.makeText(getApplicationContext(), "Home menu item is clicked!", Toast.LENGTH_LONG).show();
            MenuDialogFragment fragment = new MenuDialogFragment();
            fragment.show(getSupportFragmentManager(), fragment.getTag());
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
