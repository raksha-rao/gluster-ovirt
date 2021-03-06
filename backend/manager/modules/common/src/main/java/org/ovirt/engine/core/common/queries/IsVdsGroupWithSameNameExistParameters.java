package org.ovirt.engine.core.common.queries;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsVdsGroupWithSameNameExistParameters")
public class IsVdsGroupWithSameNameExistParameters extends VdcQueryParametersBase {
    private static final long serialVersionUID = 6145884648491618837L;

    public IsVdsGroupWithSameNameExistParameters(String name) {
        _name = name;
    }

    @XmlElement(name = "Name")
    private String _name;

    public String getName() {
        return _name;
    }

    @Override
    public RegisterableQueryReturnDataType GetReturnedDataTypeByVdcQueryType(VdcQueryType queryType) {
        return RegisterableQueryReturnDataType.UNDEFINED;
    }

    public IsVdsGroupWithSameNameExistParameters() {
    }
}
