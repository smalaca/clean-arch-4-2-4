package com.smalaca.rentalapplication.domain.space;

import javax.persistence.Embeddable;

@Embeddable
@SuppressWarnings("PMD.UnusedPrivateMethod")
class SquareMeter {
    private Double value;

    private SquareMeter() {}

    SquareMeter(Double value) {
        this.value = value;
    }

    private Double getValue() {
        return value;
    }

    private void setValue(Double value) {
        this.value = value;
    }
}
