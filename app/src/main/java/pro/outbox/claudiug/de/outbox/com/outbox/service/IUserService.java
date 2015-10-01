package pro.outbox.claudiug.de.outbox.com.outbox.service;


import pro.outbox.claudiug.de.outbox.com.outbox.models.User;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by claudiug on 10/1/15.
 */
public interface IUserService {

//    url: /v2/login
//    method:  POST
//    accessibility: public
//    Login to outbox

    @POST("/v2/login")
    Call<User> loginToOutBox(@Body User user);

}
