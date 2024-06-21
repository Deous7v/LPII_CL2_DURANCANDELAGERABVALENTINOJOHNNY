package Modelo;
	
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.NamedQuery;
	import javax.persistence.Table;

	@Entity
	@Table(name = "TBL_USUARIOCL2")
	@NamedQuery(name = "TBL_USUARIOCL2.findAll", query = "SELECT t FROM TBL_USUARIOCL2 t")
	public class TBL_USUARIOCL2 {		

		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		
			private int IDUSUARIOCL2;
			private String USUARIOCL2;
			private String PASSWORDCL2;

	    
	    // Constructor vacío
	    public TBL_USUARIOCL2() {
	    }

	    // Constructor con parámetros
	    public TBL_USUARIOCL2(int IDUSUARIOCL2, String USUARIOCL2, String PASSWORDCL2) {
	        this.IDUSUARIOCL2 = IDUSUARIOCL2;
	        this.USUARIOCL2 = USUARIOCL2;
	        this.PASSWORDCL2 = PASSWORDCL2;
	    }

	    // Getters y Setters
	    public int getIDUSUARIOCL2() {
	        return IDUSUARIOCL2;
	    }

	    public void setIDUSUARIOCL2(int IDUSUARIOCL2) {
	        this.IDUSUARIOCL2 = IDUSUARIOCL2;
	    }

	    public String getUSUARIOCL2() {
	        return USUARIOCL2;
	    }

	    public void setUSUARIOCL2(String USUARIOCL2) {
	        this.USUARIOCL2 = USUARIOCL2;
	    }

	    public String getPASSWORDCL2() {
	        return PASSWORDCL2;
	    }

	    public void setPASSWORDCL2(String PASSWORDCL2) {
	        this.PASSWORDCL2 = PASSWORDCL2;
	    }	
}
