package es.jmruirod.firstspring7finalprojectreservation.model;

public class TemporalReservation 
{
    private String clientName;
    private String clientDni;
    private long hotelId;
    private long flightId;
    private int reservationsNumber;
    
    public TemporalReservation() 
    {

    }

    public TemporalReservation(String clientName, String clientDni, long hotelId, long flightId, int reservationsNumber) 
    {
        this.clientName = clientName;
        this.clientDni = clientDni;
        this.hotelId = hotelId;
        this.flightId = flightId;
        this.reservationsNumber = reservationsNumber;
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

    public int getReservationsNumber() 
    {
        return reservationsNumber;
    }

    public void setReservationsNumber(int reservationsNumber) 
    {
        this.reservationsNumber = reservationsNumber;
    }

    @Override
    public String toString() 
    {
        return "TemporalReservation [clientName=" + clientName + ", clientDni=" + clientDni + ", hotelId=" + hotelId
                + ", flightId=" + flightId + ", reservationsNumber=" + reservationsNumber + "]";
    }

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