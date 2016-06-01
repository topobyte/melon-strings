// Copyright 2018 Sebastian Kuerten
//
// This file is part of melon-strings.
//
// melon-strings is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// melon-strings is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with melon-strings. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.melon.strings;

import org.junit.Assert;
import org.junit.Test;

public class TestStrings
{

	@Test
	public void test()
	{
		Assert.assertEquals("", Strings.repeat("a", 0));
		Assert.assertEquals("a", Strings.repeat("a", 1));
		Assert.assertEquals("aa", Strings.repeat("a", 2));
		Assert.assertEquals("aaa", Strings.repeat("a", 3));
		Assert.assertEquals("aaaa", Strings.repeat("a", 4));

		Assert.assertEquals("", Strings.repeat("ab", 0));
		Assert.assertEquals("ab", Strings.repeat("ab", 1));
		Assert.assertEquals("abab", Strings.repeat("ab", 2));
	}

	@Test
	public void testBuffer()
	{
		StringBuilder buffer = new StringBuilder();
		buffer.append("test-");

		Strings.repeat(buffer, "a", 0);
		Assert.assertEquals("test-", buffer.toString());

		Strings.repeat(buffer, "a", 1);
		Assert.assertEquals("test-a", buffer.toString());

		Strings.repeat(buffer, "b", 2);
		Assert.assertEquals("test-abb", buffer.toString());
	}

}
