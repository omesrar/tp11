package dao;

import models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientDao  extends CrudRepository<Client,Long>{

}