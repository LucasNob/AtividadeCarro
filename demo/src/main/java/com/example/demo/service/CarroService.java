package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Carro;
import com.example.demo.repository.CarrosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarroService
 */
@Service
public class CarroService {

    @Autowired CarrosRepository cr;

    public Carro getCarro(int id)
    {
        Carro car = cr.getCarrobyId(id);
        return car;
    }
    public ArrayList<Carro> getCarros(){
        ArrayList<Carro> car = new ArrayList<>();
        Carro aux;
        for (int i=0;i<cr.getCarroCount();i++)
        {
            aux=cr.getCarrobyId(i);
                car.add(aux);
        }
        return car;
    }
}