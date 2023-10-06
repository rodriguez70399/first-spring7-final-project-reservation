package es.jmruirod.firstspring7finalprojectreservation.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Clase que representa una reserva de hotel y vuelo en la aplicación.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Entity
@Table(name = "reservations")
public class Reservation 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String clientName;
    private String clientDni;
    private long hotelId;
    private long flightId;
    
    /**
     * Constructor sin argumentos de la clase Reservation.
     */
    public Reservation() 
    {

    }

    /**
     * Constructor que crea una reserva con los detalles proporcionados.
     *
     * @param clientName El nombre del cliente que realiza la reserva.
     * @param clientDni  El número de identificación del cliente que realiza la reserva.
     * @param hotelId    El identificador único del hotel reservado.
     * @param flightId   El identificador único del vuelo reservado.
     */
    public Reservation(String clientName, String clientDni, long hotelId, long flightId) 
    {
        this.clientName = clientName;
        this.clientDni = clientDni;
        this.hotelId = hotelId;
        this.flightId = flightId;
    }

    /**
     * Constructor que crea una reserva con un identificador único y los detalles proporcionados.
     *
     * @param id         El identificador único de la reserva.
     * @param clientName El nombre del cliente que realiza la reserva.
     * @param clientDni  El número de identificación del cliente que realiza la reserva.
     * @param hotelId    El identificador único del hotel reservado.
     * @param flightId   El identificador único del vuelo reservado.
     */
    public Reservation(long id, String clientName, String clientDni, long hotelId, long flightId) 
    {
        this.id = id;
        this.clientName = clientName;
        this.clientDni = clientDni;
        this.hotelId = hotelId;
        this.flightId = flightId;
    }

    /**
     * Obtiene el identificador único de la reserva.
     *
     * @return El identificador único de la reserva.
     */
    public long getId() 
    {
        return id;
    }

    /**
     * Establece el identificador único de la reserva.
     *
     * @param id El nuevo identificador único de la reserva.
     */
    public void setId(long id) 
    {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente que realiza la reserva.
     *
     * @return El nombre del cliente que realiza la reserva.
     */
    public String getClientName() 
    {
        return clientName;
    }

    /**
     * Establece el nombre del cliente que realiza la reserva.
     *
     * @param clientName El nuevo nombre del cliente que realiza la reserva.
     */
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    /**
     * Obtiene el número de identificación del cliente que realiza la reserva.
     *
     * @return El número de identificación del cliente que realiza la reserva.
     */
    public String getClientDni() 
    {
        return clientDni;
    }

    /**
     * Establece el número de identificación del cliente que realiza la reserva.
     *
     * @param clientDni El nuevo número de identificación del cliente que realiza la reserva.
     */
    public void setClientDni(String clientDni) 
    {
        this.clientDni = clientDni;
    }

    /**
     * Obtiene el identificador único del hotel reservado.
     *
     * @return El identificador único del hotel reservado.
     */
    public long getHotelId() 
    {
        return hotelId;
    }

    /**
     * Establece el identificador único del hotel reservado.
     *
     * @param hotelId El nuevo identificador único del hotel reservado.
     */
    public void setHotelId(long hotelId) 
    {
        this.hotelId = hotelId;
    }

    /**
     * Obtiene el identificador único del vuelo reservado.
     *
     * @return El identificador único del vuelo reservado.
     */
    public long getFlightId() 
    {
        return flightId;
    }

    /**
     * Establece el identificador único del vuelo reservado.
     *
     * @param flightId El nuevo identificador único del vuelo reservado.
     */
    public void setFlightId(long flightId) 
    {
        this.flightId = flightId;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena de la reserva.
     *
     * @return Una representación en cadena de la reserva.
     */
    @Override
    public String toString() 
    {
        return "Reservation [id=" + id + ", clientName=" + clientName + ", clientDni=" + clientDni + ", hotelId="
                + hotelId + ", flightId=" + flightId + "]";
    }

    /**
     * Sobrescribe el método hashCode para calcular el valor hash de la reserva basado en su identificador único.
     *
     * @return El valor hash de la reserva.
     */
    @Override
    public int hashCode() 
    {
        return Objects.hashCode(id);
    }

    /**
     * Sobrescribe el método equals para comparar dos reservas y determinar si son iguales.
     *
     * @param obj El objeto a comparar con la reserva actual.
     * @return true si las reservas son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Reservation other = (Reservation) obj;

        if (id != other.id)
            return false;

        if (clientName == null) 
        {
            if (other.clientName != null)
                return false;
        }
        else if (!clientName.equals(other.clientName))
            return false;

        if (clientDni == null) 
        {
            if (other.clientDni != null)
                return false;
        } 
        else if (!clientDni.equals(other.clientDni))
            return false;

        if (hotelId != other.hotelId)
            return false;

        if (flightId != other.flightId)
            return false;

        return true;
    }
}
