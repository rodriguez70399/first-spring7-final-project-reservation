package es.jmruirod.firstspring7finalprojectreservation.model.dto;

/**
 * Esta interfaz define métodos para proyectar información específica de una reserva.
 * Se utiliza para seleccionar campos específicos de las reservas en consultas personalizadas.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface ReservationProjection 
{
    /**
     * Obtiene el nombre del cliente asociado a la reserva.
     *
     * @return El nombre del cliente como una cadena de caracteres.
     */
    public String getClientName();

    /**
     * Obtiene el DNI (Documento Nacional de Identidad) del cliente asociado a la reserva.
     *
     * @return El DNI del cliente como una cadena de caracteres.
     */
    public String getClientDni();

    /**
     * Obtiene el ID del vuelo asociado a la reserva.
     *
     * @return El ID del vuelo como un valor long.
     */
    public long getFlightId();
}