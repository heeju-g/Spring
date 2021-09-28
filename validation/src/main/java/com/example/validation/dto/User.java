package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User {
    @NotBlank
    private String name;
    @Max(value = 90)
    private int age;

    @Email
    private String email;
    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
    private String phoneNumber;

   // @Size(min = 6, max = 6)
    //여러 곳에서 재사용가능한 custom annotation
    @YearMonth
    private String reqYearMonth; //yyyymm

    /*
    ex) dto 안에 Car 있다고 치고,
    클래스 안에 다른 객체가 있다, 오브젝트 형태인 경우엔 valid 어노테이션을 붙여줘야 검사가 된다.
    @Valid
    private List<Car> cars;
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReqYearMonth() {
        return reqYearMonth;
    }

    public void setReqYearMonth(String reqYearMonth) {
        this.reqYearMonth = reqYearMonth;
    }
    /* 해당 클래스 내에서만 사용 가능해서 재사용성 낮음
    @AssertTrue(message = "yyyyMM의 형식에 맞지 않습니다")
    public boolean isReqYearMonthValidation(){
        //dd까지 들어가야 해서 +01

        try {
            LocalDate localDate = LocalDate.parse(this.reqYearMonth+"01", DateTimeFormatter.ofPattern("yyyyMMdd"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

     */

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", reqYearMonth='" + reqYearMonth + '\'' +
                '}';
    }
}
