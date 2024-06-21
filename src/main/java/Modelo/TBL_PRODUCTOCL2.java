package Modelo;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PRODUCTOCL2")
@NamedQuery(name="TBL_PRODUCTOCL2.findAll", query="SELECT t FROM TBL_PRODUCTOCL2 t")
public class TBL_PRODUCTOCL2 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IDPRODUCTOCL2;
	private String NOMBRECL2;
	private double PRECIOVENTACL2;
	private double PRECIOCOMPCL2;
	private String DESCRIPCL2;
	
	
	public TBL_PRODUCTOCL2(int IDPRODUCTOCL2, String NOMBRECL2, Double PRECIOVENTACL2, Double PRECIOCOMPCL2, String DESCRIPCL2) {
		super();
		this.IDPRODUCTOCL2 = IDPRODUCTOCL2;
		this.NOMBRECL2 = NOMBRECL2;
		this.PRECIOVENTACL2 = PRECIOVENTACL2;
		this.PRECIOCOMPCL2 = PRECIOCOMPCL2;
		this.DESCRIPCL2 = DESCRIPCL2;
	}

	public TBL_PRODUCTOCL2() {
		
	}
	public int getIDPRODUCTOCL2() {
		return IDPRODUCTOCL2;
	}


	public void setIDPRODUCTOCL2(int iDPRODUCTOCL2) {
		IDPRODUCTOCL2 = iDPRODUCTOCL2;
	}


	public String getNOMBRECL2() {
		return NOMBRECL2;
	}


	public void setNOMBRECL2(String nOMBRECL2) {
		NOMBRECL2 = nOMBRECL2;
	}


	public double getPRECIOVENTACL2() {
		return PRECIOVENTACL2;
	}


	public void setPRECIOVENTACL2(double pRECIOVENTACL2) {
		PRECIOVENTACL2 = pRECIOVENTACL2;
	}


	public double getPRECIOCOMPCL2() {
		return PRECIOCOMPCL2;
	}


	public void setPRECIOCOMPCL2(double pRECIOCOMPCL2) {
		PRECIOCOMPCL2 = pRECIOCOMPCL2;
	}


	public String getDESCRIPCL2() {
		return DESCRIPCL2;
	}


	public void setDESCRIPCL2(String dESCRIPCL2) {
		DESCRIPCL2 = dESCRIPCL2;
	}
	
	
}
