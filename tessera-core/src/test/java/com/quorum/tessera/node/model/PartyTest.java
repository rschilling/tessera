package com.quorum.tessera.node.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PartyTest {

    @Test
    public void toStringContainsUrl() {
        final Party party = new Party("someurl");

        assertThat(party.toString()).contains("someurl");

    }

}
