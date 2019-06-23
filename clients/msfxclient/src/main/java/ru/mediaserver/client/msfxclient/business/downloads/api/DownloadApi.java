package ru.mediaserver.client.msfxclient.business.downloads.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;
import ru.mediaserver.client.msfxclient.business.downloads.model.DownloadProperty;

import java.util.List;

public interface DownloadApi {

    @GET("/download")
    Call<List<DownloadProperty>> getAll();

    @POST("/download")
    Call<ResponseBody> add(@Query("url") String url);

    @DELETE("/download/{name}")
    Call<ResponseBody> delete(@Path("name") String name);
}