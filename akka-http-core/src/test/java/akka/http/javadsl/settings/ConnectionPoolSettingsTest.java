/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.javadsl.settings;

import akka.actor.ActorSystem;
import org.junit.Test;
import org.scalatest.junit.JUnitSuite;

public class ConnectionPoolSettingsTest extends JUnitSuite {

    @Test
    public void testCreateWithActorSystem() {
        ActorSystem sys = ActorSystem.create("test");
        ConnectionPoolSettings settings = ConnectionPoolSettings.create(sys);
    }
}
