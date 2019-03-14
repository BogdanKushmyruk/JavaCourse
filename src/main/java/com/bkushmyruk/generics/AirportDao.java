package com.bkushmyruk.generics;

import java.util.List;

public class AirportDao implements Generic<Airpot> {
    @Override
    public void save(Airpot airpot) {

    }

    @Override
    public List<Airpot> findAll() {
        return null;
    }

    @Override
    public Airpot findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public <T2> boolean doSmth() {
        return false;
    }
}
