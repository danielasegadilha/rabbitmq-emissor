package com.senac.DanielaEmissorMulta.service;

import com.senac.DanielaEmissorMulta.dto.MultaDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultaService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarMultaParaRemocao(int multaId){
        rabbitTemplate.convertAndSend("remover-multa", multaId);
    }


}
