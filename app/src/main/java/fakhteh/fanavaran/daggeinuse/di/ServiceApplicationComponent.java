package fakhteh.fanavaran.daggeinuse.di;

import com.squareup.picasso.Picasso;

import dagger.Component;
import fakhteh.fanavaran.daggeinuse.di.modules.PicassoModule;
import fakhteh.fanavaran.daggeinuse.di.modules.ServiceUtil;
import fakhteh.fanavaran.daggeinuse.di.modules.ServiceUtilModule;

@CustomApplicationScope
@Component(modules = {ServiceUtilModule.class, PicassoModule.class})
public interface ServiceApplicationComponent {
    Picasso getPicaso();

    ServiceUtil getServiceUtil();

}
