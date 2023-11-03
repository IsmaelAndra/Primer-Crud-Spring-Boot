package ejemplo.crud.Servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejemplo.crud.Entity.Estudiante;
import ejemplo.crud.Repository.EstudianteRepository;

@Service
public class EstudianteServicio {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante create(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> getAllEstudiante() {
        return estudianteRepository.findAll();
    }

    public void delete(Estudiante estudiante) {
        estudianteRepository.delete(estudiante);
    }

    public Optional<Estudiante> findById(Long id_estudiante) {
        return estudianteRepository.findById(id_estudiante);
    }
}
