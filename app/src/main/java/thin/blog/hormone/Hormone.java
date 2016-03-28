package thin.blog.hormone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Hormone extends AppCompatActivity {
    @Bind(R.id.app_bar)
    android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hormone);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    public void acth(View view) {
        startActivity(new Intent(this, Acth.class));
    }

    public void anp(View view) {
        startActivity(new Intent(this, Anp.class));
    }

    public void crh(View view) {
        startActivity(new Intent(this, Crh.class));
    }

    public void ghrh(View view) {
        startActivity(new Intent(this, Ghrh.class));
    }

    public void cells(View view) {
        startActivity(new Intent(this, Cells.class));
    }

    public void leptin(View view) {
        startActivity(new Intent(this, Leptin.class));
    }

    public void trh(View view) {
        startActivity(new Intent(this, Trh.class));
    }

    public void t3t4(View view) {
        startActivity(new Intent(this, Tthree.class));
    }
}
