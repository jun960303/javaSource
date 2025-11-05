package student2.ui;

import java.util.List;

import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {

    // 새 학생 정보 입력받기
    public StudentDTO insertStudent(Scanner sc) {

        System.out.print("아이디 >> ");
        String stuId = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();
        System.out.print("키 >> ");
        Double height = Double.parseDouble(sc.nextLine());
        System.out.print("학과코드 >> ");
        String deptId = sc.nextLine();

        return new StudentDTO(stuId, name, height, deptId);
    }

    public StudentDTO updateStudent(Scanner sc) {
        System.out.print("아이디 >> ");
        String stuId = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();

        StudentDTO sDto = new StudentDTO();
        sDto.setStudentId(stuId);
        sDto.setHeight(height);
        return sDto;
    }

    public String deleteStudent(Scanner sc) {
    }

    public String getDeptStudent(Scanner sc) {
    }

    public String getStudentId(Scanner sc) {
    }
    //

    // 새 교수 정보 입력받기
    public ProfessorDTO insertProfessor(Scanner sc) {

        System.out.print("아이디 >> ");
        String profId = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();
        System.out.print("학과코드 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, name, deptId);
    }

    public ProfessorDTO updateProfessor(Scanner sc) {
        // 수정할 교수 아이디 받기
        System.out.println("===== 수정할 교수 정보 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        System.out.print("변경학과 코드 >> ");
        String deptId = sc.nextLine();

        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfId(profId);
        professorDTO.setDeptId(deptId);
        return professorDTO;
    }

    public String deleteProfessor(Scanner sc) {
        // 삭제할 교수 아이디 받기
        System.out.println("===== 삭제할 교수 정보 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }

    public String selectProfessor(Scanner sc) {
        // 특정교수 조회
        System.out.println("===== 교수 조회 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }

    public void printProfessor(ProfessorDTO dto) {
        System.out.println("교수번호 : " + dto.getProfId());
        System.out.println("교수명 : " + dto.getProfName());
        System.out.println("학과번호 : " + dto.getDeptId());

    }

    public String getDeptId(Scanner sc) {
        System.out.println("\n----- 학과 정보 입력 -----");
        System.out.print("학과번호 >> ");
        String deptId = sc.nextLine();

        return deptId;
    }

    public DeptDTO setDept(Scanner sc) {
        System.out.println("\n----- 학과 정보 입력 -----");

        // System.out.print("학과코드 >> ");
        // String deptId = sc.nextLine();
        // System.out.print("학과명 >> ");
        // String deptName = sc.nextLine();
        // return new DeptDTO(deptId, deptName);

        DeptDTO dto = new DeptDTO();
        System.out.print("학과코드 >> ");
        dto.setDeptId(sc.nextLine());
        System.out.print("학과명 >> ");
        dto.setDeptName(sc.nextLine());
        return dto;
    }

    public String getDeptName(Scanner sc) {
        System.out.print("학과명 >> ");
        String deptName = sc.nextLine();
        return deptName;
    }

    public void print(DeptDTO deptDTO) {
        System.out.println("\n----- 학과 정보 -----");
        System.out.println("학과번호\t학과명");
        System.out.println("----------------------------");
        System.out.print(deptDTO.getDeptId() + "\t");
        System.out.println(deptDTO.getDeptName());
    }

    public void printAll(List<DeptDTO> list) {
        System.out.println("\n----- 전체 학과 정보 -----");
        System.out.println("학과번호\t학과명");
        System.out.println("----------------------------");
        for (DeptDTO deptDTO : list) {
            System.out.print(deptDTO.getDeptId() + "\t");
            System.out.println(deptDTO.getDeptName());
        }

    }
}
