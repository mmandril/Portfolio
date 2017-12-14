package nanodegree.marcussouza.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPopular;
    private Button btnStock;
    private Button btnBuild;
    private Button btnMake;
    private Button btnGo;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initClickListeners();
    }

    private void initViews() {
        btnPopular = findViewById(R.id.activity_main_button_movies);
        btnStock = findViewById(R.id.activity_main_button_stock);
        btnBuild = findViewById(R.id.activity_main_button_build);
        btnMake = findViewById(R.id.activity_main_button_make);
        btnGo = findViewById(R.id.activity_main_button_go);
        btnCapstone = findViewById(R.id.activity_main_button_capstone);
    }

    private void initClickListeners() {
        btnPopular.setOnClickListener(this);
        btnStock.setOnClickListener(this);
        btnBuild.setOnClickListener(this);
        btnMake.setOnClickListener(this);
        btnGo.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity_main_button_movies:
                showToastMessage(getString(R.string.popular_movies));
                break;
            case R.id.activity_main_button_stock:
                showToastMessage(getString(R.string.stock_hawk));
                break;
            case R.id.activity_main_button_build:
                showToastMessage(getString(R.string.build_bigger));
                break;
            case R.id.activity_main_button_make:
                showToastMessage(getString(R.string.make_material));
                break;
            case R.id.activity_main_button_go:
                showToastMessage(getString(R.string.go_ubiquitous));
                break;
            case R.id.activity_main_button_capstone:
                showToastMessage(getString(R.string.capstone));
                break;
            default:
                break;
        }
    }

    private void showToastMessage(String message) {
        Toast.makeText(this, getString(R.string.click_message, message), Toast.LENGTH_LONG).show();
    }
}
