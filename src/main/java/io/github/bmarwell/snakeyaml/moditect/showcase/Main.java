/*
 * Copyright 2020 @bmarwell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.bmarwell.snakeyaml.moditect.showcase;

import org.yaml.snakeyaml.Yaml;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Yaml yaml = new Yaml();
        List<Map<String, String>> load = yaml.load(Main.class.getResourceAsStream("test.yaml"));

        load.forEach(Main::printMap);
    }

    private static void printMap(Map<String, String> stringStringMap) {
        System.out.println("id: [" + stringStringMap.get("id") + "].");
        System.out.println("name: [" + stringStringMap.get("name") + "].");
    }
}
