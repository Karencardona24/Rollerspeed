package com.rollerspeed.rollerspeed.rest;

import com.rollerspeed.rollerspeed.model.Alumno;
import com.rollerspeed.rollerspeed.service.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@Tag(
        name = "Alumnos",
        description = "Operaciones REST para la gestión de alumnos de Roller Speed"
)
public class AlumnoRestController {

    private final AlumnoService alumnoService;

    public AlumnoRestController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @Operation(
            summary = "Listar alumnos",
            description = "Obtiene todos los alumnos registrados en Roller Speed."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Listado obtenido correctamente"
    )
    @GetMapping
    public ResponseEntity<List<Alumno>> listarAlumnos() {

        return ResponseEntity.ok(
                alumnoService.listarTodos()
        );
    }

    @Operation(
            summary = "Consultar alumno",
            description = "Obtiene un alumno utilizando su identificador."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Alumno encontrado"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Alumno no encontrado"
            )
    })
    @GetMapping("/{id}")
    public ResponseEntity<Alumno> obtenerAlumno(

            @Parameter(
                    description = "Identificador del alumno",
                    example = "1"
            )

            @PathVariable Long id) {

        return alumnoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(
            summary = "Registrar alumno",
            description = "Registra un nuevo alumno en Roller Speed."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "Alumno registrado correctamente"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Datos del alumno inválidos"
            )
    })
    @PostMapping
    public ResponseEntity<Alumno> crearAlumno(
            @RequestBody Alumno alumno) {

        Alumno nuevoAlumno =
                alumnoService.guardar(alumno);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(nuevoAlumno);
    }

    @Operation(
            summary = "Actualizar alumno",
            description = "Actualiza la información de un alumno existente."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Alumno actualizado correctamente"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Alumno no encontrado"
            )
    })
    @PutMapping("/{id}")
    public ResponseEntity<Alumno> actualizarAlumno(
            @PathVariable Long id,
            @RequestBody Alumno alumno) {

        if (!alumnoService.existe(id)) {
            return ResponseEntity.notFound().build();
        }

        alumno.setId(id);

        Alumno actualizado =
                alumnoService.guardar(alumno);

        return ResponseEntity.ok(actualizado);
    }

    @Operation(
            summary = "Eliminar alumno",
            description = "Elimina un alumno utilizando su identificador."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "204",
                    description = "Alumno eliminado correctamente"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Alumno no encontrado"
            )
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAlumno(
            @PathVariable Long id) {

        if (!alumnoService.existe(id)) {
            return ResponseEntity.notFound().build();
        }

        alumnoService.eliminar(id);

        return ResponseEntity.noContent().build();
    }
}
