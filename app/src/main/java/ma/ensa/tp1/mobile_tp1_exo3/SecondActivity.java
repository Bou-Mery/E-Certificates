package ma.ensa.tp1.mobile_tp1_exo3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private TextView userRsp1 , userRsp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        userRsp1 = findViewById(R.id.userRsp1);
        userRsp2 = findViewById(R.id.userRsp2);
        String res = "1.";
        if(this.getIntent().getStringExtra("check1") != null){
            res+=this.getIntent().getStringExtra("check1");
        }

        if(this.getIntent().getStringExtra("check2") != null){
            res+="\n   "+this.getIntent().getStringExtra("check2");
        }

        if(this.getIntent().getStringExtra("check3") != null){
            res+="\n   "+this.getIntent().getStringExtra("check3");
        }

        if(this.getIntent().getStringExtra("check4") != null){
            res+= "\n   " +this.getIntent().getStringExtra("check4");
        }

        userRsp1.setText(res);
        String res2 ="2."+this.getIntent().getStringExtra("qst2");
        userRsp2.setText(res2);




    }
}