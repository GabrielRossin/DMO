--REGISTRO
DECLARE
    TYPE emp_registro IS RECORD
    (
            last_name VARCHAR2(25),
            job_id VARCHAR2(10),
            salary NUMBER(8,2)
    );
    
    dados_emp emp_registro;
    
BEGIN
    select last_name , job_id , salary into dados_emp
    from employees
    where employee_id = 100;
    
    DBMS_OUTPUT.PUT_LINE(
                                                            'EMPREGADO:' || dados_emp.last_name || 
                                                            'FUNÇÃO:' || dados_emp.job_id ||
                                                            'SALÁRIO:'|| dados_emp.salary
                                                        );
  END;
  /
  
--%ROWTYPE

DECLARE

    emp_rec  employees  %rowtype;
    emp_id  employees.employee_id %TYPE := 100;

BEGIN

    select * into emp_rec from employees
    where employee_id = emp_id;
    
    dbms_output.put_line (
                                            'Empregado: '|| emp_rec.employee_id ||
                                            ' Nome: ' || emp_rec.last_name ||
                                            ' Data de contratação: ' || emp_rec.hire_date ||
                                            ' Salário: ' || emp_rec.salary || 
                                            ' Departamento: ' || emp_rec.department_id
                                        );
END;
/

-- IF/ELSEIF/ELSE
    
DECLARE 
    nota CHAR(1) := UPPER('&nota');
    resultado VARCHAR2(20);
BEGIN

        IF nota = 'A' THEN
            resultado := 'Excelente';
            
       ELSIF nota = 'B' THEN
            resultado := 'MUITO BOM';
            
       ELSIF nota = 'C' THEN
            resultado := 'BOM';
            
        ELSIF nota in ('D' , 'E') THEN
            resultado := 'REPROVADO';
            
        ELSE
            resultado :=  'NOTA INVÁLIDA';
            
        END IF;
        
        dbms_output.put_line('Nota: ' || nota || 'Resultado: ' || resultado);

END;
/
    
        
     
     
     
     
     
     
END;
    
    
    
    
    
    
