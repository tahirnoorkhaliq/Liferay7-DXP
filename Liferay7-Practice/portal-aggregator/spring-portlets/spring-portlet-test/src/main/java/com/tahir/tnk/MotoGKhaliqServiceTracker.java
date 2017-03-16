package com.tahir.tnk;

import com.tahir.motogplusservice.service.KhaliqLocalService;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;
/**
 * Created by tana0616 on 3/16/2017.
 */
public class MotoGKhaliqServiceTracker extends ServiceTracker<KhaliqLocalService, KhaliqLocalService>{

    public MotoGKhaliqServiceTracker(Object expandoValue) {
        super(FrameworkUtil.getBundle(expandoValue.getClass()).getBundleContext(),KhaliqLocalService.class, null);
    }

}
