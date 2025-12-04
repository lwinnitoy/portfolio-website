# Adding New Projects to Your Portfolio

## Quick Guide

To add a new project to your portfolio, follow these steps:

### 1. Add Project Image
- Place your project screenshot/image in the `images/` folder
- Use a descriptive filename (e.g., `my-new-project.png`)
- Recommended size: 1200x800px or similar aspect ratio

### 2. Copy This HTML Template

Add this code inside the `<div class="projects-container">` section in `index.html`:

```html
<article class="project-card">
    <div class="project-image">
        <img src="images/YOUR-IMAGE-NAME.png" alt="Project Name Screenshot">
    </div>
    <div class="project-content">
        <h3>Your Project Title</h3>
        <p class="project-description">A brief description of what your project does and why it's interesting. Focus on the problem it solves and its impact.</p>
        <div class="tech-stack">
            <span class="tech-tag">Python</span>
            <span class="tech-tag">Flask</span>
            <span class="tech-tag">PostgreSQL</span>
            <!-- Add more tech tags as needed -->
        </div>
        <ul class="project-highlights">
            <li>First key achievement or feature</li>
            <li>Second key achievement or feature</li>
            <li>Third key achievement or feature</li>
            <li>Fourth key achievement or feature (optional)</li>
        </ul>
        <div class="project-links">
            <a class="button" href="https://github.com/yourusername/your-repo" target="_blank" rel="noopener noreferrer">View on GitHub</a>
            <!-- Optional: Add a live demo link -->
            <!-- <a class="button" href="https://your-demo-url.com" target="_blank" rel="noopener noreferrer">Live Demo</a> -->
        </div>
    </div>
</article>
```

### 3. Customize the Template

Replace the following:
- `YOUR-IMAGE-NAME.png` → your actual image filename
- `Your Project Title` → your project name
- Project description → 2-3 sentences about your project
- Tech stack tags → the technologies you used
- Project highlights → 3-4 bullet points about achievements
- GitHub link → your actual repository URL
- Add a live demo link if available

### 4. Project Order

Projects will appear in the order they're listed in the HTML. Place more impressive or recent projects at the top.

### 5. Tech Stack Tags

Use consistent naming for technologies:
- Languages: `Python`, `Java`, `JavaScript`, `TypeScript`, `C++`
- Frameworks: `React`, `Flask`, `Django`, `Spring Boot`, `Node.js`
- Data: `SQL`, `PostgreSQL`, `MongoDB`, `Redis`, `Pandas`
- Tools: `Docker`, `AWS`, `Git`, `Jenkins`, `Kubernetes`

### 6. Alternating Layout

The CSS automatically alternates the image position (left/right) for visual interest. Odd-numbered projects have images on the left, even-numbered on the right.

## Tips for Great Project Descriptions

✅ **Do:**
- Focus on impact and results
- Use metrics when possible (e.g., "Reduced processing time by 40%")
- Highlight technical challenges you solved
- Keep descriptions concise (2-3 sentences)

❌ **Don't:**
- Write generic descriptions
- Use overly technical jargon
- Make it too long
- Forget to proofread

## Example Project Entry

Here's a complete example:

```html
<article class="project-card">
    <div class="project-image">
        <img src="images/weather-dashboard.png" alt="Real-time Weather Dashboard">
    </div>
    <div class="project-content">
        <h3>Real-Time Weather Analytics Dashboard</h3>
        <p class="project-description">A full-stack web application that aggregates weather data from multiple APIs and displays real-time analytics with interactive visualizations. Handles 10,000+ API calls per day with caching optimization.</p>
        <div class="tech-stack">
            <span class="tech-tag">Python</span>
            <span class="tech-tag">Flask</span>
            <span class="tech-tag">React</span>
            <span class="tech-tag">PostgreSQL</span>
            <span class="tech-tag">Redis</span>
            <span class="tech-tag">Chart.js</span>
        </div>
        <ul class="project-highlights">
            <li>Built RESTful API with Flask to aggregate data from 5 weather services</li>
            <li>Implemented Redis caching to reduce API costs by 60%</li>
            <li>Designed responsive React frontend with real-time data updates</li>
            <li>Achieved 99.9% uptime over 6-month deployment period</li>
        </ul>
        <div class="project-links">
            <a class="button" href="https://github.com/yourusername/weather-dashboard" target="_blank" rel="noopener noreferrer">View on GitHub</a>
            <a class="button" href="https://weather-demo.com" target="_blank" rel="noopener noreferrer">Live Demo</a>
        </div>
    </div>
</article>
```

## Need Help?

If you run into issues, check:
1. Image paths are correct (case-sensitive on some servers)
2. All HTML tags are properly closed
3. Tech tags have consistent styling
4. Links are working and have `target="_blank"` for external sites
