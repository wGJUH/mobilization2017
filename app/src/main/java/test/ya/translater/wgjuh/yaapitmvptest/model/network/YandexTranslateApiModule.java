package test.ya.translater.wgjuh.yaapitmvptest.model.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wGJUH on 04.04.2017.
 */

public class YandexTranslateApiModule {


    public static YandexTranslateApiInterface getYandexTranslateApiInterface() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://translate.yandex.net/") //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        return retrofit.create(YandexTranslateApiInterface.class);
    }


}