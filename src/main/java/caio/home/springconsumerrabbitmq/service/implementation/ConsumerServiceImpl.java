package caio.home.springconsumerrabbitmq.service.implementation;

import caio.home.springconsumerrabbitmq.dto.Message;
import caio.home.springconsumerrabbitmq.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) throws Exception{

        //throw new Exception("ERRO");
        System.out.println(message.getText());

    }
}
