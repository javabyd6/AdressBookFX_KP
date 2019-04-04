package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person
{
    private StringProperty name;
    private StringProperty lastName;
    private StringProperty Adress;
    private StringProperty telephone;
    private StringProperty PostalCode;
    private StringProperty city;

    public Person(String name, String lastname, String adress, String city, String postalCode, String phone)
    {
        this.name = new SimpleStringProperty(name);
        this.lastName = new SimpleStringProperty(lastname);
        this.city = new SimpleStringProperty(city);
        this.telephone = new SimpleStringProperty(phone);
        this.PostalCode = new SimpleStringProperty(postalCode);
        this.Adress = new SimpleStringProperty(adress);
    }
    public Person getPeson()
    {
        return this;
    }


    public String getName()
    {
        return name.get();
    }

    public StringProperty nameProperty()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName.get();
    }

    public StringProperty lastNameProperty()
    {
        return lastName;
    }

    public String getAdress()
    {
        return Adress.get();
    }

    public StringProperty adressProperty()
    {
        return Adress;
    }

    public String getTelephone()
    {
        return telephone.get();
    }

    public StringProperty telephoneProperty()
    {
        return telephone;
    }

    public String getPostalCode()
    {
        return PostalCode.get();
    }

    public StringProperty postalCodeProperty()
    {
        return PostalCode;
    }

    public String getCity()
    {
        return city.get();
    }

    public StringProperty cityProperty()
    {
        return city;
    }

    public void setName(String name)
    {
        this.name.set(name);
    }

    public void setLastName(String lastName)
    {
        this.lastName.set(lastName);
    }

    public void setAdress(String adress)
    {
        this.Adress.set(adress);
    }

    public void setTelephone(String telephone)
    {
        this.telephone.set(telephone);
    }

    public void setPostalCode(String postalCode)
    {
        this.PostalCode.set(postalCode);
    }

    public void setCity(String city)
    {
        this.city.set(city);
    }
}
