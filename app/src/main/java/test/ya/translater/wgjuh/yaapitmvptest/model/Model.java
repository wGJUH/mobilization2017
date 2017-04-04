package test.ya.translater.wgjuh.yaapitmvptest.model;

import retrofit2.Call;
import rx.Observable;

import test.ya.translater.wgjuh.yaapitmvptest.model.data.LangsDirsModelPojo;
import test.ya.translater.wgjuh.yaapitmvptest.model.data.TranslatePojo;

/**
 * Created by wGJUH on 04.04.2017.
 */

public interface Model {

    Observable<LangsDirsModelPojo> getLangsDirsForLanguage(String language);
    Observable<TranslatePojo> getTranslateForLanguage(String target, String language);
}
