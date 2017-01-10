package ${package}.dao;

import java.util.List;

import ${package}.dto.*;
import ${package}.model.${entityName};

public interface ${entityName}Dao {

    public List<${entityName}> search(Search${entityName}Dto searchQuery);

}
