# Parallel Change Kata - Rust Implementation

This is a Rust implementation of the Parallel Change kata.

## Building and Testing

To run the tests:

```bash
cargo test
```

To run tests with output:

```bash
cargo test -- --nocapture
```

To check code coverage (requires `cargo-tarpaulin`):

```bash
cargo tarpaulin --out Html
```

To format the code:

```bash
cargo fmt
```

To run the linter:

```bash
cargo clippy -- -D warnings
```

## The Kata

Using **Parallel Change**, modify the `ShoppingCart` struct to handle multiple items instead of a single one.
Tests have already been written.

### Rules

The tests must not be red at any time. No compile-errors, no failures.
