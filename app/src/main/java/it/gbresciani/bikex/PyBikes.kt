package it.gbresciani.bikex

import okhttp3.HttpUrl
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import rx.Observable

class PyBikes() {

    private val pyBikesApi: PyBikesApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(HttpUrl.parse("http://api.citybik.es/v2/"))
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()

        pyBikesApi = retrofit.create(PyBikesApi::class.java)
    }

    fun getNetworks(): Observable<Networks> = pyBikesApi.getNetworks()
}
