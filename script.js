// Scroll progress bar
window.addEventListener('scroll', () => {
    const wrapper = document.getElementById('progress-wrapper');
    if (!wrapper) return;

    const footer = document.querySelector('footer');
    const trigger = window.innerHeight * 0.70;
    const bottomTrigger = footer
        ? footer.getBoundingClientRect().top + window.scrollY
        : document.body.scrollHeight - window.innerHeight;

    if (window.scrollY < trigger) {
        wrapper.classList.remove('progress-fixed');
        wrapper.classList.add('progress-absolute');
        wrapper.style.top = '80%';
    } else if (window.scrollY + window.innerHeight > bottomTrigger) {
        wrapper.classList.remove('progress-fixed');
        wrapper.classList.add('progress-absolute');
        wrapper.style.top = String(bottomTrigger - window.innerHeight + 85) + 'px';
    } else {
        wrapper.classList.remove('progress-absolute');
        wrapper.classList.add('progress-fixed');
        wrapper.style.top = '';
    }

    const docHeight = document.body.scrollHeight - window.innerHeight;
    const progressBar = document.querySelector('.progress-bar');
    if (progressBar) {
        progressBar.style.height = `${(window.scrollY / docHeight) * 100}%`;
    }
});

// Smooth scroll for nav links
document.addEventListener('DOMContentLoaded', () => {
    document.querySelectorAll('a[href^="#"]').forEach(link => {
        link.addEventListener('click', e => {
            const href = link.getAttribute('href');
            if (href && href.startsWith('#') && href.length > 1) {
                e.preventDefault();
                const target = document.getElementById(href.substring(1));
                if (target) target.scrollIntoView({ behavior: 'smooth', block: 'start' });
            }
        });
    });
});
