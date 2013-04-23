package com.ijoyz.moka.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ijoyz.moka.model.League;

public class DataInject {

	private static Map<String, LeagueDataWriter> methodMap = new LinkedHashMap<String, LeagueDataWriter>();

	static {
		methodMap.put("综合信息", new GeneralLeagueDataWriter());
		methodMap.put("辅助信息", new SupplyLeagueDataWriter());
		methodMap.put("输出量", new DamageDataWriter());
		methodMap.put("承受攻击量", new BearDamageDataWriter());
		methodMap.put("治疗量", new CureDataWriter());
		methodMap.put("战车统计", new ChariotDataWriter());
	}

	public void injectData(League league, Iterable<String> iterable) {
		LeagueDataWriter writer = null;
		for (String string : iterable) {
			if (StringUtils.isBlank(string)) {
				if (string == null) {
					return;
				}
				continue;
			}
			String[] split = StringUtils.split(string, ' ');
			if (split.length == 1) {
				LeagueDataWriter tempWriter = methodMap.get(split[0]);
				if (tempWriter != null) {
					writer = tempWriter;
				}
			}
			if (writer != null) {
				writer.writeTo(split, league);
			}
		}

	}

	public void injectData(League league, InputStream input) {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		try {
			injectData(league, new Iterable<String>() {
				@Override
				public Iterator<String> iterator() {
					return new Iterator<String>() {

						@Override
						public void remove() {

						}

						@Override
						public String next() {
							try {
								return reader.readLine();
							} catch (IOException e) {
								return null;
							}
						}

						@Override
						public boolean hasNext() {
							try {
								return reader.ready();
							} catch (IOException e) {
								return false;
							}
						}
					};
				}
			});
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
			}
		}

	}

}
