# gen

To install dependencies:

```bash
bun install
```

To regenerate icons:

```bash
bun run gen
```

Pass one or more icon names to regenerate only those icons:

```bash
bun run gen internet circle
```

The generator uses a continuous worker pool with 32 concurrent downloads by
default. Adjust it when the CDN or local network needs a different limit:

```bash
bun run gen --concurrency=16
bun run gen --concurrency=48 internet circle
```

To verify the converter:

```bash
bun run test
bun run typecheck
```

This project was created using `bun init` in bun v1.2.23. [Bun](https://bun.com) is a fast all-in-one JavaScript runtime.
