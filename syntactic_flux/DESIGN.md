---
name: Syntactic Flux
colors:
  surface: '#0b1326'
  surface-dim: '#0b1326'
  surface-bright: '#31394d'
  surface-container-lowest: '#060e20'
  surface-container-low: '#131b2e'
  surface-container: '#171f33'
  surface-container-high: '#222a3d'
  surface-container-highest: '#2d3449'
  on-surface: '#dae2fd'
  on-surface-variant: '#bdc8d1'
  inverse-surface: '#dae2fd'
  inverse-on-surface: '#283044'
  outline: '#87929a'
  outline-variant: '#3e484f'
  surface-tint: '#7bd0ff'
  primary: '#8ed5ff'
  on-primary: '#00354a'
  primary-container: '#38bdf8'
  on-primary-container: '#004965'
  inverse-primary: '#00668a'
  secondary: '#b9c8de'
  on-secondary: '#233143'
  secondary-container: '#39485a'
  on-secondary-container: '#a7b6cc'
  tertiary: '#ffc176'
  on-tertiary: '#472a00'
  tertiary-container: '#f1a02b'
  on-tertiary-container: '#613b00'
  error: '#ffb4ab'
  on-error: '#690005'
  error-container: '#93000a'
  on-error-container: '#ffdad6'
  primary-fixed: '#c4e7ff'
  primary-fixed-dim: '#7bd0ff'
  on-primary-fixed: '#001e2c'
  on-primary-fixed-variant: '#004c69'
  secondary-fixed: '#d4e4fa'
  secondary-fixed-dim: '#b9c8de'
  on-secondary-fixed: '#0d1c2d'
  on-secondary-fixed-variant: '#39485a'
  tertiary-fixed: '#ffddb8'
  tertiary-fixed-dim: '#ffb960'
  on-tertiary-fixed: '#2a1700'
  on-tertiary-fixed-variant: '#653e00'
  background: '#0b1326'
  on-background: '#dae2fd'
  surface-variant: '#2d3449'
  surface-raised: '#1e293b'
  border-subtle: '#334155'
  text-main: '#e2e8f0'
  success-cyan: '#22d3ee'
  pipeline-flow: '#7dd3fc'
typography:
  display-lg:
    fontFamily: Hanken Grotesk
    fontSize: 48px
    fontWeight: '700'
    lineHeight: '1.1'
    letterSpacing: -0.02em
  display-lg-mobile:
    fontFamily: Hanken Grotesk
    fontSize: 32px
    fontWeight: '700'
    lineHeight: '1.2'
  headline-md:
    fontFamily: Hanken Grotesk
    fontSize: 24px
    fontWeight: '600'
    lineHeight: '1.4'
  body-md:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.6'
  code-sm:
    fontFamily: JetBrains Mono
    fontSize: 14px
    fontWeight: '400'
    lineHeight: '1.5'
  label-caps:
    fontFamily: JetBrains Mono
    fontSize: 12px
    fontWeight: '600'
    lineHeight: '1'
    letterSpacing: 0.05em
rounded:
  sm: 0.125rem
  DEFAULT: 0.25rem
  md: 0.375rem
  lg: 0.5rem
  xl: 0.75rem
  full: 9999px
spacing:
  base: 4px
  container-max: 1200px
  gutter: 24px
  margin-mobile: 16px
  stack-sm: 8px
  stack-md: 24px
  stack-lg: 64px
---

## Brand & Style

The design system is engineered for the high-precision world of data architecture and backend engineering. It targets a technical audience—hiring managers and fellow engineers—who value clarity, efficiency, and structural integrity. 

The aesthetic is **Modern Technical Minimalism**, drawing heavily from IDE environments and dashboard interfaces. It utilizes a deep-space canvas to reduce eye strain and emphasizes a "code-first" philosophy. Visual interest is generated through subtle structural elements like rhythmic grids and data-viz-inspired accents rather than decorative imagery. The emotional response is one of absolute reliability, systematic thinking, and understated sophistication.

## Colors

This design system utilizes a sophisticated "Night Owl" palette optimized for technical readability. 

