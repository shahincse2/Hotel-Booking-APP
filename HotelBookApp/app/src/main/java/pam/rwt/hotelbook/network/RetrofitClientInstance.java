package pam.rwt.hotelbook.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class RetrofitClientInstance {
    public static Retrofit retrofit;
    public static final String BASE_URL="http://192.168.0.124:80/Booking APP/";

    public static Retrofit getRetrofitInstance(){
        Gson gson = new GsonBuilder().setLenient().create();
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.MINUTES).build();
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
