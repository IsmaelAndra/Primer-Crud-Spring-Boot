package ejemplo.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ejemplo.crud.Entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    
}
