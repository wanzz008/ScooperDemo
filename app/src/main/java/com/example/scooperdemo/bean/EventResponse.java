package com.example.scooperdemo.bean;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EventResponse {

    private List<ContentBean> content;
    private Boolean last;
    private Integer totalElements;
    private Integer totalPages;
    private Integer numberOfElements;
    private List<SortBean> sort;
    private Boolean first;
    private Integer size;
    private Integer number;

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static class ContentBean {
        private Long dateCreated;
        private Long dateModified;
        private Boolean deleted;
        private Integer id;
        private Object type;
        private String montiName;
        private Long accidentTime;
        private String value;
        private Object sensorId;
        private String state;
        private String groupName;
        private Integer groupId;
        private String productionName;
        private String productionId;
        private Object deviceType;
        private String monitoringType;
        private String alarmPeople;
        private String alarmPeoplePhone;
        private String listenAlarmPeople;
        private String noticePeoples;
        private List<String> noticePeople;
        private String area;
        private String emergencyMeasure;
        private Boolean exercise;
        private Boolean startThePlan;
        private Object msds;
        private ArrayList<MsdsListBean> msdsList;
        private Object msdsId;
        private Object planProducer;
        private Object planProducerId;
        private Object typicalCases;
        private Object typicalCasesId;
        private CoordinateInfoBean coordinateInfo;
        private Double longitude;
        private Double latitude;
        private Double height;
        private ArrayList<TypicalCasesListBean> typicalCasesList;
        private List<?> planTemplateList;
        private String tels;
        private Object telArray;
        private String isTermination;

        public Long getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Long dateCreated) {
            this.dateCreated = dateCreated;
        }

        public Long getDateModified() {
            return dateModified;
        }

        public void setDateModified(Long dateModified) {
            this.dateModified = dateModified;
        }

        public Boolean getDeleted() {
            return deleted;
        }

        public void setDeleted(Boolean deleted) {
            this.deleted = deleted;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public String getMontiName() {
            return montiName;
        }

        public void setMontiName(String montiName) {
            this.montiName = montiName;
        }

        public Long getAccidentTime() {
            return accidentTime;
        }

        public void setAccidentTime(Long accidentTime) {
            this.accidentTime = accidentTime;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Object getSensorId() {
            return sensorId;
        }

        public void setSensorId(Object sensorId) {
            this.sensorId = sensorId;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public Integer getGroupId() {
            return groupId;
        }

        public void setGroupId(Integer groupId) {
            this.groupId = groupId;
        }

        public String getProductionName() {
            return productionName;
        }

        public void setProductionName(String productionName) {
            this.productionName = productionName;
        }

        public String getProductionId() {
            return productionId;
        }

        public void setProductionId(String productionId) {
            this.productionId = productionId;
        }

        public Object getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(Object deviceType) {
            this.deviceType = deviceType;
        }

        public String getMonitoringType() {
            return monitoringType;
        }

        public void setMonitoringType(String monitoringType) {
            this.monitoringType = monitoringType;
        }

        public String getAlarmPeople() {
            return alarmPeople;
        }

        public void setAlarmPeople(String alarmPeople) {
            this.alarmPeople = alarmPeople;
        }

        public String getAlarmPeoplePhone() {
            return alarmPeoplePhone;
        }

        public void setAlarmPeoplePhone(String alarmPeoplePhone) {
            this.alarmPeoplePhone = alarmPeoplePhone;
        }

        public String getListenAlarmPeople() {
            return listenAlarmPeople;
        }

        public void setListenAlarmPeople(String listenAlarmPeople) {
            this.listenAlarmPeople = listenAlarmPeople;
        }

        public String getNoticePeoples() {
            return noticePeoples;
        }

        public void setNoticePeoples(String noticePeoples) {
            this.noticePeoples = noticePeoples;
        }

        public List<String> getNoticePeople() {
            return noticePeople;
        }

        public void setNoticePeople(List<String> noticePeople) {
            this.noticePeople = noticePeople;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getEmergencyMeasure() {
            return emergencyMeasure;
        }

        public void setEmergencyMeasure(String emergencyMeasure) {
            this.emergencyMeasure = emergencyMeasure;
        }

        public Boolean getExercise() {
            return exercise;
        }

        public void setExercise(Boolean exercise) {
            this.exercise = exercise;
        }

        public Boolean getStartThePlan() {
            return startThePlan;
        }

        public void setStartThePlan(Boolean startThePlan) {
            this.startThePlan = startThePlan;
        }

        public Object getMsds() {
            return msds;
        }

        public void setMsds(Object msds) {
            this.msds = msds;
        }

        public ArrayList<MsdsListBean> getMsdsList() {
            return msdsList;
        }

        public void setMsdsList(ArrayList<MsdsListBean> msdsList) {
            this.msdsList = msdsList;
        }

        public Object getMsdsId() {
            return msdsId;
        }

        public void setMsdsId(Object msdsId) {
            this.msdsId = msdsId;
        }

        public Object getPlanProducer() {
            return planProducer;
        }

        public void setPlanProducer(Object planProducer) {
            this.planProducer = planProducer;
        }

        public Object getPlanProducerId() {
            return planProducerId;
        }

        public void setPlanProducerId(Object planProducerId) {
            this.planProducerId = planProducerId;
        }

        public Object getTypicalCases() {
            return typicalCases;
        }

        public void setTypicalCases(Object typicalCases) {
            this.typicalCases = typicalCases;
        }

        public Object getTypicalCasesId() {
            return typicalCasesId;
        }

        public void setTypicalCasesId(Object typicalCasesId) {
            this.typicalCasesId = typicalCasesId;
        }

        public CoordinateInfoBean getCoordinateInfo() {
            return coordinateInfo;
        }

        public void setCoordinateInfo(CoordinateInfoBean coordinateInfo) {
            this.coordinateInfo = coordinateInfo;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getHeight() {
            return height;
        }

        public void setHeight(Double height) {
            this.height = height;
        }

        public ArrayList<TypicalCasesListBean> getTypicalCasesList() {
            return typicalCasesList;
        }

        public void setTypicalCasesList(ArrayList<TypicalCasesListBean> typicalCasesList) {
            this.typicalCasesList = typicalCasesList;
        }

        public List<?> getPlanTemplateList() {
            return planTemplateList;
        }

        public void setPlanTemplateList(List<?> planTemplateList) {
            this.planTemplateList = planTemplateList;
        }

        public String getTels() {
            return tels;
        }

        public void setTels(String tels) {
            this.tels = tels;
        }

        public Object getTelArray() {
            return telArray;
        }

        public void setTelArray(Object telArray) {
            this.telArray = telArray;
        }

        public String getIsTermination() {
            return isTermination;
        }

        public void setIsTermination(String isTermination) {
            this.isTermination = isTermination;
        }

        public static class CoordinateInfoBean {
            private List<Double> coordinates;

            public List<Double> getCoordinates() {
                return coordinates;
            }

            public void setCoordinates(List<Double> coordinates) {
                this.coordinates = coordinates;
            }
        }

        public static class MsdsListBean implements Serializable {
            private Long dateCreated;
            private Long dateModified;
            private Boolean deleted;
            private Integer id;
            private String chemistryTagTitileCn;
            private String chemistryTagTitileEn;
            private String chemistryTagTitileAlias;
            private List<DeviceManagementsBean> deviceManagements;
            private String casNumber;
            private String unNumber;
            private String mainApplication;
            private String mainProdCompany;
            private Object physicalState;
            private Object explodeMax;
            private Object explodeMin;
            private Object meltingPoint;
            private Object boilingPoint;
            private Object relativeVaporDensity;
            private Object relativeDensity;
            private Object octanol;
            private Object ignitionTemperature;
            private Object saturatedVaporPressure;
            private Object burningDegree;
            private Object riskClass;
            private String riskExplain;
            private Object risk;
            private String healthRisk;
            private String physicochemicalProperty;
            private String riskCodes;
            private Object remarks;
            private Object fileName;
            private Object fileUrl;

            private boolean isExpand;

            public Long getDateCreated() {
                return dateCreated;
            }

            public void setDateCreated(Long dateCreated) {
                this.dateCreated = dateCreated;
            }

            public Long getDateModified() {
                return dateModified;
            }

            public void setDateModified(Long dateModified) {
                this.dateModified = dateModified;
            }

            public Boolean getDeleted() {
                return deleted;
            }

            public void setDeleted(Boolean deleted) {
                this.deleted = deleted;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getChemistryTagTitileCn() {
                return chemistryTagTitileCn;
            }

            public void setChemistryTagTitileCn(String chemistryTagTitileCn) {
                this.chemistryTagTitileCn = chemistryTagTitileCn;
            }

            public String getChemistryTagTitileEn() {
                return chemistryTagTitileEn;
            }

            public void setChemistryTagTitileEn(String chemistryTagTitileEn) {
                this.chemistryTagTitileEn = chemistryTagTitileEn;
            }

            public String getChemistryTagTitileAlias() {
                return chemistryTagTitileAlias;
            }

            public void setChemistryTagTitileAlias(String chemistryTagTitileAlias) {
                this.chemistryTagTitileAlias = chemistryTagTitileAlias;
            }

            public List<DeviceManagementsBean> getDeviceManagements() {
                return deviceManagements;
            }

            public void setDeviceManagements(List<DeviceManagementsBean> deviceManagements) {
                this.deviceManagements = deviceManagements;
            }

            public String getCasNumber() {
                return casNumber;
            }

            public void setCasNumber(String casNumber) {
                this.casNumber = casNumber;
            }

            public String getUnNumber() {
                return unNumber;
            }

            public void setUnNumber(String unNumber) {
                this.unNumber = unNumber;
            }

            public String getMainApplication() {
                return mainApplication;
            }

            public void setMainApplication(String mainApplication) {
                this.mainApplication = mainApplication;
            }

            public String getMainProdCompany() {
                return mainProdCompany;
            }

            public void setMainProdCompany(String mainProdCompany) {
                this.mainProdCompany = mainProdCompany;
            }

            public Object getPhysicalState() {
                return physicalState;
            }

            public void setPhysicalState(Object physicalState) {
                this.physicalState = physicalState;
            }

            public Object getExplodeMax() {
                return explodeMax;
            }

            public void setExplodeMax(Object explodeMax) {
                this.explodeMax = explodeMax;
            }

            public Object getExplodeMin() {
                return explodeMin;
            }

            public void setExplodeMin(Object explodeMin) {
                this.explodeMin = explodeMin;
            }

            public Object getMeltingPoint() {
                return meltingPoint;
            }

            public void setMeltingPoint(Object meltingPoint) {
                this.meltingPoint = meltingPoint;
            }

            public Object getBoilingPoint() {
                return boilingPoint;
            }

            public void setBoilingPoint(Object boilingPoint) {
                this.boilingPoint = boilingPoint;
            }

            public Object getRelativeVaporDensity() {
                return relativeVaporDensity;
            }

            public void setRelativeVaporDensity(Object relativeVaporDensity) {
                this.relativeVaporDensity = relativeVaporDensity;
            }

            public Object getRelativeDensity() {
                return relativeDensity;
            }

            public void setRelativeDensity(Object relativeDensity) {
                this.relativeDensity = relativeDensity;
            }

            public Object getOctanol() {
                return octanol;
            }

            public void setOctanol(Object octanol) {
                this.octanol = octanol;
            }

            public Object getIgnitionTemperature() {
                return ignitionTemperature;
            }

            public void setIgnitionTemperature(Object ignitionTemperature) {
                this.ignitionTemperature = ignitionTemperature;
            }

            public Object getSaturatedVaporPressure() {
                return saturatedVaporPressure;
            }

            public void setSaturatedVaporPressure(Object saturatedVaporPressure) {
                this.saturatedVaporPressure = saturatedVaporPressure;
            }

            public Object getBurningDegree() {
                return burningDegree;
            }

            public void setBurningDegree(Object burningDegree) {
                this.burningDegree = burningDegree;
            }

            public Object getRiskClass() {
                return riskClass;
            }

            public void setRiskClass(Object riskClass) {
                this.riskClass = riskClass;
            }

            public String getRiskExplain() {
                return riskExplain;
            }

            public void setRiskExplain(String riskExplain) {
                this.riskExplain = riskExplain;
            }

            public Object getRisk() {
                return risk;
            }

            public void setRisk(Object risk) {
                this.risk = risk;
            }

            public String getHealthRisk() {
                return healthRisk;
            }

            public void setHealthRisk(String healthRisk) {
                this.healthRisk = healthRisk;
            }

            public String getPhysicochemicalProperty() {
                return physicochemicalProperty;
            }

            public void setPhysicochemicalProperty(String physicochemicalProperty) {
                this.physicochemicalProperty = physicochemicalProperty;
            }

            public String getRiskCodes() {
                return riskCodes;
            }

            public void setRiskCodes(String riskCodes) {
                this.riskCodes = riskCodes;
            }

            public Object getRemarks() {
                return remarks;
            }

            public void setRemarks(Object remarks) {
                this.remarks = remarks;
            }

            public Object getFileName() {
                return fileName;
            }

            public void setFileName(Object fileName) {
                this.fileName = fileName;
            }

            public Object getFileUrl() {
                return fileUrl;
            }

            public void setFileUrl(Object fileUrl) {
                this.fileUrl = fileUrl;
            }

            public boolean isExpand() {
                return isExpand;
            }

            public void setExpand(boolean expand) {
                isExpand = expand;
            }

            public static class DeviceManagementsBean implements Serializable {
                private Long dateCreated;
                private Long dateModified;
                private Boolean deleted;
                private Integer id;
                private String name;
                private String code;
                private Object shortName;
                private Integer groupId;
                private String contact;
                private Object unitType;
                private Integer sort;
                private Double longitude;
                private Double height;
                private Double latitude;
                private Object description;
                private Object groupName;
                private Object treeList;

                public Long getDateCreated() {
                    return dateCreated;
                }

                public void setDateCreated(Long dateCreated) {
                    this.dateCreated = dateCreated;
                }

                public Long getDateModified() {
                    return dateModified;
                }

                public void setDateModified(Long dateModified) {
                    this.dateModified = dateModified;
                }

                public Boolean getDeleted() {
                    return deleted;
                }

                public void setDeleted(Boolean deleted) {
                    this.deleted = deleted;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public Object getShortName() {
                    return shortName;
                }

                public void setShortName(Object shortName) {
                    this.shortName = shortName;
                }

                public Integer getGroupId() {
                    return groupId;
                }

                public void setGroupId(Integer groupId) {
                    this.groupId = groupId;
                }

                public String getContact() {
                    return contact;
                }

                public void setContact(String contact) {
                    this.contact = contact;
                }

                public Object getUnitType() {
                    return unitType;
                }

                public void setUnitType(Object unitType) {
                    this.unitType = unitType;
                }

                public Integer getSort() {
                    return sort;
                }

                public void setSort(Integer sort) {
                    this.sort = sort;
                }

                public Double getLongitude() {
                    return longitude;
                }

                public void setLongitude(Double longitude) {
                    this.longitude = longitude;
                }

                public Double getHeight() {
                    return height;
                }

                public void setHeight(Double height) {
                    this.height = height;
                }

                public Double getLatitude() {
                    return latitude;
                }

                public void setLatitude(Double latitude) {
                    this.latitude = latitude;
                }

                public Object getDescription() {
                    return description;
                }

                public void setDescription(Object description) {
                    this.description = description;
                }

                public Object getGroupName() {
                    return groupName;
                }

                public void setGroupName(Object groupName) {
                    this.groupName = groupName;
                }

                public Object getTreeList() {
                    return treeList;
                }

                public void setTreeList(Object treeList) {
                    this.treeList = treeList;
                }
            }
        }

        public static class TypicalCasesListBean implements Serializable {
            private Long dateCreated;
            private Long dateModified;
            private Boolean deleted;
            private Integer id;
            private String caseName;
            private Long accidentTime;
            private Object accidentTimeString;
            private String type;
            private String keywords;
            private String level;
            private String remark;
            private Object annexUrl;
            private Object annexName;
            private Integer groupId;
            private Object groupName;

            public Long getDateCreated() {
                return dateCreated;
            }

            public void setDateCreated(Long dateCreated) {
                this.dateCreated = dateCreated;
            }

            public Long getDateModified() {
                return dateModified;
            }

            public void setDateModified(Long dateModified) {
                this.dateModified = dateModified;
            }

            public Boolean getDeleted() {
                return deleted;
            }

            public void setDeleted(Boolean deleted) {
                this.deleted = deleted;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getCaseName() {
                return caseName;
            }

            public void setCaseName(String caseName) {
                this.caseName = caseName;
            }

            public Long getAccidentTime() {
                return accidentTime;
            }

            public void setAccidentTime(Long accidentTime) {
                this.accidentTime = accidentTime;
            }

            public Object getAccidentTimeString() {
                return accidentTimeString;
            }

            public void setAccidentTimeString(Object accidentTimeString) {
                this.accidentTimeString = accidentTimeString;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public Object getAnnexUrl() {
                return annexUrl;
            }

            public void setAnnexUrl(Object annexUrl) {
                this.annexUrl = annexUrl;
            }

            public Object getAnnexName() {
                return annexName;
            }

            public void setAnnexName(Object annexName) {
                this.annexName = annexName;
            }

            public Integer getGroupId() {
                return groupId;
            }

            public void setGroupId(Integer groupId) {
                this.groupId = groupId;
            }

            public Object getGroupName() {
                return groupName;
            }

            public void setGroupName(Object groupName) {
                this.groupName = groupName;
            }
        }
    }

    public static class SortBean {
        private String direction;
        private String property;
        private Boolean ignoreCase;
        private String nullHandling;
        private Boolean descending;
        private Boolean ascending;

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public Boolean getIgnoreCase() {
            return ignoreCase;
        }

        public void setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
        }

        public String getNullHandling() {
            return nullHandling;
        }

        public void setNullHandling(String nullHandling) {
            this.nullHandling = nullHandling;
        }

        public Boolean getDescending() {
            return descending;
        }

        public void setDescending(Boolean descending) {
            this.descending = descending;
        }

        public Boolean getAscending() {
            return ascending;
        }

        public void setAscending(Boolean ascending) {
            this.ascending = ascending;
        }
    }
}
