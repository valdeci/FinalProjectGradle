package br.com.valdecipedroso.jokeandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class LibraryMainActivity extends AppCompatActivity {

    private static final String EXTRA_JOKE = "EXTRA_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView mTvJoke = findViewById(R.id.tv_joke);


        if(getIntent() != null){
            if(getIntent().getExtras()!= null){
                Bundle b = getIntent().getExtras();
                mTvJoke.setText(b.getString(EXTRA_JOKE));
            }
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
