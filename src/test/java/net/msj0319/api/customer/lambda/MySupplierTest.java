package net.msj0319.api.customer.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MySupplierTest {
    @Test
    void main() {
        Supplier<String> stringSupplier = () -> new String("no Pain, no Gain");
        assertThat(stringSupplier.get(), is(equalTo("no Pain, no Gain")));
    }
}