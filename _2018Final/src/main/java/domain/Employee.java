package domain;

import java.io.Serializable;

/**
 * Created by rodrique on 4/23/2018.
 */
public class Employee implements Serializable
{
    private Long id;
    private String empNum;
    private String empName;
    private String address;
    private String telephone;

    // private List<Chef> chefs;

    private Employee() {    }

    public Employee(Builder builder) {
        this.id = builder.id;
        this.empNum = builder.empNum;
        this.empName = builder.empName;
        this.address = builder.address;
        this.telephone = builder.telephone;
        //this.chefs = builder.chefs;
    }

    public static class Builder {
        Long id;
        String empNum;
        String empName;
        String address;
        String telephone;
        //List<Chef> chefs;

        public Builder(){}

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder empNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder empName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

//        public Builder chefs(List<Chef> chefs) {
//            this.chefs = chefs;
//            return this;
//        }


        public Builder copy(Employee value) {
            this.id = value.id;
            this.empNum = value.empNum;
            this.empName = value.empName;
            this.address = value.address;
            this.telephone = value.telephone;
            // this.chefs = value.chefs;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }


    public Long getId() {
        return id;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    //public List<Chef> getChefs() {
//        return chefs;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Employee employee = (Employee) o;
//
//        return id.equals(employee.id);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
//    }
}