- **Primary (#38bdf8):** An electric cyan used exclusively for interactive elements, syntax highlighting, and progress indicators. It serves as the "active state" signal.
- **Surface Strategy:** The background uses a deep navy-slate (#0f172a). Structural sections and cards utilize a slightly lighter navy (#1e293b) to create perceived depth without relying on drop shadows.
- **Typography Tiers:** Text follows a strict hierarchy—Primary content in High-Contrast Slate (#e2e8f0), secondary meta-data in Muted Blue-Grey (#94a3b8).
- **Borders:** A defining characteristic of the system. Instead of shadows, surfaces are separated by low-contrast borders (#334155) to maintain a flat, architectural feel.

## Typography

The typographic system is a hybrid of high-performance Sans-Serifs and Monospaced fonts, mirroring the intersection of user interface and terminal.

1. **Hanken Grotesk (Headlines):** Used for large display titles and section headings. It provides a sharp, contemporary "engineered" look with excellent geometry.
2. **Inter (Body):** The workhorse for long-form content. Its neutral, utilitarian personality ensures that complex technical descriptions remain legible at any scale.
3. **JetBrains Mono (Technical/Metadata):** Essential for the data-centric nature of the portfolio. Use this for labels, tags, code snippets, and data metrics to signal a "pro-tool" environment.

**Style Rule:** Use All-Caps for labels (e.g., "DATABASE_SIZE") in JetBrains Mono to reinforce the technical schema feel.

## Layout & Spacing

The layout is governed by a **Rigid Grid System** that reflects the structured nature of data pipelines.

- **Grid Model:** A 12-column fixed-width grid (max 1200px) for desktop, collapsing to a single-column fluid layout for mobile.
- **The "Blueprint" Overlay:** On large screens, implement a subtle background pattern using a 32px CSS grid of fine 1px lines in `#1e293b` to evoke the feeling of a technical drawing.
- **Rhythm:** Spacing follows a base-4 power scale. Use `stack-lg` (64px) between major sections to provide the necessary whitespace for a clean, professional feel.
- **Data Denseness:** Lists and tables should maintain a medium-high density, using `stack-sm` for internal padding to maximize information visibility without feeling cluttered.

## Elevation & Depth

This design system rejects traditional shadows in favor of **Tonal Layering and Outlines**.

- **Surface Levels:** 
    - Level 0 (Base): `#0f172a`
    - Level 1 (Cards/Sections): `#1e293b`
    - Level 2 (Popovers/Tooltips): `#334155`
- **Ghost Borders:** Every elevated element (cards, buttons, inputs) must have a 1px solid border of `#334155`. 
- **Active State Glow:** Instead of a shadow, active or hovered elements may use a subtle, zero-blur outer glow (spread: 1px) using the Primary color at 20% opacity.
- **Z-Axis:** Depth is communicated by "Stacking" rather than "Floating." High-priority items are lighter in color, not just visually "closer."

## Shapes

The shape language is **Soft-Technical**. 

- **Radius:** A consistent 0.25rem (4px) radius is applied to all components. This is enough to feel modern and accessible, but sharp enough to maintain a serious, professional edge.
- **Geometric Accents:** Use 45-degree chamfered corners for "Status Chips" or "Process Nodes" to differentiate them from standard UI buttons.
- **Iconography:** Use stroke-based icons (2px weight) with squared terminals. Avoid rounded, bubbly icons.

## Components

- **Buttons:** Primary buttons use a solid `#38bdf8` background with `#0f172a` text. Secondary buttons are "Ghost" style: 1px border of `#334155` with `#e2e8f0` text, shifting to a primary border on hover.
- **Data Cards:** Rectangular containers with Level 1 background and Level 2 border. Include a "Header" section within the card using a subtle bottom-border to separate titles from content.
- **Technical Chips (Tags):** Small, monospaced text labels for tools (e.g., Python, AWS, Spark). Use a dark background (`#0f172a`) and primary color text with no border.
- **Input Fields:** Darker than the card background to create an "inset" look. Use the primary color for the cursor and the focus border.
- **Pipeline Visualizer:** A custom component representing data flow. Use 1px primary-colored lines connecting small nodes to represent ETL processes.
- **Code Blocks:** Syntax-highlighted containers using a "Monokai-adjacent" theme that leverages the system's Primary and Secondary colors.