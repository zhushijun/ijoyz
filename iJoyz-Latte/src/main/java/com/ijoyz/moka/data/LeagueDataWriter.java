package com.ijoyz.moka.data;

import com.ijoyz.moka.model.League;

interface LeagueDataWriter {

	boolean writeTo(String[] sourceArray, League league);

}
