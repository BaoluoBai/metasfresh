package de.metas.ordercandidate.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;

/*
 * #%L
 * de.metas.ordercandidate.rest-api
 * %%
 * Copyright (C) 2018 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

@Value
public class JsonOrganization
{
	String code;
	String name;

	JsonBPartnerInfo bpartner;

	@JsonCreator
	@Builder(toBuilder = true)
	private JsonOrganization(
			@JsonProperty("code") final String code,
			@JsonProperty("name") final String name,
			@JsonProperty("bpartner") final JsonBPartnerInfo bpartner)
	{
		this.code = code;
		this.name = name;
		this.bpartner = bpartner;
	}


}
