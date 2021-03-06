package test.ya.translater.wgjuh.yaapitmvptest.model.network;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import test.ya.translater.wgjuh.yaapitmvptest.model.translate.LangsDirsModelDTO;
import test.ya.translater.wgjuh.yaapitmvptest.model.dict.DictDTO;
/**
 * <a href="https://tech.yandex.ru/dictionary/">API Словаря</a>
 */
public interface YandexDictionaryApiInterface {

    @GET("/api/v1/dicservice/getStoredLangs")
    Observable<LangsDirsModelDTO> getLangs(@Query("key") String apiKey);

    @GET("/api/v1/dicservice.json/lookup")
    Observable<DictDTO> translateForLanguage(@Query("key") String apiKey, @Query("lang") String lang, @Query("text") String text, @Query("ui") String ui);

}
