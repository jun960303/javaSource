package student2.dto;

import lombok.*;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class StudentDTO {
    // 테이블 모양
    private String studentId;
    private String name;
    private double height;
    private String deptId;

    // public StudentDTO() {
    // }

    // @Override
    // public String toString() {
    // return "StudentDTO [studentId=" + studentId + ", name=" + name + ", height="
    // + height + ", deptId=" + deptId
    // + "]";
    // }

    // public String getStudentId() {
    // return studentId;
    // }

    // public void setStudentId(String studentId) {
    // this.studentId = studentId;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public double getHeight() {
    // return height;
    // }

    // public void setHeight(double height) {
    // this.height = height;
    // }

    // public String getDeptId() {
    // return deptId;
    // }

    // public void setDeptId(String deptId) {
    // this.deptId = deptId;
    // }

}
