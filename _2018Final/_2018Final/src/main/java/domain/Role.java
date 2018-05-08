package domain;

/**
 * Created by rodrique on 19/7/2018.
 */
public class Role
{
   
    private String jobDescription;
   
    public Role() {
    }

    public Role(Role.Builder builder) {

        this.jobDescription = builder.jobDescription;
    }

    public String getjobDescription() {
        return jobDescription;
    }

    public static class Builder{

        private String jobDescription;


        public Builder(){}



        public Role.Builder jobDescription(String value)
        {
            this.jobDescription = value;
            return this;

        }



        public Role.Builder copy(Role value) {

            this.jobDescription = value.jobDescription;

            return this;
        }

        public Role build()
        {
            return new Role(this);
        }

    }

}
