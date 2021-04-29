import java.util.ArrayList;

public class Donor
{
  //Instance data
  private String name;
  private ArrayList<Double> donations;

  //Donor Constructors
  public Donor(String name)
  {
    this.name = name; 
  }
  
  public Donor(String name, double donation)
  {
    this.name = name;
    this.donations = new ArrayList<Double>();
    donations.add(donation);
  }
  
  //Accessors
  public String getName()
  {
    return name;
  }

  public double getTotalDonations()
  {
    double amount = 0.0;
    for(int index = 0; index < donations.size(); ++index)
    {
      amount += donations.get(index);
    }
    return amount;
  }
  
  public String toString()
  {
    String result = name + " ";
    for(int index = 0; index < donations.size(); ++index)
    {
      result += donations.get(index);
    }
    return result;
  }

  public void addDonation(double donation)
  {
    donations.add(donation);
  }
}
