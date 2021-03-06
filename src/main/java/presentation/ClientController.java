package presentation;
import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.IClientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService service;
    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long id){
        return service.getOne(id);
    }
    @GetMapping("/all")
    public List<Client> getAll(){
        return service.getAll();
    }
    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt){
        return service.modify(clt);
    }
}
