/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlossantana.avaliacao.continuada3;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author santana
 */
public class DataBase {

    
    private JdbcTemplate jdbcTemplate;
    
    
    public JdbcTemplate connect() {

        //Configurando a conexão com banco de dados
        BasicDataSource dataSource = new BasicDataSource();
        //Iniciando a classe do Driver de Banco
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //Iniciando a url do banco
        dataSource.setUrl("jdbc:mysql://localhost/bank?useTimezone=true&serverTimezone=UTC");
        //login e senha para entrar no banco
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
                
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        return jdbcTemplate;
    }

    
    
   
}
