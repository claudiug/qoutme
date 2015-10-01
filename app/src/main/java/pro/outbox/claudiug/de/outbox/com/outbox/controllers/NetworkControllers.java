package pro.outbox.claudiug.de.outbox.com.outbox.controllers;

import java.util.List;

import pro.outbox.claudiug.de.outbox.com.outbox.models.Network;
import pro.outbox.claudiug.de.outbox.com.outbox.service.INetworkService;
import retrofit.Call;
import retrofit.Callback;
import retrofit.JacksonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by claudiug on 10/1/15.
 */
public class NetworkControllers {
    private static final String BASE_URL = "https://api-beta.outbox.pro/";

    public static List<Network> listNetwork () {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        INetworkService service = retrofit.create(INetworkService.class);

        Call<Network> networkCall = service.listConnections("");

        networkCall.enqueue(new Callback<Network>() {
            @Override
            public void onResponse(Response<Network> response, Retrofit retrofit) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

        return null;
    }
}
