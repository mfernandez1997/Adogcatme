package Adogcatme.Proyecto.entidades;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Capoun
 */
public class Solicitud {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private Dueno dueno;
    private Mascota mascota;
    private Adoptante adoptante;
    
    private Date fecha;
    private Integer estado; //0 = pendiente, 1 = aceptada, 2 = rechazada
}
