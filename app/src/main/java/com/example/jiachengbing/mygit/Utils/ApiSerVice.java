package com.example.jiachengbing.mygit.Utils;


import com.example.jiachengbing.mygit.bean.Vedioinfo;
import com.example.jiachengbing.mygit.bean.VideoListResult;
import com.example.jiachengbing.mygit.bean.getPinLun;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by jiachengbing on 2017/12/26.
 */

public interface ApiSerVice {
    public static final String BASEUAL="http://api.svipmovie.com/front/";

    @POST("homePageApi/homePage.do")
    Observable<VideoListResult> getData();

    @POST("videoDetailApi/videoDetail.do")
    Observable<Vedioinfo> getVedio(@Field("mediaId") String mediaId);

    @FormUrlEncoded
    @POST("Commentary/getCommentList.do")
    Observable<getPinLun> getPinLun(@Field("mediaId") String mediaId, @Field("pnum") String pnum);

}
