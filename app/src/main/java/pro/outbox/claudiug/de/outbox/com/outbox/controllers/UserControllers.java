package pro.outbox.claudiug.de.outbox.com.outbox.controllers;

import pro.outbox.claudiug.de.outbox.com.outbox.models.User;
import pro.outbox.claudiug.de.outbox.com.outbox.service.IUserService;
import retrofit.Call;
import retrofit.Callback;
import retrofit.JacksonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by claudiug on 10/1/15.
 */
public class UserControllers {

    private static final String BASE_URL = "https://api-beta.outbox.pro/";

    public static User loginToOutBox(User user) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        IUserService service = retrofit.create(IUserService.class);
        Call<User> userCall = service.loginToOutBox(user);

        userCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Response<User> response, Retrofit retrofit) {
               if (response.isSuccess()) {
                   //we have a user.
               }
            }

            @Override
            public void onFailure(Throwable t) {
                // api errors how we handle this?
            }
        });
        return user;
    }
}
