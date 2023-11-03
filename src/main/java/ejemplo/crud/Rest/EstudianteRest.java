package ejemplo.crud.Rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejemplo.crud.Entity.Estudiante;
import ejemplo.crud.Servicio.EstudianteServicio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/estudiante/")
public class EstudianteRest {
    @Autowired
    private EstudianteServicio estudianteServicio;

    @PostMapping
    private ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante) {
        Estudiante temporal = estudianteServicio.create(estudiante);
        try {
            return ResponseEntity.created(new URI("/api/estudiante/" + temporal.getId_estudiante())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    public ResponseEntity <List<Estudiante>> All(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteServicio.getAllEstudiante());
    }
    
    @DeleteMapping
    public ResponseEntity<Void> Delete(@RequestBody Estudiante estudiante) {
        estudianteServicio.delete(estudiante);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Optional<Estudiante>> AllId(@PathVariable ("id_estudiante") long id_estudiante) {
        return ResponseEntity.ok(estudianteServicio.findById(id_estudiante));
    }
}
