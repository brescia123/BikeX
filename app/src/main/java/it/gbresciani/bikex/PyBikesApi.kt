package it.gbresciani.bikex

import retrofit2.http.GET
import rx.Observable

interface PyBikesApi {
    @GET("networks")
    fun getNetworks(): Observable<Networks>
}