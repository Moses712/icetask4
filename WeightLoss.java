abstract class WeightLoss implements IWeightLoss{
    String CustomerName;
    double WeightLoss;

    public WeightLoss(WeightLossModel model) {
        this.CustomerName= model.CustomerName;
        this.WeightLoss = model.WeightLoss;
    }
    @Override
    public String getCustomerName() {
        return CustomerName;
    }

    @Override
    public double getWeightLoss() {
        return WeightLoss;
    }
}
