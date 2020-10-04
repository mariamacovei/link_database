package com.macoveim.lab3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class DebtorRepository {
	int id;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Debtor> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM debtor",
                (response, rowNumber) ->
                        new Debtor(response.getLong("id"),
                                response.getString("last_name"),
                                response.getString("first_name"),
                                response.getString("cnp"),
                                response.getString("locality")));


    }

    public void save(Debtor debtor) {
        jdbcTemplate.update(
                " INSERT INTO debtor (last_name,first_name,cnp,locality) VALUES (?,?,?,?)",
                debtor.getLastName(), debtor.getFirstName(), debtor.getCnp(), debtor.getLocality());
    }

    public void delete(String cnp) {
        jdbcTemplate.update("DELETE FROM debtor WHERE cnp=?", cnp);
    }
}


