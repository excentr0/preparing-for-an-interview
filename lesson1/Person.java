package lesson1;

public class Person {
  String firstName;
  String lastName;
  String middleName;
  String country;
  String address;
  String phone;
  String gender;
  int age;

  public static class Builder {
    private Person person;

    public Builder() {
      person = new Person();
    }

    public Builder withFirstName(String firstName) {
      person.firstName = firstName;
      return this;
    }

    public Builder withLastName(String lastName) {
      person.lastName = lastName;
      return this;
    }

    public Builder withMiddleName(String middleName) {
      person.middleName = middleName;
      return this;
    }

    public Builder withAddress(String address) {
      person.address = address;
      return this;
    }

    public Builder withCountry(String country) {
      person.country = country;
      return this;
    }

    public Builder withPhone(String phone) {
      person.phone = phone;
      return this;
    }

    public Builder withGender(String gender) {
      person.gender = gender;
      return this;
    }

    public Builder withAge(int age) {
      person.age = age;
      return this;
    }

    public Person build() {
      return person;
    }

  }

  public static void main(String[] args) {
    Person person = new Person.Builder().withLastName("Mike").withLastName("Lastname")
        .withAge(42).withCountry("Russia").build();

    System.out.println(person);
  }

  @Override
  public String toString() {
    StringBuilder builder2 = new StringBuilder();
    builder2.append("Person [address=").append(address).append(", age=").append(age)
        .append(", country=").append(country).append(", firstName=").append(firstName)
        .append(", gender=").append(gender).append(", lastName=").append(lastName)
        .append(", middleName=").append(middleName).append(", phone=").append(phone)
        .append("]");
    return builder2.toString();
  }
}