package com.demo.web;

import com.demo.converter.ClientConverter;
import com.demo.domain.transport.ClientDto;
import com.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для работы с клиентами
 * \@RestController вместо @Controller, чтобы не писать везде @ResponseBody, ибо мы возвращаем данные, а не view
 */
@RestController
@RequestMapping(value = "client") // корневой маппинг, с него будут начинаться запроса на этот контроллер ( например, /client/save )
public class ClientRestController {

    @Autowired
    private ClientConverter clientConverter;

    @Autowired
    private ClientService clientService;

    /**
     * \@RequestParam, чтобы можно было указать uri параметр id
     */
    @GetMapping("/get")
    public ClientDto get(@RequestParam Long id) {
        return clientConverter.convert(clientService.get(id));
    }

    /**
     * \@RequestBody, чтобы конвертировать json запрос в наш объект ClientDto
     */
    @PostMapping("/save")
    public void save(@RequestBody ClientDto clientDto) {
        clientService.save(clientConverter.convert(clientDto));
    }
}
