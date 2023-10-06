package es.jmruirod.firstspring7finalprojectreservation.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
    
    public Reservation() 
    {

    }

    public Reservation(String clientName, String clientDni, long hotelId, long flightId) 
    {
        this.clientName = clientName;
        this.clientDni = clientDni;
        this.hotelId = hotelId;
        this.flightId = flightId;
    }

    public Reservation(long id, String clientName, String clientDni, long hotelId, long flightId) 
    {
        this.id = id;
        this.clientName = clientName;
        this.clientDni = clientDni;
        this.hotelId = hotelId;
        this.flightId = flightId;
    }

    public long getId() 
    {
        return id;
    }

    public void setId(long id) 
    {
        this.id = id;
    }

    public String getClientName() 
    {
        return clientName;
    }

    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    public String getClientDni() 
    {
        return clientDni;
    }

    public void setClientDni(String clientDni) 
    {
        this.clientDni = clientDni;
    }

    public long getHotelId() 
    {
        return hotelId;
    }

    public void setHotelId(long hotelId) 
    {
        this.hotelId = hotelId;
    }

    public long getFlightId() 
    {
        return flightId;
    }

    public void setFlightId(long flightId) 
    {
        this.flightId = flightId;
    }

    @Override
    public String toString() 
    {
        return "Reservation [id=" + id + ", clientName=" + clientName + ", clientDni=" + clientDni + ", hotelId="
                + hotelId + ", flightId=" + flightId + "]";
    }

    @Override
    public int hashCode() 
    {
        return Objects.hashCode(id);
    }

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
