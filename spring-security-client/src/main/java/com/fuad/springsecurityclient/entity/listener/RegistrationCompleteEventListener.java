package com.fuad.springsecurityclient.entity.listener;

import com.fuad.springsecurityclient.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create the verification Token for the User with link

        //Send Mail to user
    }
}
