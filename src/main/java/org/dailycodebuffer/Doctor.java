package org.dailycodebuffer;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component      // required for prototype
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {


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

    // this is called before object creation
    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name method");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct is called");
    }

//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
}
