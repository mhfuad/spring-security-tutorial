package com.fuad.springsecurityclient.entity.listener;

import com.fuad.springsecurityclient.entity.User;
import com.fuad.springsecurityclient.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create the verification Token for the User with link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        //Send Mail to user
    }
}
