package Adogcatme.Proyecto.entidades;

import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Capoun
 */
public class Dueno {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2") 
    private String id;
    private String nombre;
    private String email;
    private String contrasena;
    private String telefono;
    
    @OneToMany
    private ArrayList<Mascota> mascotas;
    
    @OneToMany
    private ArrayList<Solicitud> solicitudes;
    
    @OneToOne
    private Ubicacion ubicacion;
}

