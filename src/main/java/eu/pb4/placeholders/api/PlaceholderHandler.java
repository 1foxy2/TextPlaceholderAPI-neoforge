package eu.pb4.placeholders.api;


@FunctionalInterface
public interface PlaceholderHandler {
    PlaceholderHandler EMPTY = (ctx, arg) -> PlaceholderResult.invalid();
    PlaceholderResult onPlaceholderRequest(PlaceholderContext context, String argument);
}
