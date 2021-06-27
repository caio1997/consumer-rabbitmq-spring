package caio.home.springconsumerrabbitmq.service;

import caio.home.springconsumerrabbitmq.dto.Message;

public interface ConsumerService {

    void action(Message message) throws Exception;

}
