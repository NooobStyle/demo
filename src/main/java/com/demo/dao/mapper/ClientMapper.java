package com.demo.dao.mapper;

import com.demo.domain.model.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // аннотация чтобы mybatis по одноименной xml создал бин, реализующий этот интерфейс, и его можно было использовать в @Autowired через этот интерфейс
public interface ClientMapper {

    /**
     * Получить клиента по его id
     *
     * @param id id клиента
     * @return клиент
     */
    Client get(@Param("id") Long id);

    /**
     * Сохранить клиента в базе
     *
     * @param client клиент
     */
    void save(@Param("client") Client client);
}
