package org.dailycodebuffer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component      // required for prototype
@Scope(scopeName = "prototype")
public class Doctor implements Staff {


    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }

//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
}
