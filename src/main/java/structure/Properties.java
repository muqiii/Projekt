package structure;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
class Properties {
    private int OBJECTID;
    private String ID;
    private String BEZEICHNUNG;
    private int BEZIRK;
    private String ADRESSE;
    private String ORT;
    private String WEBLINK1;
    private String WEBLINK2;
    private String BETREIBER;
    private String IMPFZEITEN;
    private String SE_ANNO_CAD_DATA;
}
