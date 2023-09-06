package com.order.produtor.controllers;

import com.order.produtor.models.Pagamento;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtores/pagamento")
public class PagamentoController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping
    public Pagamento create(@RequestBody Pagamento pagamento) {
        // Não será salvo nada no banco, a parte do consumidor que irá
        rabbitTemplate.convertAndSend("order.produtor", "", pagamento);
        return pagamento;
    }

}
