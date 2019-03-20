
package Objects;

public class Paciente {
    
    private String m_strNombre;
    private String m_strApellido;
    private String m_strGender;
    private String m_strSymptoms;
    
    private int m_iBirthYear;
    private int m_iBirthMonth;
    private int m_iBirthDay;

    public Paciente(String m_strNombre, String m_strApellido, String m_strGender, String m_strSymptoms, int m_iBirthYear, int m_iBirthMonth, int m_iBirthDay) {
        this.m_strNombre = m_strNombre;
        this.m_strApellido = m_strApellido;
        this.m_strGender = m_strGender;
        this.m_strSymptoms = m_strSymptoms;
        this.m_iBirthYear = m_iBirthYear;
        this.m_iBirthMonth = m_iBirthMonth;
        this.m_iBirthDay = m_iBirthDay;
    }

    public String getM_strNombre() {
        return m_strNombre;
    }

    public void setM_strNombre(String m_strNombre) {
        this.m_strNombre = m_strNombre;
    }

    public String getM_strApellido() {
        return m_strApellido;
    }

    public void setM_strApellido(String m_strApellido) {
        this.m_strApellido = m_strApellido;
    }

    public String getM_strGender() {
        return m_strGender;
    }

    public void setM_strGender(String m_strGender) {
        this.m_strGender = m_strGender;
    }

    public String getM_strSymptoms() {
        return m_strSymptoms;
    }

    public void setM_strSymptoms(String m_strSymptoms) {
        this.m_strSymptoms = m_strSymptoms;
    }

    public int getM_iBirthYear() {
        return m_iBirthYear;
    }

    public void setM_iBirthYear(int m_iBirthYear) {
        this.m_iBirthYear = m_iBirthYear;
    }

    public int getM_iBirthMonth() {
        return m_iBirthMonth;
    }

    public void setM_iBirthMonth(int m_iBirthMonth) {
        this.m_iBirthMonth = m_iBirthMonth;
    }

    public int getM_iBirthDay() {
        return m_iBirthDay;
    }

    public void setM_iBirthDay(int m_iBirthDay) {
        this.m_iBirthDay = m_iBirthDay;
    }
    
    
    
    
    
}
