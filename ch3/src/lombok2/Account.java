package lombok2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    private String name;
    private String accNo;
    private int balance;

    // 생성자 , getter, setter , toString() => 어노테이션 처리
    // equals
}
