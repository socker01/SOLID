package com.jirikoudelka.solid;

import com.jirikoudelka.shared.ReplacementMethod;
import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

/**
 * Represents the publication manager
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
public final class PublicationManager {

	private final ReplacementMethod replacementMethod;

	public PublicationManager(ReplacementMethod replacementMethod) {
		this.replacementMethod = Objects.requireNonNull(replacementMethod);
	}

	private void replacePublication(Publication publication) {
		switch (replacementMethod) {
			case REPAIR:
				System.out.println("Publication has been repaired.");
				break;
			case REMOVE_FROM_BOOKSHELF:
				System.out.println("Publication has been removed.");
				break;
			default:
				System.out.println("Unknown method of the replacement.");
		}
	}

	void inspectPublication(Publication publication) {
		Objects.requireNonNull(publication);

		if (publication.isReadyForReplacement()) {
			replacePublication(publication);
		}
	}

}
