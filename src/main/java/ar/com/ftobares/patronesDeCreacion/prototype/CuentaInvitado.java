package ar.com.ftobares.patronesDeCreacion.prototype;

public class CuentaInvitado extends CuentaPrototype{
	
	private String nombre;
	
	private String sucursal;
	
	private Long saldoDisponible;
	
	private final Boolean permisoDelete = Boolean.FALSE;
	
	private final Boolean permisoUpdate = Boolean.FALSE;;
	
	private final Boolean permisoSelect = Boolean.TRUE;
	
	private final Boolean permisoCreate = Boolean.FALSE;
	
	public CuentaInvitado(String nombre, String sucursal, Long saldoDisponible) {
		this.nombre = nombre;
		this.sucursal = sucursal;
		this.saldoDisponible = saldoDisponible;
	}

	public CuentaInvitado(CuentaInvitado cuentaInvitado) {
		this.nombre = cuentaInvitado.getNombre();
		this.sucursal = cuentaInvitado.getSucursal();
		this.saldoDisponible = cuentaInvitado.getSaldoDisponible();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getPermisodelete() {
		return permisoDelete;
	}

	public Boolean getPermisoupdate() {
		return permisoUpdate;
	}

	public Boolean getPermisoselect() {
		return permisoSelect;
	}

	public Boolean getPermisocreate() {
		return permisoCreate;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public Long getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(Long saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	@Override
	public Object clonar() throws CloneNotSupportedException {
		return new CuentaInvitado(this);
	}
}
