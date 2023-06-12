package structure;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
class Feature {
    private String type;
    private String id;
    @XmlElement(name = "geometry")
    private List<Geometry> geometries;
    @XmlElement(name = "geometry_name")
    private String geometryName;
    @XmlElement(name = "properties")
    private List<Properties> properties;
}
