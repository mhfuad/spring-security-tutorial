package com.fuad.springsecurityclient.event;

import com.fuad.springsecurityclient.entity.User;
import org.springframework.context.ApplicationEvent;

public class RegistrationCompleteEvent extends ApplicationEvent {

    private User user;
    private String applicationURL;
    public RegistrationCompleteEvent(User user, String applicationURL) {
        super(user);
        this.user = user;
        this.applicationURL = applicationURL;
    }
}
