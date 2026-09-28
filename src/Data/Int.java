    public static Object fromNumberImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (n) -> {
        double d = ((Number) n).doubleValue();
        if ((int) d == d) {
            return ((java.util.function.Function<Object, Object>) just).apply((int) d);
        }
        return nothing;
    };

    public static Object toNumber = (java.util.function.Function<Object, Object>) (n) -> {
        return ((Integer) n).doubleValue();
    };

    public static Object fromStringAsImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (radixObj) -> {
        int radix = (Integer) radixObj;
        return (java.util.function.Function<Object, Object>) (s) -> {
            try {
                int i = Integer.parseInt((String) s, radix);
                return ((java.util.function.Function<Object, Object>) just).apply(i);
            } catch (NumberFormatException e) {
                return nothing;
            }
        };
    };

    public static Object toStringAs = (java.util.function.Function<Object, Object>) (radixObj) -> (java.util.function.Function<Object, Object>) (i) -> {
        int radix = (Integer) radixObj;
        return Integer.toString((Integer) i, radix);
    };

    public static Object quot = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> {
        return (Integer) x / (Integer) y;
    };

    public static Object rem = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> {
        return (Integer) x % (Integer) y;
    };

    public static Object pow = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> {
        return (int) Math.pow((Integer) x, (Integer) y);
    };
