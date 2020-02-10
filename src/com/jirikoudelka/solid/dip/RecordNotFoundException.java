package com.jirikoudelka.solid.dip;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class RecordNotFoundException extends Exception {
    RecordNotFoundException() {
        super();
    }
}
