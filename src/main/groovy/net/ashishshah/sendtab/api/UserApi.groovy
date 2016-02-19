package net.ashishshah.sendtab.api

import com.stormpath.sdk.client.*
import com.stormpath.sdk.application.*
import com.stormpath.sdk.tenant.*

class UserApi {
    private final static ClientBuilder clientBuilder = Clients.builder()
    private final static Client client = clientBuilder.build()
    private final static String applicationName = "sendtab-server"
    private final static Tenant tenant = client.getCurrentTenant()
    private final static ApplicationList applications = tenant.getApplications(
                Applications.where(Applications.name().eqIgnoreCase(applicationName)))
    private final static Application application = applications[0]

    private UserApi() {}
}
