package es.ifp.programacion.ejercicio.uf4;

import java.util.Date;
/**
 * Clase Proyecto que permite mediante los datos: idProyecto, nombre, descripcion, fechadeinicio, Cliente y Jefe de proyecto,
 * permite instanciar un proyecto.
 * @author kkevi
 *
 */
public class Proyecto {
	private String idProyecto;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private Cliente cliente;
	private JefeProyecto jefe;
	
	
	/**
	 * instanciacion de la Clase proyecto
	 * @param idProyecto ID proyecto, debe se unico.
	 * @param nombre nombre del proyecto
	 * @param descripcion descripcion del proyecto
	 * @param fechaInicio fecha de inicio del proyecto
	 * @param cliente Clase Cliente()
	 * @param jefe Clase Jefe()
	 */
	public Proyecto(String idProyecto, String nombre, String descripcion, Date fechaInicio,
			Cliente cliente, JefeProyecto jefe) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.cliente = cliente;
		this.jefe = jefe;
	}
	
	/** 
	 * Getter que permite obtener el id del proyecto
	 * @return the idProyecto
	 */
	public String getIdProyecto() {
		return idProyecto;
	}
	/** Un ID no debería poder cambiarse nunca. para eso tenemos otros parametros como referencia o numero de proyecto
	 * No obstante el ejercicio no indica la restriccion de modificar este campo y por eso mantengo el setter
	 * @param idProyecto the idProyecto to set cambia la instancia del id proyecto
	 */
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	/**
	 * Getter que permite obtener el nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo que permite cambiar la instanciación de nombre
	 * @param nombre the nombre to set cambia la instancia de nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Getter que permite obtener la decripcion
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Metodo que permite cambiar la instanciación de descripcion
	 * @param descripcion the descripcion to set cambia la instancia de descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * Getter que permite obtener la fecha de inicio 
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * Metodo que permite cambiar la instanciación de fecha de inicio
	 * @param fechaInicio the fechaInicio to set cambia la instancia de fecha
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * Getter que permite obtener el cliente
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * Metodo que permite cambiar la instanciación de cliente
	 * @param cliente the cliente to set cambia la instancia de cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * Getter que permite obtener el jefe
	 * @return the jefe
	 */
	public JefeProyecto getJefe() {
		return jefe;
	}
	/**
	 * Metodo que permite cambiar la instanciación de jefe
	 * @param jefe the jefe to set cambia la instancia de jefe
	 */
	public void setJefe(JefeProyecto jefe) {
		this.jefe = jefe;
	}
	
	/**
	 * Sobreescribe el metodo toString() para adaptarlo a las necesidades de la clase.
	 * @return the String obtienes un String con todos los datos de la clase
	 */
	@Override
	public String toString() {
		return  "====================================================================="+"\n" +
				"--------------------------DATOS DE PROYECTO--------------------------"+"\n" +
				"====================================================================="+"\n" +
				"Nombre de proyecto: "+ this.getNombre()+"\n"+
				"ID Proyecto: "+ this.getIdProyecto()+"\n"+
				"Descripcion: "+ this.getDescripcion()+"\n"+
				"Fecha de inico: "+ this.getFechaInicio()+"\n"+
				"====================================================================="+"\n" +
				"----------------------------DATOS CLIENTE----------------------------"+"\n" +
				"====================================================================="+"\n" +
				getCliente()+"\n"+
				"====================================================================="+"\n" +
				"-------------------------DATOS JEFE PROYECTO-------------------------"+"\n" +
				"====================================================================="+"\n" +
				getJefe()+"\n";
				
	}
	
}
