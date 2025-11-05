package student2.repository;

import static student2.repository.JDBCUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;

public class StudentDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    // insert
    public int insert(StudentDTO studentDTO) {
        int result = 0;
        try {
            String sql = "insert into student VALUES (?,?,?,?);";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentDTO.getStudentId());
            pstmt.setString(2, studentDTO.getName());
            pstmt.setDouble(3, studentDTO.getHeight());
            pstmt.setString(4, studentDTO.getDeptId());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // delete : studentId
    public int delete(String studentId) {
        int result = 0;
        try {
            String sql = "delete from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // update : height 수정
    public int update(StudentDTO studentDTO) {
        int result = 0;
        try {
            String sql = "update student set height = ? WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, studentDTO.getHeight());
            pstmt.setString(2, studentDTO.getStudentId());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // 학생전체 조회(dept_id 이용)
    public List<StudentDTO> getList(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "select * from student where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                StudentDTO studentDTO = new StudentDTO();
                studentDTO.setStudentId(rs.getString("student_id"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setHeight(rs.getDouble("height"));
                studentDTO.setDeptId(rs.getString("dept_id"));
                list.add(studentDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

    // 학생조회(1명 = studentId로)
    public StudentDTO getRow(String studentId) {
        StudentDTO studentDTO = null;
        try {
            String sql = "select * from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                studentDTO = new StudentDTO();
                studentDTO.setStudentId(rs.getString("student_id"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setHeight(rs.getDouble("height"));
                studentDTO.setDeptId(rs.getString("dept_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return studentDTO;
    }
}
