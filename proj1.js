window.addEventListener('scroll', () => {
  const wrapper = document.getElementById('progress-wrapper');
  const contactSection = document.getElementById('contact'); // Get the "Contact Me" section
  const trigger = window.innerHeight * 0.70; // Adjust trigger point
  const bottom_trigger = contactSection.getBoundingClientRect().top + window.scrollY ; // Position of "Contact Me"

    if (window.scrollY < trigger) {
      wrapper.classList.remove('progress-fixed');
      wrapper.classList.add('progress-absolute');
      wrapper.style.top = '80%'; // First absolute position
    } else if (window.scrollY + window.innerHeight > bottom_trigger) {
      wrapper.classList.remove('progress-fixed');
      wrapper.classList.add('progress-absolute');
      wrapper.style.top = String(bottom_trigger - window.innerHeight + 85); // Second absolute position
    } else {
      wrapper.classList.remove('progress-absolute');
      wrapper.classList.add('progress-fixed');
      wrapper.style.top = ''; // Reset top for fixed positioning
    }

  
    // Scroll % logic
    const docHeight = document.body.scrollHeight - window.innerHeight;
    const scrollPercent = (window.scrollY / docHeight) * 100;
    const progressBar = document.querySelector('.progress-bar');
    progressBar.style.height = `${scrollPercent}%`;
  });

  


 
