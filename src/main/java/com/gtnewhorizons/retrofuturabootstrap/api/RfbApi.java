package com.gtnewhorizons.retrofuturabootstrap.api;

import com.gtnewhorizons.retrofuturabootstrap.RfbSystemClassLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The public Java 8-compatible RetroFuturaBootstrap API
 */
public interface RfbApi {
    /**
     * @return The Java 9+ Platform class loader, that has access to all the classes on the standard library module path. null on Java 8.
     */
    @Nullable
    ClassLoader platformClassLoader();

    /**
     * @return The original JVM System class loader, used for loading RFB itself.
     */
    @NotNull
    ClassLoader originalSystemClassLoader();

    /**
     * @return The {@link RfbSystemClassLoader} responsible for loading coremod and mod loader classes.
     */
    @NotNull
    RfbSystemClassLoader compatClassLoader();
}
