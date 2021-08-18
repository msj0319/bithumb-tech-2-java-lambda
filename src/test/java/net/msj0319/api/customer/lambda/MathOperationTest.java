package net.msj0319.api.customer.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
        MathOperation plus = (a, b) -> a + b;
        MathOperation minus = (a, b) -> a - b;
        MathOperation multiple = (a, b) -> a * b;
        MathOperation divison = (a, b) -> a / b;

        //테스트를 위한 검증 코드
        //여러 테스트를 만들고 하나라도 틀리면 어떤 입력값에서 틀렸는지 확인도 할 수 있다.
        assertThat(plus.main(3,5), is(equalTo(8)));
        assertThat(minus.main(3,5), is(equalTo(-2)));
        assertThat(multiple.main(3,5), is(equalTo(15)));
        assertThat(divison.main(3,5), is(equalTo(0)));

    }
}