package ${package}.dao.impl;

import java.util.List;

import ${package}.dao.${entityName}Dao;
import ${package}.dto.*;
import ${package}.model.${entityName};

public class ${entityName}DaoImpl implements ${entityName}Dao {

    @Override
    public List<${entityName}> search(Search${entityName}Dto searchQuery) {
        //TODO implements database search
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
