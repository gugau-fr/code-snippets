package ${package}.dto;

import java.util.List;

import ${package}.model.${entityName};

public class ${entityName}ResultDto {

    private Integer total;
    private List<${entityName}> results;
    
    private Integer getTotal() {
        return total;
    }
    
    private void setTotal(Integer total) {
        this.total = total;
    }
    
    private List<${entityName}> getResults() {
        return results;
    }
    
    private void setResults(List<${entityName}> results) {
        this.results = results;
    }

}
