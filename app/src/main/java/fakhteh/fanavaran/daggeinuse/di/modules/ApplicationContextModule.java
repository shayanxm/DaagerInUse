package fakhteh.fanavaran.daggeinuse.di.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import fakhteh.fanavaran.daggeinuse.di.CustomApplicationScope;

@Module
public class ApplicationContextModule {
    private final Context context;

    public ApplicationContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @CustomApplicationScope
    @ApplicationContextQualifier
    Context getContext() {
        return context;
    }
}
