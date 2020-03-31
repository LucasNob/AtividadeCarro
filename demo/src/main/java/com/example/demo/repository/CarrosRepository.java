package com.example.demo.repository;

import java.util.HashMap;

import com.example.demo.model.Carro;

import org.springframework.stereotype.Repository;

/**
 * CarrosRepository
 */
@Repository
public class CarrosRepository {

    private HashMap<Integer,Carro> c = new HashMap<Integer,Carro>();

    public CarrosRepository()
    {
        c.put(0,new Carro(0,"Ford","Verde"));
        c.put(1,new Carro(1,"Volks","Azul"));
        c.put(2,new Carro(2,"Nissan","Amarelo"));
        c.put(3,new Carro(3,"GM","Vermelho"));
        c.put(4,new Carro(4,"Hyundai","Preto"));
        c.put(5,new Carro(5,"Honda","Cinza"));
        c.put(6,new Carro(6,"Fiat","Branco"));
        c.put(7,new Carro(7,"Audi","Rosa"));
        c.put(8,new Carro(8,"Seat","Marrom"));
        c.put(9,new Carro(9,"Toyota","Verde"));
    }
    public Carro GetCarrobyId(int id){
        return c.get(id);
    }
    public HashMap<Integer,Carro> GetCarros(){
        return c;
    }
    public int  GetCarroCount(){
        return c.size();
    }
    
}