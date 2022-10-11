package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldReturnAreaWhenLengthAndBreadthArePositive() {
        Rectangle rectangle = new Rectangle(4.333, 2.444);
        double area = rectangle.area();
        assertThat(area, is(closeTo(10.58, 0.01)));
    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthArePositive() {
        Rectangle rectangle = new Rectangle(1.2, 3.44);
        double perimeter = rectangle.perimeter();
        assertThat(perimeter, is(closeTo(9.2, 0.1)));
    }

}
