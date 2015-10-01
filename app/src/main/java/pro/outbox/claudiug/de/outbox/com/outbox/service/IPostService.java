package pro.outbox.claudiug.de.outbox.com.outbox.service;

import pro.outbox.claudiug.de.outbox.com.outbox.models.Post;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by claudiug on 10/1/15.
 */
public interface IPostService {

//    url: /v2/create-post
//    method:  POST
//    accessibility: private
//    authenticationheader:required

    @POST("/v2/create-post")
    Call<POST> createPost(@Body Post post);
}
