package fakhteh.fanavaran.daggeinuse.di.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import fakhteh.fanavaran.daggeinuse.di.CustomApplicationScope;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = NetworkModule.class)
public class ServiceUtilModule {
    private static final String BASE_URL = "https://www.frisbeego.com/secure/index.php/";

    @Provides
    @CustomApplicationScope
    ServiceUtil getServiceUtil(Retrofit retrofit) {

        return retrofit.create(ServiceUtil.class);
    }
    @Provides
    @CustomApplicationScope
    Retrofit getRetrofit(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .build();
    }
    @Provides
    @CustomApplicationScope
    Gson getGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }
}
