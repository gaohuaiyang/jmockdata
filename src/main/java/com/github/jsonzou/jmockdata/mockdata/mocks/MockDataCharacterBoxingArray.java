
package com.github.jsonzou.jmockdata.mockdata.mocks;

import com.github.jsonzou.jmockdata.mockdata.JMockDataManager;
import com.github.jsonzou.jmockdata.mockdata.JmockDataContext;
import com.github.jsonzou.jmockdata.mockdata.MockData;
import com.github.jsonzou.jmockdata.mockdata.constants.MockType;

/**
 *  mock the Character data
 * Created by jsonzou on 2016/12/16.
 */
public class MockDataCharacterBoxingArray implements MockData<Character[]> {
    public Character[] mock(JmockDataContext context) {
        return JMockDataManager.getInstance().getMockTemplate().mockCharacterBoxingArray(context);
    }
    public MockType mockType() {
        return MockType.STRING;
    }
}
