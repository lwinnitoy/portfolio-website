# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Static single-page portfolio website. No build process, no package manager.

**Live site:** https://liamwinnitoy.com (deployed via Cloudflare)

To run locally: open `index.html` directly in a browser. Tailwind CSS is loaded via CDN, so an internet connection is required to see styles correctly.

## File Map

- `index.html` — entire page structure and content
- `style.css` — custom component styles (blueprint grid, terminal window, code syntax, scroll progress bar)
- `script.js` — scroll progress bar logic + smooth nav scroll
- `images/` — social icons and project screenshots
- `fonts/Roboto/` — legacy self-hosted font (no longer used; safe to delete)
- `resume.pdf` — downloadable resume (currently the Data Analytics Engineering version)
- `portfolio_home_liam_winnitoy/` — Google Stitch-generated design reference (code.html + screen.png)
- `syntactic_flux/DESIGN.md` — full design system spec (colors, typography, spacing, components)
- `image.png/screen.png` — master resume/resources document (source of truth for content)

## Design System — Syntactic Flux

Full spec in `syntactic_flux/DESIGN.md`. Key rules:

**Colors:**
```
Background:       #0f172a   (base canvas)
Surface/cards:    #1e293b   (level 1)
Border:           #334155   (ghost borders on all elevated elements)
Accent/primary:   #38bdf8   (interactive elements, active states, highlights)
Text primary:     #e2e8f0
Text muted:       #bdc8d1 / #94a3b8
Success/live:     #22d3ee
```

**Typography:**
- **Hanken Grotesk** — headings and display text
- **Inter** — body copy
- **JetBrains Mono** — labels, tags, dates, metadata, code; use ALL_CAPS for label-style chips

**Spacing:** base-4 scale. Major sections separated by `py-16` (64px). Cards use `p-6`.

**Shape:** 0.25rem (4px) radius on all components — sharp enough to feel technical.

**Elevation:** no drop shadows. Use tonal layering (`#0f172a` → `#1e293b`) + `1px solid #334155` borders. Hover state uses a subtle `box-shadow: 0 0 0 1px rgba(56,189,248,0.2)` glow.

## Layout Structure

Page sections in order: `#about` (hero), `#skills`, `#projects`, `#experience`, Other Projects, Footer.

Nav links use smooth scroll via `script.js`.

**Blueprint grid background:** `style.css` `.blueprint-grid` — 32px CSS grid of 1px `#1e293b` lines applied to `<body>`.

## Adding / Updating Content

**Skills (Technical Arsenal):** Edit the `.skill-chip` grid in `#skills`. Uses Material Symbols icons — browse at fonts.google.com/icons.

**Featured project card:** The left panel is a terminal code block (`.terminal-body` / `.code-block`). Update the `<pre>` content directly. Syntax classes: `.code-keyword`, `.code-fn`, `.code-comment`, `.code-str`, `.code-op`.

**Experience cards:** Add new `.experience-card` divs inside `#experience`. The left-border connector line (`.experience-card::before`) is automatic. Add `.current-chip` next to the job title for current roles.

**Other Projects grid:** Two-column `.project-card-sm` grid below experience. Uses Material Symbols for the icon at top-left.

## Key External Links

- Live weather dashboard: https://weather.liamwinnitoy.com
- GitHub: https://github.com/lwinnitoy
- LinkedIn: https://www.linkedin.com/in/liam-winnitoy-0507602b3/
