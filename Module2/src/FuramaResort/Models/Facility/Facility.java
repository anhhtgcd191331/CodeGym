package FuramaResort.Models.Facility;

public abstract class Facility {
    private String IdService;
    private String serviceName;
    private double areaUsing;
    private long priceOfService;
    private int limitNumberPeople;
    private String typeOfRental;

    public Facility(String IdService, String serviceName, double areaUsing, long priceOfService, int limitNumberPeople, String typeOfRental) {
        this.IdService = IdService;
        this.serviceName = serviceName;
        this.areaUsing = areaUsing;
        this.priceOfService = priceOfService;
        this.limitNumberPeople = limitNumberPeople;
        this.typeOfRental = typeOfRental;
    }

    public String getIdService() {
        return IdService;
    }

    public void setIdService(String idService) {
        IdService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(double areaUsing) {
        this.areaUsing = areaUsing;
    }

    public long getPriceOfService() {
        return priceOfService;
    }

    public void setPriceOfService(long priceOfService) {
        this.priceOfService = priceOfService;
    }

    public int getLimitNumberPeople() {
        return limitNumberPeople;
    }

    public void setLimitNumberPeople(int limitNumberPeople) {
        this.limitNumberPeople = limitNumberPeople;
    }

    public String getTypeOfRental() {
        return typeOfRental;
    }

    public void setTypeOfRental(String typeOfRental) {
        this.typeOfRental = typeOfRental;
    }

    @Override
    public String toString() {
        return "IdService='" + IdService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUsing=" + areaUsing +
                ", priceOfService=" + priceOfService +
                ", limitNumberPeople=" + limitNumberPeople +
                ", typeOfRental='" + typeOfRental + '\'';
    }
    public String simpleString(){
        return IdService+","+serviceName+","+areaUsing+","+priceOfService+","+limitNumberPeople+","+typeOfRental;
    }
}
