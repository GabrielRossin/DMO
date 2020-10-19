
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

import br.edu.ifsp.arq.projeto_gabrielrossin_dmos5.HarryPotterNome;
import br.edu.ifsp.arq.projeto_gabrielrossin_dmos5.R;
import br.edu.ifsp.arq.projeto_gabrielrossin_dmos5.Retrofit1;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String KEYID = "$2a$10$xuATSMPLPuEfVZog1VN8eOmJFAWX7t6cm1MbCRtWQqTLI9aS2hB4a";
    public static final String BASE_URL = "https://www.potterapi.com/v1/";

    private EditText nomeEdit;
    private Button botaoBuscar;

    Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLayout();

    }

    @Override
    public void onClick(View v) {
        if(v.equals(botaoBuscar)){
            getResquest();
        }
    }

    private void getResquest(){
        mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        Retrofit1 service = mRetrofit.create(Retrofit1.class);
        String nome = nomeEdit.getText().toString();

        Call<HarryPotterNome> requestWeather = service.getNames(nome);

        requestWeather.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if(!response.isSuccessful()){
                    Log.i("DEU RUIM", "ERRO: " + response.code()  );
                }
                WeatherResponse map = response.body();
                updateUI(map);
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                Log.i("ONFAILURE", "ERRO: "   );
            }
        });

    }

    private void setLayout(){
        nomeEdit = findViewById(R.id.Editnome);
        botaoBuscar = findViewById(R.id.buttonBusca);
        botaoBuscar.setOnClickListener(this);

    }

    private void updateUI(WeatherResponse map){
        tempTextView.setText(map.getMain().getTemp().toString());
        tempMinTextView.setText(map.getMain().getTempMin().toString());
        tempMaxTextView.setText(map.getMain().getTempMax().toString());
    }

}