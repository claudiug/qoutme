package pro.outbox.claudiug.de.outbox.com.outbox.service;

import pro.outbox.claudiug.de.outbox.com.outbox.models.Network;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by claudiug on 10/1/15.
 */
public interface INetworkService {

//    url: /v2/list-connections
//    method:  GET
//    accessibility: private
//    authenticationheader:required

    @GET("/v2/list-connection/{userId}")
    Call<Network> listConnections(@Path("userId") String userId);
}
