# Copilot Instructions

## Project Overview

Static single-page portfolio website. No build process, no dependencies, no package manager. Open `index.html` directly in a browser to run locally.

**Live site:** https://lwinnitoy.github.io/portfolio-website/ (auto-deployed via GitHub Pages on push)

## File Structure

- `index.html` — entire page structure and content
- `proj1Style.css` — all styles
- `proj1.js` — scroll progress bar logic + smooth nav scroll
- `images/` — project screenshots and social icons
- `fonts/Roboto/` — self-hosted Roboto font

## CSS Conventions

All colors and spacing use CSS variables defined in `:root` at the top of `proj1Style.css`:

```css
--color-bg: #0a192f
--color-text: #e6f1ff
--color-accent: #64ffda      /* teal — used for highlights, borders, tags */
--color-section-bg: #112240
--color-border: #233554
```

Always use these variables rather than hardcoded values. The dot-grid background pattern on section backgrounds uses:
```css
background-image: radial-gradient(circle, var(--color-border) 1px, transparent 1px);
background-size: 20px 20px;
```

## Adding a Project

See `PROJECT_TEMPLATE.md` for the full HTML template. Add new `<article class="project-card">` elements inside `<div class="projects-container">` in `index.html`.

- Project images go in `images/` and are referenced as `src="images/filename.png"`
- The CSS automatically alternates image left/right: odd cards show image on the left, even cards swap it to the right via `.project-card:nth-child(even) .project-image { order: 2; }`
- Place more impressive/recent projects first

## Progress Bar

The vertical scroll progress bar (`#progress-wrapper`) has three position states managed in `proj1.js`:
- **Absolute at 80% of page** — before user has scrolled enough
- **Fixed** — while scrolling through main content
- **Absolute near contact section** — stops before the footer

It is hidden on mobile via `@media (max-width: 768px)`.

## Sections

Page sections in order: `#home` (hero), `#about`, `#skills`, `#education`, `#projects`, `#contact`. Navigation links use smooth scroll handled in `proj1.js`.
