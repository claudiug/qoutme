package pro.outbox.claudiug.de.outbox.com.outbox.service;

import java.util.List;

import pro.outbox.claudiug.de.outbox.com.outbox.models.Team;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by claudiug on 10/1/15.
 */
public interface ITeamService {

//    url: /v2/teams
//    method:  GET
//    accessibility: private
//    authenticationheader:required

    @GET("/v2/teams/{userId}")
    Call<List<Team>> listTeam(@Path("userID") String userId);

//    url: /v2/list-team-members
//    method:  GET
//    accessibility: private
//    authenticationheader:required

    @GET("/v2/list-team-members/{userId}")
    Call<List<Team>> listTeamMembers(@Path("userID") String userId);

}
