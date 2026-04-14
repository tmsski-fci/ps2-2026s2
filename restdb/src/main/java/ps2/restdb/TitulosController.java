package ps2.restdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitulosController {

    @Autowired
    private TitulosRepo titulosRepo;

    @GetMapping("/api/titulos")
    public Iterable<Titulo> getTitulos() {
        Iterable<Titulo> titulos = titulosRepo.findAll();
        return titulos;
    }

    @PostMapping("/api/titulos")
    public Titulo createTitulo(@RequestBody Titulo t) {
        return titulosRepo.save(t);
    }
}
