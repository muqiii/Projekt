package structure;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {
    @XmlElement(name = "type")
    private String type;

    @XmlElement(name = "totalFeatures")
    private int totalFeatures;

    @XmlElementWrapper(name = "features")
    @XmlElement(name = "feature")
    private List<Feature> features;
}
