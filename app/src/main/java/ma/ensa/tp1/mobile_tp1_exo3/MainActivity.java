package ma.ensa.tp1.mobile_tp1_exo3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button suivant , quiter ;
    private CheckBox check1 , check2 , check3 , check4;
    private RadioButton yes , no ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        suivant = findViewById(R.id.suivant);
        quiter = findViewById(R.id.quiter);



        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);

                check1 = findViewById(R.id.checkBox1);
                check2 = findViewById(R.id.checkBox2);
                check3 = findViewById(R.id.checkBox3);
                check4 = findViewById(R.id.checkBox4);
                yes = findViewById(R.id.yes);
                no = findViewById(R.id.no);


                if(check1.isChecked()){
                    intent.putExtra("check1" , check1.getText());
                }

                if(check2.isChecked()){
                    intent.putExtra("check2" , check2.getText());
                }
                if(check3.isChecked()){
                    intent.putExtra("check3" , check3.getText());
                }
                if(check4.isChecked()){
                    intent.putExtra("check4" , check4.getText());
                }

                if(yes.isChecked()){
                    intent.putExtra("qst2" ,yes.getText());
                }else if (no.isChecked()){
                    intent.putExtra("qst2" ,no.getText());
                }else{
                    intent.putExtra("qst2" ,"Pas de réponse");
                }

                startActivity(intent);
            }
        });

        quiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }



}