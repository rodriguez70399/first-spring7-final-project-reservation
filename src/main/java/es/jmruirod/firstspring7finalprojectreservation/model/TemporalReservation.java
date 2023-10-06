package es.jmruirod.firstspring7finalprojectreservation.model;

/**
 * Esta clase representa una reserva temporal que incluye información sobre un cliente,
 * un hotel, un vuelo y el número de reservas realizadas por el cliente.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class TemporalReservation 
{
    private String clientName;
    private String clientDni;
    private long hotelId;
    private long flightId;
    private int reservationsNumber;
    
    /**
     * Constructor sin argumentos de la clase TemporalReservation.
     */
    public TemporalReservation() 
    {

    }

    /**
     * Constructor que crea una reserva temporal con los detalles proporcionados.
     *
     * @param clientName        El nombre del cliente que realiza la reserva.
     * @param clientDni         El número de identificación del cliente que realiza la reserva.
     * @param hotelId           El identificador único del hotel reservado.
     * @param flightId          El identificador único del vuelo reservado.
     * @param reservationsNumber El número de reservas realizadas por el cliente.
     */
    public TemporalReservation(String clientName, String clientDni, long hotelId, long flightId, int reservationsNumber) 
    {
        this.clientName = clientName;
        this.clientDni = clientDni;
        this.hotelId = hotelId;
        this.flightId = flightId;
        this.reservationsNumber = reservationsNumber;
    }

    /**
     * Obtiene el nombre del cliente que realiza la reserva temporal.
     *
     * @return El nombre del cliente que realiza la reserva.
     */
    public String getClientName() 
    {
        return clientName;
    }

    /**
     * Establece el nombre del cliente que realiza la reserva temporal.
     *
     * @param clientName El nuevo nombre del cliente que realiza la reserva.
     */
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    /**
     * Obtiene el número de identificación del cliente que realiza la reserva temporal.
     *
     * @return El número de identificación del cliente que realiza la reserva.
     */
    public String getClientDni() 
    {
        return clientDni;
    }

    /**
     * Establece el número de identificación del cliente que realiza la reserva temporal.
     *
     * @param clientDni El nuevo número de identificación del cliente que realiza la reserva.
     */
    public void setClientDni(String clientDni) 
    {
        this.clientDni = clientDni;
    }

    /**
     * Obtiene el identificador único del hotel reservado en la reserva temporal.
     *
     * @return El identificador único del hotel reservado.
     */
    public long getHotelId() 
    {
        return hotelId;
    }

    /**
     * Establece el identificador único del hotel reservado en la reserva temporal.
     *
     * @param hotelId El nuevo identificador único del hotel reservado.
     */
    public void setHotelId(long hotelId) 
    {
        this.hotelId = hotelId;
    }

    /**
     * Obtiene el identificador único del vuelo reservado en la reserva temporal.
     *
     * @return El identificador único del vuelo reservado.
     */
    public long getFlightId() 
    {
        return flightId;
    }

    /**
     * Establece el identificador único del vuelo reservado en la reserva temporal.
     *
     * @param flightId El nuevo identificador único del vuelo reservado.
     */
    public void setFlightId(long flightId) 
    {
        this.flightId = flightId;
    }

    /**
     * Obtiene el número de reservas realizadas por el cliente en la reserva temporal.
     *
     * @return El número de reservas realizadas por el cliente.
     */
    public int getReservationsNumber() 
    {
        return reservationsNumber;
    }

    /**
     * Establece el número de reservas realizadas por el cliente en la reserva temporal.
     *
     * @param reservationsNumber El nuevo número de reservas realizadas por el cliente.
     */
    public void setReservationsNumber(int reservationsNumber) 
    {
        this.reservationsNumber = reservationsNumber;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena de la reserva temporal.
     *
     * @return Una representación en cadena de la reserva temporal.
     */
    @Override
    public String toString() 
    {
        return "TemporalReservation [clientName=" + clientName + ", clientDni=" + clientDni + ", hotelId=" + hotelId
                + ", flightId=" + flightId + ", reservationsNumber=" + reservationsNumber + "]";
    }

    /**
     * Sobrescribe el método hashCode para calcular el valor hash de la reserva temporal.
     *
     * @return El valor hash de la reserva temporal.
     */
    @Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
        result = prime * result + ((clientDni == null) ? 0 : clientDni.hashCode());
        result = prime * result + (int) (hotelId ^ (hotelId >>> 32));
        result = prime * result + (int) (flightId ^ (flightId >>> 32));
        result = prime * result + reservationsNumber;
        return result;
    }

    /**
     * Sobrescribe el método equals para comparar dos reservas temporales y determinar si son iguales.
     *
     * @param obj El objeto a comparar con la reserva temporal actual.
     * @return true si las reservas temporales son iguales, false en caso contrario.
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

        TemporalReservation other = (TemporalReservation) obj;

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

        if (reservationsNumber != other.reservationsNumber)
            return false;

        return true;
    }  
}
