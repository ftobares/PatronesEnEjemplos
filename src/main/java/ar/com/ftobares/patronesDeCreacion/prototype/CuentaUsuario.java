package ar.com.ftobares.patronesDeCreacion.prototype;

public class CuentaUsuario extends CuentaPrototype {
	
	private String nombre;
	
	private String sucursal;
	
	private Long saldoDisponible;
	
	private Boolean permisoDelete = Boolean.FALSE;
	
	private Boolean permisoUpdate = Boolean.FALSE;;
	
	private Boolean permisoSelect = Boolean.TRUE;
	
	private Boolean permisoCreate = Boolean.FALSE;	
	
	public CuentaUsuario(String nombre, String sucursal, Long saldoDisponible, Boolean permisoDelete,
			Boolean permisoUpdate, Boolean permisoSelect, Boolean permisoCreate) {
		this.nombre = nombre;
		this.sucursal = sucursal;
		this.saldoDisponible = saldoDisponible;
		this.permisoDelete = permisoDelete;
		this.permisoUpdate = permisoUpdate;
		this.permisoSelect = permisoSelect;
		this.permisoCreate = permisoCreate;
	}

	public CuentaUsuario(CuentaUsuario cuentaUsuario) {
		this.nombre = cuentaUsuario.getNombre();
		this.sucursal = cuentaUsuario.getSucursal();
		this.saldoDisponible = cuentaUsuario.getSaldoDisponible();
		this.permisoDelete = cuentaUsuario.getPermisoDelete();
		this.permisoUpdate = cuentaUsuario.getPermisoUpdate();
		this.permisoSelect = cuentaUsuario.getPermisoSelect();
		this.permisoCreate = cuentaUsuario.getPermisoCreate();
	}

	@Override
	public Object clonar() throws CloneNotSupportedException {
		return new CuentaUsuario(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Boolean getPermisoDelete() {
		return permisoDelete;
	}

	public void setPermisoDelete(Boolean permisoDelete) {
		this.permisoDelete = permisoDelete;
	}

	public Boolean getPermisoUpdate() {
		return permisoUpdate;
	}

	public void setPermisoUpdate(Boolean permisoUpdate) {
		this.permisoUpdate = permisoUpdate;
	}

	public Boolean getPermisoSelect() {
		return permisoSelect;
	}

	public void setPermisoSelect(Boolean permisoSelect) {
		this.permisoSelect = permisoSelect;
	}

	public Boolean getPermisoCreate() {
		return permisoCreate;
	}

	public void setPermisoCreate(Boolean permisoCreate) {
		this.permisoCreate = permisoCreate;
	}	

}
