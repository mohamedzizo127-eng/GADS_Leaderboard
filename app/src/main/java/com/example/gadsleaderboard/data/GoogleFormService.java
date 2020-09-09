package com.example.gadsleaderboard.data;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface GoogleFormService {
    /*
    * FullURL- https://docs.google.com/forms/d/e/1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse
Entries IDs:
⦁	Email Address = entry.1824927963
⦁	Name = entry.1877115667
⦁	Last Name = entry.2006916086
⦁	Link to project = entry.284483984




    * */
    @FormUrlEncoded
    @POST()
    Call<Void> postGoogleForm(@Url String fullUrl,
                          @Field("entry.1824927963") String email,
                          @Field("entry.1877115667") String firstName,
                          @Field("entry.2006916086") String lastName,
                          @Field("entry.284483984") String link);
}
