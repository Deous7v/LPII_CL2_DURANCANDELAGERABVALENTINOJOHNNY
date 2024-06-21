package Modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCTOCL2")
@NamedQuery(name = "TBL_PRODUCTOCL2.findAll", query = "SELECT t FROM TBL_PRODUCTOCL2 t")
public class TBL_PRODUCTOCL2 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDPRODUCTOCL2;
    private String NOMBRECL2;
    private double PRECIOVENTACL2;
    private double PRECIOCOMPCL2;
    private String ESTADOCL2;
    private String DESCRIPCL2;
    
    // Constructor vacío
    public TBL_PRODUCTOCL2() {
    }

    // Constructor con parámetros
    public TBL_PRODUCTOCL2(int IDPRODUCTOCL2, String NOMBRECL2, double PRECIOVENTACL2, double PRECIOCOMPCL2, String ESTADOCL2, String DESCRIPCL2) {
        this.IDPRODUCTOCL2 = IDPRODUCTOCL2;
        this.NOMBRECL2 = NOMBRECL2;
        this.PRECIOVENTACL2 = PRECIOVENTACL2;
        this.PRECIOCOMPCL2 = PRECIOCOMPCL2;
        this.ESTADOCL2 = ESTADOCL2;
        this.DESCRIPCL2 = DESCRIPCL2;
    }

    // Getters y Setters
    public int getIDPRODUCTOCL2() {
        return IDPRODUCTOCL2;
    }

    public void setIDPRODUCTOCL2(int IDPRODUCTOCL2) {
        this.IDPRODUCTOCL2 = IDPRODUCTOCL2;
    }

    public String getNOMBRECL2() {
        return NOMBRECL2;
    }

    public void setNOMBRECL2(String NOMBRECL2) {
        this.NOMBRECL2 = NOMBRECL2;
    }

    public double getPRECIOVENTACL2() {
        return PRECIOVENTACL2;
    }

    public void setPRECIOVENTACL2(double PRECIOVENTACL2) {
        this.PRECIOVENTACL2 = PRECIOVENTACL2;
    }

    public double getPRECIOCOMPCL2() {
        return PRECIOCOMPCL2;
    }

    public void setPRECIOCOMPCL2(double PRECIOCOMPCL2) {
        this.PRECIOCOMPCL2 = PRECIOCOMPCL2;
    }

    public String getESTADOCL2() {
        return ESTADOCL2;
    }

    public void setESTADOCL2(String ESTADOCL2) {
        this.ESTADOCL2 = ESTADOCL2;
    }

    public String getDESCRIPCL2() {
        return DESCRIPCL2;
    }

    public void setDESCRIPCL2(String DESCRIPCL2) {
        this.DESCRIPCL2 = DESCRIPCL2;
    }
}
