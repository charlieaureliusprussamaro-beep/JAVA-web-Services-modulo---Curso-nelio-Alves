package program.program;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public List<Order> findAll()
    {
        return repository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> opt = repository.findById(id);
        return opt.get();
    }
}
