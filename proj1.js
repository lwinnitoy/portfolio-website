// Progress Bar Scroll Indicator
window.addEventListener('scroll', () => {
    const wrapper = document.getElementById('progress-wrapper');
    const contactSection = document.getElementById('contact');
    
    if (!wrapper || !contactSection) return;
    
    const trigger = window.innerHeight * 0.70;
    const bottomTrigger = contactSection.getBoundingClientRect().top + window.scrollY;

    // Position logic for progress bar
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

    // Update progress bar height based on scroll
    const docHeight = document.body.scrollHeight - window.innerHeight;
    const scrollPercent = (window.scrollY / docHeight) * 100;
    const progressBar = document.querySelector('.progress-bar');
    
    if (progressBar) {
        progressBar.style.height = `${scrollPercent}%`;
    }
});

// Smooth scroll for navigation links
document.addEventListener('DOMContentLoaded', () => {
    const navLinks = document.querySelectorAll('a[href^="#"]');
    
    navLinks.forEach(link => {
        link.addEventListener('click', (e) => {
            const href = link.getAttribute('href');
            
            // Only handle internal links
            if (href && href.startsWith('#') && href.length > 1) {
                e.preventDefault();
                const targetId = href.substring(1);
                const targetElement = document.getElementById(targetId);
                
                if (targetElement) {
                    targetElement.scrollIntoView({
                        behavior: 'smooth',
                        block: 'start'
                    });
                }
            }
        });
    });
});

 
