package com.datascienceacademy.backenddatascienceacademy.dto;


public class ModuleDto {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    private String moduleName;
    private Integer mark;

    public ModuleDto(Long id, String moduleName, Integer mark) {
        this.id = id;
        this.moduleName = moduleName;
        this.mark = mark;
    }
    // getters & setters omitted for brevity

}
