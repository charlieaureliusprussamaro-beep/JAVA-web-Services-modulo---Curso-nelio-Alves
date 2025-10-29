package program.program;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll()
    {
        return repository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> opt = repository.findById(id);
        return opt.get();
    }
}
